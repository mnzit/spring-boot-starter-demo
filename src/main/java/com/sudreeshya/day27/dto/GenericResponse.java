package com.sudreeshya.day27.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Manjit Shakya
 * @email manjit.shakya@f1soft.com
 */
@Getter
@Setter
@NoArgsConstructor
public class GenericResponse implements Serializable {
    private Boolean status;
    private String resultDescription;
    private Object data;

}
