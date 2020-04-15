package com.followers.toplibrary.bean;

public class RateBean {


    /**
     * code : 200
     * message : Rate successful
     * status : true
     * data : {"id":1,"created_at":"2020-04-15T20:42:13.581419+08:00","update_at":"2020-04-15T20:42:13.581419+08:00","user_pk":"123123","user_name":"test","rewar_coins":50}
     */

    private int code;
    private String message;
    private boolean status;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * created_at : 2020-04-15T20:42:13.581419+08:00
         * update_at : 2020-04-15T20:42:13.581419+08:00
         * user_pk : 123123
         * user_name : test
         * rewar_coins : 50
         */

        private int id;
        private String created_at;
        private String update_at;
        private String user_pk;
        private String user_name;
        private int rewar_coins;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdate_at() {
            return update_at;
        }

        public void setUpdate_at(String update_at) {
            this.update_at = update_at;
        }

        public String getUser_pk() {
            return user_pk;
        }

        public void setUser_pk(String user_pk) {
            this.user_pk = user_pk;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public int getRewar_coins() {
            return rewar_coins;
        }

        public void setRewar_coins(int rewar_coins) {
            this.rewar_coins = rewar_coins;
        }
    }
}
