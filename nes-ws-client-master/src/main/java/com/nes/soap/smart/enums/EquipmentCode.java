package com.nes.soap.smart.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EquipmentCode {
    ES01("ES01", "온도"),
    ES02("ES02", "습도"),
    ES03("ES03", "CO2"),
    ES04("ES04", "암모니아"),
    ES05("ES05", "조도"),
    ES06("ES06", "풍향"),
    ES07("ES07", "풍속"),
    ES08("ES08", "강우"),
    ES09("ES09", "음압"),
    ES10("ES10", "이산화황"),
    ES11("ES11", "복합악취"),
    ES12("ES12", "황화수소"),
    ES13("ES13", "VOC"),
    EC01("EC01", "송풍팬"),
    EC02("EC02", "배기팬"),
    EC03("EC03", "입기팬"),
    EC04("EC04", "원치커튼"),
    EC05("EC05", "쿨링패드"),
    EC06("EC06", "보온등"),
    EC07("EC07", "온풍기"),
    EC08("EC08", "냉방기"),
    EC09("EC09", "안개분무기"),
    EC10("EC10", "차단방역기"),
    PC01("PC01", "출하돈선별기"),
    PC02("PC02", "난선별기"),
    PC03("PC03", "착유기"),
    PC04("PC04", "로봇착유기"),
    PC05("PC05", "체중측정기(한우, 낙농)"),
    PC06("PC06", "체중측정기(양돈)"),
    PC07("PC07", "체중측정기(양계)"),
    PC08("PC08", "원유냉각기"),
    PC09("PC09", "계란포장기기"),
    BI01("BI01", "발정탐지기"),
    BI02("BI02", "발정체크기"),
    BI03("BI03", "분만알리미"),
    AF01("AF01", "사료빈관리기"),
    AF02("AF02", "음수관리기"),
    AF05("AF05", "자동급이기"),
    AF06("AF06", "임신돈 군사급이기"),
    AF07("AF07", "임신돈 자동급이기"),
    AF08("AF08", "포유모돈 자동급이기"),
    AF09("AF09", "사료믹스급이기"),
    AF10("AF10", "컴퓨터액상급이기"),
    AF11("AF11", "농후사료 자동급이기 (군사형)"),
    AF12("AF12", "농후사료 자동급이기 (일반형)"),
    AF13("AF13", "TMR급이기(배합기)"),
    AF14("AF14", "송아지포유기"),
    AF15("AF15", "조사료분석기"),
    AF16("AF16", "착유군사급이기"),
    VI01("VI01", "CCTV(고정형)"),
    VI02("VI02", "CCTV(회전형)");

    private final String name;
    private final String description;
}
