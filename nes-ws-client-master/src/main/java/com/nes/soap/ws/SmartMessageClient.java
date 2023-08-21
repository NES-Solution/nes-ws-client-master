package com.nes.soap.ws;

import com.nes.soap.wsdl.ObjectFactory;
import com.nes.soap.wsdl.SendSmartMessage;
import com.nes.soap.wsdl.SendSmartMessageResponse;
import com.nes.soap.wsdl.SmartMessage;
import com.nes.soap.config.SmartMessageConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

@Slf 4j
public class SmartMessageClient extends WebServiceGatewaySupport {
    @Autowired
    private ObjectFactory objectFactory;

    public static final String OP_URI = SmartMessageConfiguration.SERVICE_URI + "/SmartStockService";

    public SendSmartMessageResponse sendSmartMessage(SmartMessage smartMessage) {
        SendSmartMessage request = objectFactory.createSendSmartMessage();
        request.setArg0(smartMessage);

        log.info("to Send : {}", request);

        WebServiceTemplate template = getWebServiceTemplate();
        JAXBElement<SendSmartMessageResponse> e = (JAXBElement<SendSmartMessageResponse>)
                template.marshalSendAndReceive(OP_URI, request);
        if (e.isNil()) {
            log.error("템플릿 요청 NULL");
            return null;
        }

        return e.getValue();
    }
}
