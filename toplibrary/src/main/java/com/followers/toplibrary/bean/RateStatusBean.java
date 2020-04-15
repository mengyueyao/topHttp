package com.followers.toplibrary.bean;

public class RateStatusBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : true
     */

    private int code;
    private String message;
    private boolean status;
    private boolean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isData() {
        return data;
    }

    public void setData(boolean data) {
        this.data = data;
    }
}


