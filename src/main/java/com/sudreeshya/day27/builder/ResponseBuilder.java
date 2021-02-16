package com.sudreeshya.day27.builder;

import com.sudreeshya.day27.dto.GenericResponse;

/**
 * @author Manjit Shakya
 * @email manjit.shakya@f1soft.com
 */
public class ResponseBuilder {

    public static GenericResponse buildSuccess(String respDesc, Object data) {
        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setData(data);
        genericResponse.setResultDescription(respDesc);
        genericResponse.setStatus(true);
        return genericResponse;
    }

    public static GenericResponse buildFailure(String respDesc) {
        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setData(null);
        genericResponse.setResultDescription(respDesc);
        genericResponse.setStatus(false);
        return genericResponse;
    }
}
