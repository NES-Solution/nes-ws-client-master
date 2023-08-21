package com.nes.soap.config;

import com.nes.soap.smart.enums.EquipmentCode;
import com.nes.soap.smart.enums.ItemCode;
import com.nes.soap.ws.SmartMessageClient;
import com.nes.soap.wsdl.ObjectFactory;
import com.nes.soap.wsdl.SendSmartMessageResponse;
import com.nes.soap.wsdl.SmartItem;
import com.nes.soap.wsdl.SmartMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class SchedulerConfig {
    private final SmartMessageClient smartMessageClient;
    private final ObjectFactory objectFactory;

    public SchedulerConfig(SmartMessageClient smartMessageClient, ObjectFactory objectFactory) {
        this.smartMessageClient = smartMessageClient;
        this.objectFactory = objectFactory;
    }

    @Scheduled(initialDelay = 1000, fixedDelay = 30000)
    public void fixedDelayJob() {
        log.info("스케줄러 도는 중...");

        SmartItem smartItem = SmartItem.builder()
                .eqpmnCode(EquipmentCode.ES11.getName())
                .eqpmnEsntlSn("")
                .eqpmnNo("")
                .itemCode(ItemCode.C.getName())
                .lsindRegistNo("")
                .makrId("")
                .mesureDt("")
                .mesureVal01("")
                .mesureVal03("")
                .mesureVal04("")
                .mesureVal05("")
                .mesureVal06("")
                .mesureVal07("")
                .mesureVal08("")
                .mesureVal09("")
                .mesureVal10("")
                .mesureVal11("")
                .mesureVal12("")
                .mesureVal13("")
                .mesureVal14("")
                .mesureVal15("")
                .build();

        SmartMessage smartMessage = objectFactory.createSmartMessage();
        List<SmartItem> smartItemList = smartMessage.getSmartItemList();
        smartItemList.add(smartItem);

        SendSmartMessageResponse response = smartMessageClient.sendSmartMessage(smartMessage);
        log.info("response : {}", response);
    }
}

