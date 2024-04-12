package com.example.withboard;

import com.example.withboard.config.BaseException;
import com.example.withboard.common.dto.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BaseException.class)
    public ResponseEntity<Object> ExceptionHandler(BaseException e) {
        //log.error("MethodArgumentNotValidException", e);
        return new ResponseEntity<>(new BaseResponse<>(e.getStatus()),HttpStatus.NOT_FOUND);
    }

    //예외 전역 처리
    /*TODO 로그 파일 생성하기*/
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(value = Exception.class)
//    public BaseResponse ExceptionHandler(Exception e) {
//        log.error("MethodArgumentNotValidException", e);
//        return new BaseResponse(GlOBAL_EXCEPTION);
//    }



}
