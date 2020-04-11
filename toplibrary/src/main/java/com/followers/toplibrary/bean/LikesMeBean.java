package com.followers.toplibrary.bean;

import java.util.List;

public class LikesMeBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"LikesUserPk":"12346","UserName":"chenjia1994","CoverImg":"https://sdfsdfsdfsdf"}]
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
         * LikesUserPk : 12346
         * UserName : chenjia1994
         * CoverImg : https://sdfsdfsdfsdf
         */

        private String LikesUserPk;
        private String UserName;
        private String CoverImg;

        public String getLikesUserPk() {
            return LikesUserPk;
        }

        public void setLikesUserPk(String LikesUserPk) {
            this.LikesUserPk = LikesUserPk;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getCoverImg() {
            return CoverImg;
        }

        public void setCoverImg(String CoverImg) {
            this.CoverImg = CoverImg;
        }
    }
}
