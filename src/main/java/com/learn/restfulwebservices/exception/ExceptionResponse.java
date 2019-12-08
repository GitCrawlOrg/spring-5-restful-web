package com.learn.restfulwebservices.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by nichaurasia on Sunday, December/08/2019 at 12:13 AM
 */

@Getter
@Setter
@AllArgsConstructor
public class ExceptionResponse {
    private Date timeStamp;
    private String message;
    private String details;
}
