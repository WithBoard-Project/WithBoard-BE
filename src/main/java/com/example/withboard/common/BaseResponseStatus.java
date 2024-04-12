package com.example.withboard.common;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BaseResponseStatus {

    SUCCESS(true, 00, "Success"),
    SUCCESS_WITH_DATA(true, 01, "Success with return"),
    FAILURE(false, 99, "Fail"),

    /**
     * Client Side
     */
    BAD_REQUEST(false, 01, "잘못된 요청입니다."),
    BAD_Id(false, 02, "Bad Id, Id 값이 존재하지 않습니다."),
    ARGUMENT_NOT_VALID(false, 03, "유효성 검증에 실패하였습니다."),
    JWT_NOT_VALID(false, 04, "토큰 검증에 실패하였습니다."),

    /**
     * Server Side
     */
    NOT_IMPLEMENTED(false, 11, "Not Implemented, 해당 기능을 지원하지 않습니다."),
    EMPTY_RESOURCE(false, 12, "Result Empty, 값이 비어있습니다.");

    private final boolean isSuccess;
    private final int code;
    private final String message;
}
