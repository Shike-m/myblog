package com.ms.myblog.util;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/*
For Exceptions from domain validation
 */
class ConstraintViolationExceptionHandler {
    public static String getMessage(ConstraintViolationException e){
        List<String> msgList = new ArrayList<>();
        for(ConstraintViolation<?> constraintViolation:e.getConstraintViolations()){
            msgList.add(constraintViolation.getMessage());
        }
        String messages= org.thymeleaf.util.StringUtils.join(msgList.toArray(),";");
        return messages;
    }
}
