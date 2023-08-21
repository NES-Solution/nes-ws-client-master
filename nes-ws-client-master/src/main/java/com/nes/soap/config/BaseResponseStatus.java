package com.nes.soap.config;

import lombok.Getter;
import lombok.ToString;

/**
 * 에러 코드 관리
 */
@Getter
@ToString
public enum BaseResponseStatus {
    // 1000 : 요청 성공
    SUCCESS(true, 1000, "요청에 성공하였습니다."),
    USER_LOGIN_SUCCESS(true, 1010, "로그인이 성공적으로 완료 되었습니다."),
    USER_REGIST_SUCCESS(true, 1011, "회원가입이 성공적으로 완료 되었습니다."),
    PLC_DELETE_SUCCESS(true, 1020, "PLC 정보가 성공적으로 삭제 되었습니다."),
    FCM_TOKEN_REGIST_SUCCESS(true, 1030, "FCM 토큰 등록 또는 업데이트가 성공적으로 완료 되었습니다."),

    // 2000 : Request 오류
    REQUEST_ERROR(false, 2000, "입력값을 확인해주세요."),
    VALIDATION_ERROR(false, 2001, "입력값 검증에 실패하였습니다."),
    EMAIL_ALREADY_USE(false, 2010, "이미 사용중인 이메일입니다."),
    NAME_ALREADY_USE(false, 2011, "이미 사용중인 유저네임입니다."),
    PASSWORD_NOT_MATCH(false, 2012, "입력한 비밀번호가 서로 다릅니다"),

    // 3000 : Response 오류
    RESPONSE_ERROR(false, 3000, "값을 불러오는데 실패하였습니다."),
    FCM_TOKEN_NOT_FOUND(false, 3010, "해당 유저네임에 해당하는 fcm 기기 등록 토큰을 찾을 수 없습니다."),
    USER_BY_NAME_NOT_FOUND(false, 3020, "해당 유저네임에 해당하는 유저를 찾을 수 없습니다."),
    ROLE_BY_NAME_NOT_FOUND(false, 3021, "입력값에 해당하는 ROLE을 찾을 수 없습니다."),
    PLC_BY_SERIAL_NOT_FOUND(false, 3030, "해당 시리얼 넘버로 plc 정보를 찾을 수 없습니다."),
    EQUIP_BY_SERIAL_NOT_FOUND(false, 3040, "해당 시리얼 넘버에 해당하는 기기를 찾을 수 없습니다."),
    EQUIP_BY_ID_NOT_FOUND(false, 3041, "해당 기기 ID 에 해당하는 기기를 찾을 수 없습니다."),
    EQUIP_FROM_NOT_FOUND(false, 3042, "해당 시리얼 넘버에 해당하는 원래(From) 기기를 찾을 수 없습니다."),
    EQUIP_TO_NOT_FOUND(false, 3043, "해당 시리얼 넘버에 해당하는 바꾸려는(To) 기기를 찾을 수 없습니다."),
    EQUIP_BY_COMPANY_NOT_FOUND(false, 3044, "해당 회사로 기기를 찾을 수 없습니다."),
    HEALTH_NOT_FOUND(false, 3050, "해당 기기 시리얼넘버에 해당하는 기기 정상 여부 기록을 찾을 수 없습니다."),
    EQUIP_USER_MAP_EXIST(false, 3060, "해당 시리얼 넘버로 등록된 매핑이 이미 존재합니다."),
    COMMAND_NOT_REMOTE(false, 3071, "해당 시리얼 넘버에 해당하는 기기가 리모트모드 상태가 아닙니다."),
    EXCEL_FILE_NOT_FOUND(false, 3080, "저장하려고 하는 엑셀 파일 이름을 찾을 수 없습니다."),
    EQUIP_USER_NOT_FOUND(false, 3090, "해당 기기 시리얼넘버에 해당하는 기기-유저 매핑을 찾을 수 없습니다."),
    NOTICE_NOT_FOUND(false, 3100, "해당 아이디에 해당하는 공지사항을 찾을 수 없습니다."),
    USER_ID_FIND_FAIL(false, 3200, "해당 이름과 전화번호로 아이디를 찾을 수 없습니다."),
    USER_PASSWORD_FIND_FAIL(false, 3201, "해당 아이디 & 이름 & 전화번호로 비밀번호를 찾을 수 없습니다."),
    USER_PASSWORD_FIND_NOT_MATCH(false, 3202, "변경하려는 비밀번호가 서로 일치하지 않습니다."),
    COMPANY_NOT_FOUND(false, 3210, "해당 ID에 해당하는 회사를 찾을 수 없습니다."),

    // 4000 : Database 오류
    SERVER_ERROR(false, 4000, "서버와의 통신에 실패하였습니다."),
    DATABASE_ERROR(false, 4001, "데이터베이스 연결에 실패하였습니다."),

    // 5000 : Authentication 오류
    JWT_AUTHENTICATION_ERROR(false, 5000, "JWT 인증 오류가 발생하였습니다."),
    JWT_REFRESH_TOKEN_ERROR(false, 5001, "JWT refresh 토큰 인증 오류가 발생하였습니다."),
    ACCESS_DENIED_ERROR(false, 5010, "엑세스가 거부 되었습니다."),
    USER_LOGIN_FAIL(false, 5020, "아이디 또는 비밀번호를 다시 확인해주세요."),

    // 6000 : ETC
    UNKNOWN_ERROR(false, 6000, "알려지지 않은 에러가 발생 했습니다."),
    METHOD_NOT_SUPPORTED_ERROR(false, 6001, "지원되지 않는 http 메소드 에러가 발생했습니다."),
    HANDLER_MAPPING_ERROR(false, 6002, "지원되지 주소로의 접속 시도 에러가 발생했습니다.");

    private final boolean isSuccess;
    private final int code;
    private final String message;

    BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}