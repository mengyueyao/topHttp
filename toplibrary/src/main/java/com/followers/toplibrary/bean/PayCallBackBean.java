package com.followers.toplibrary.bean;

public class PayCallBackBean {


    /**
     * code : 200
     * message : Payment verification failed
     * status : false
     * data : null
     */

    private int code;
    private String message;
    private boolean status;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

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
}
