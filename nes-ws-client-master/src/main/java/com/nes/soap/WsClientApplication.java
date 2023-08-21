package com.nes.soap;

import com.sun.org.apache.xalan.internal.utils.ObjectFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@SpringBootApplication
@EnableScheduling
public class WsClientApplication {
    @Autowired
    private ObjectFactory objectFactory;

    public static void main(String[] args) {
        SpringApplication.run(WsClientApplication.class, args);
    }

//    @Bean
//    CommandLineRunner lookup(SmartMessageClient smartMessageClient) {
//        return args -> {
//            // mesure는 값이 없더라도 필수적으로 들어가야 함
//            SmartItem smartItem = SmartItem.builder()
//                    .eqpmnCode(EquipmentCode.ES11.getName())
//                    .eqpmnEsntlSn("")
//                    .eqpmnNo("")
//                    .itemCode(ItemCode.C.getName())
//                    .lsindRegistNo("")
//                    .makrId("")
//                    .mesureDt("")
//                    .mesureVal01("")
//                    .mesureVal03("")
//                    .mesureVal04("")
//                    .mesureVal05("")
//                    .mesureVal06("")
//                    .mesureVal07("")
//                    .mesureVal08("")
//                    .mesureVal09("")
//                    .mesureVal10("")
//                    .mesureVal11("")
//                    .mesureVal12("")
//                    .mesureVal13("")
//                    .mesureVal14("")
//                    .mesureVal15("")
//                    .build();
//
//            SmartMessage smartMessage = objectFactory.createSmartMessage();
//            List<SmartItem> smartItemList = smartMessage.getSmartItemList();
//            smartItemList.add(smartItem);
//
//            SendSmartMessageResponse response = smartMessageClient.sendSmartMessage(smartMessage);
//            log.info("response : {}", response);
//
////            throw new RuntimeException();
//        };
//    }
}
