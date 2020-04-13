package com.followers.toplibrary.bean;

import java.util.List;

public class RankFollowersBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":2,"UserPk":"123123","UserName":"test","Url":"www.baidu.com","Img":"www.baidu.com","TotalViewCount":1,"Date":"202016","CreatedAt":"2020-04-13T20:06:56+08:00"},{"id":3,"UserPk":"1234","UserName":"chenjia1992","Url":"sdhjkwer234jksdf","Img":"https://baidu.com","TotalViewCount":0,"Date":"202016","CreatedAt":"2020-04-13T20:06:56+08:00"}]
     */

    private int code;
    private String message;
    private boolean status;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 2
         * UserPk : 123123
         * UserName : test
         * Url : www.baidu.com
         * Img : www.baidu.com
         * TotalViewCount : 1
         * Date : 202016
         * CreatedAt : 2020-04-13T20:06:56+08:00
         */

        private int id;
        private String UserPk;
        private String UserName;
        private String Url;
        private String Img;
        private int TotalViewCount;
        private String Date;
        private String CreatedAt;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserPk() {
            return UserPk;
        }

        public void setUserPk(String UserPk) {
            this.UserPk = UserPk;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getUrl() {
            return Url;
        }

        public void setUrl(String Url) {
            this.Url = Url;
        }

        public String getImg() {
            return Img;
        }

        public void setImg(String Img) {
            this.Img = Img;
        }

        public int getTotalViewCount() {
            return TotalViewCount;
        }

        public void setTotalViewCount(int TotalViewCount) {
            this.TotalViewCount = TotalViewCount;
        }

        public String getDate() {
            return Date;
        }

        public void setDate(String Date) {
            this.Date = Date;
        }

        public String getCreatedAt() {
            return CreatedAt;
        }

        public void setCreatedAt(String CreatedAt) {
            this.CreatedAt = CreatedAt;
        }
    }
}
