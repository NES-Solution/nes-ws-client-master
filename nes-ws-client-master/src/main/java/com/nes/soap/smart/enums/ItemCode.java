package com.nes.soap.smart.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ItemCode {
    W("W00", "한우"),
    D("D00", "낙농"),
    P("P00", "양돈"),
    H("H00", "양계"),
    C("C00", "공통");

    private final String name;
    private final String description;
}
