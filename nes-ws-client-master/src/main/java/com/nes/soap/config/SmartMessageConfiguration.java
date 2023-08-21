package com.nes.soap.config;

import com.nes.soap.ws.SmartMessageClient;
import com.nes.soap.wsdl.ObjectFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SmartMessageConfiguration {

    public static final String WSDL_PATH = "com.nes.soap.wsdl";
    public static final String SERVICE_URI = "https://www.smartfarmkorea.net/stockWs/webservices";

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath(WSDL_PATH);
        return marshaller;
    }

    @Bean
    public SmartMessageClient smartMessageClient(Jaxb2Marshaller marshaller) {
        SmartMessageClient client = new SmartMessageClient();
        client.setDefaultUri(SERVICE_URI);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public ObjectFactory objectFactory() {
        return new ObjectFactory();
    }
}
