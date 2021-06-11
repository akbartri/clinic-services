package com.clinic.cloud.clinicservices.model.dto;

import java.io.Serializable;

public class ResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String status;
    private String message;
    private Object contents;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContents() {
        return contents;
    }

    public void setContents(Object contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", contents=" + contents +
                '}';
    }
}
