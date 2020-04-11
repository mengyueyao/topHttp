package com.followers.toplibrary.bean;

import java.util.List;

public class RankingLikesBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":1,"UserPk":"123456","UserName":"chenjia1993","Url":"sdhjkwer234jksdf","Img":"https://baidu.com","Cover":"","TotalViewCount":45456,"Date":"202015","CreatedAt":"2020-04-10T20:49:49+08:00"},{"id":2,"UserPk":"1234","UserName":"chenjia1992","Url":"sdhjkwer234jksdf","Img":"https://baidu.com","Cover":"http://baidu.com","TotalViewCount":13321,"Date":"202015","CreatedAt":"2020-04-10T20:49:49+08:00"},{"id":3,"UserPk":"12345","UserName":"chenjia1993","Url":"sdhjkwer234jksdf","Img":"https://baidu.com","Cover":"http://baidu.com","TotalViewCount":9844,"Date":"202015","CreatedAt":"2020-04-10T20:49:49+08:00"},{"id":4,"UserPk":"123123","UserName":"test","Url":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1298196854,4096730639&fm=26&gp=0.jpg","Img":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1298196854,4096730639&fm=26&gp=0.jpg","Cover":"http://image.biaobaiju.com/uploads/20180803/23/1533309822-GCcDphRmqw.jpg","TotalViewCount":0,"Date":"202015","CreatedAt":"2020-04-10T20:49:49+08:00"}]
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
         * id : 1
         * UserPk : 123456
         * UserName : chenjia1993
         * Url : sdhjkwer234jksdf
         * Img : https://baidu.com
         * Cover :
         * TotalViewCount : 45456
         * Date : 202015
         * CreatedAt : 2020-04-10T20:49:49+08:00
         */

        private int id;
        private String UserPk;
        private String UserName;
        private String Url;
        private String Img;
        private String Cover;
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

        public String getCover() {
            return Cover;
        }

        public void setCover(String Cover) {
            this.Cover = Cover;
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
