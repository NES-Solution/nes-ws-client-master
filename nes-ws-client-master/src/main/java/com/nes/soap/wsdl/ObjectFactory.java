package com.nes.soap.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.nes.soap.wsdl package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _SendSmartMessage_QNAME = new QName("http://smart.webservice.itis.epis.org/", "sendSmartMessage");
    private static final QName _SendSmartMessageResponse_QNAME = new QName("http://smart.webservice.itis.epis.org/", "sendSmartMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nes.soap.wsdl
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendSmartMessage }
     */
    public SendSmartMessage createSendSmartMessage() {
        return new SendSmartMessage();
    }

    /**
     * Create an instance of {@link SendSmartMessageResponse }
     */
    public SendSmartMessageResponse createSendSmartMessageResponse() {
        return new SendSmartMessageResponse();
    }

    /**
     * Create an instance of {@link SmartMessage }
     */
    public SmartMessage createSmartMessage() {
        return new SmartMessage();
    }

    /**
     * Create an instance of {@link SmartItem }
     */
    public SmartItem createSmartItem() {
        return new SmartItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmartMessage }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SendSmartMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://smart.webservice.itis.epis.org/", name = "sendSmartMessage")
    public JAXBElement<SendSmartMessage> createSendSmartMessage(SendSmartMessage value) {
        return new JAXBElement<>(_SendSmartMessage_QNAME, SendSmartMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmartMessageResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SendSmartMessageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://smart.webservice.itis.epis.org/", name = "sendSmartMessageResponse")
    public JAXBElement<SendSmartMessageResponse> createSendSmartMessageResponse(SendSmartMessageResponse value) {
        return new JAXBElement<>(_SendSmartMessageResponse_QNAME, SendSmartMessageResponse.class, null, value);
    }

}
