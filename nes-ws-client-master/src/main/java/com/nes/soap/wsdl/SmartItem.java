package com.nes.soap.wsdl;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "smartItem", propOrder = {
        "eqpmnCode",
        "eqpmnEsntlSn",
        "eqpmnNo",
        "itemCode",
        "lsindRegistNo",
        "makrId",
        "mesureDt",
        "mesureVal01",
        "mesureVal02",
        "mesureVal03",
        "mesureVal04",
        "mesureVal05",
        "mesureVal06",
        "mesureVal07",
        "mesureVal08",
        "mesureVal09",
        "mesureVal10",
        "mesureVal11",
        "mesureVal12",
        "mesureVal13",
        "mesureVal14",
        "mesureVal15",
        "roomDtlNo",
        "roomNo",
        "stallNo",
        "stallTyCode"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SmartItem {
    protected String eqpmnCode;
    protected String eqpmnEsntlSn;
    protected String eqpmnNo;
    protected String itemCode;
    protected String lsindRegistNo;
    protected String makrId;
    protected String mesureDt;
    protected String mesureVal01;
    protected String mesureVal02;
    protected String mesureVal03;
    protected String mesureVal04;
    protected String mesureVal05;
    protected String mesureVal06;
    protected String mesureVal07;
    protected String mesureVal08;
    protected String mesureVal09;
    protected String mesureVal10;
    protected String mesureVal11;
    protected String mesureVal12;
    protected String mesureVal13;
    protected String mesureVal14;
    protected String mesureVal15;
    protected String roomDtlNo;
    protected String roomNo;
    protected String stallNo;
    protected String stallTyCode;
}
