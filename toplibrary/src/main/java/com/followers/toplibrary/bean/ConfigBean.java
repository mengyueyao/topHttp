package com.followers.toplibrary.bean;

public class ConfigBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"id":1,"created_at":"2020-04-11T18:31:01+08:00","update_at":"2020-04-11T18:31:04+08:00","title":"","description":"","config_detail":"{\"user_info\":\"chenjia\",\"age\":12}","is_balck_list":false}
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
         * created_at : 2020-04-11T18:31:01+08:00
         * update_at : 2020-04-11T18:31:04+08:00
         * title :
         * description :
         * config_detail : {"user_info":"chenjia","age":12}
         * is_balck_list : false
         */

        private int id;
        private String created_at;
        private String update_at;
        private String title;
        private String description;
        private String config_detail;
        private boolean is_balck_list;

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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getConfig_detail() {
            return config_detail;
        }

        public void setConfig_detail(String config_detail) {
            this.config_detail = config_detail;
        }

        public boolean isIs_balck_list() {
            return is_balck_list;
        }

        public void setIs_balck_list(boolean is_balck_list) {
            this.is_balck_list = is_balck_list;
        }
    }
}
