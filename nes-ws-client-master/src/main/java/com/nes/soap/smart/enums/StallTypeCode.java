package com.nes.soap.smart.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StallTypeCode {
    SC01("SC01", "축사 외부"),
    SW01("SW01", "우사(한우)"),
    SW02("SW02", "착유장(한우)"),
    SD01("SD01", "우사(낙농)"),
    SD02("SD02", "착유장(낙농)"),
    SP01("SP01", "후보돈사"),
    SP02("SP02", "임신사"),
    SP03("SP03", "분만사"),
    SP04("SP04", "베이비하우스"),
    SP05("SP05", "자돈사"),
    SP06("SP06", "육성사"),
    SP07("SP07", "비육사"),
    SP08("SP08", "검정사"),
    SH01("SH01", "산란육성계사"),
    SH02("SH02", "산란계사"),
    SH03("SH03", "종계육성계사"),
    SH04("SH04", "종계사"),
    SH05("SH05", "육계사"),
    SH06("SH06", "선별장"),
    SH07("SH07", "계사(공통)");

    private final String name;
    private final String description;
}
