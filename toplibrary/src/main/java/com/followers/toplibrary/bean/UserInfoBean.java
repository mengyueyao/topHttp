package com.followers.toplibrary.bean;

public class UserInfoBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"id":6,"user_pk":"123123","user_name":"test","cover":"http://image.biaobaiju.com/uploads/20180803/23/1533309822-GCcDphRmqw.jpg","coin_balance":31700,"total_amount_coin":132,"total_amount_price":0.99,"total_consumption_coin":1500,"total_ad_coin":0,"country":"","update_at":"2020-04-09T20:11:20+08:00","created_at":"2020-04-09T20:11:20+08:00"}
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
         * id : 6
         * user_pk : 123123
         * user_name : test
         * cover : http://image.biaobaiju.com/uploads/20180803/23/1533309822-GCcDphRmqw.jpg
         * coin_balance : 31700
         * total_amount_coin : 132
         * total_amount_price : 0.99
         * total_consumption_coin : 1500
         * total_ad_coin : 0
         * country :
         * update_at : 2020-04-09T20:11:20+08:00
         * created_at : 2020-04-09T20:11:20+08:00
         */

        private int id;
        private String user_pk;
        private String user_name;
        private String cover;
        private int coin_balance;
        private int total_amount_coin;
        private double total_amount_price;
        private int total_consumption_coin;
        private int total_ad_coin;
        private String country;
        private String update_at;
        private String created_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public int getCoin_balance() {
            return coin_balance;
        }

        public void setCoin_balance(int coin_balance) {
            this.coin_balance = coin_balance;
        }

        public int getTotal_amount_coin() {
            return total_amount_coin;
        }

        public void setTotal_amount_coin(int total_amount_coin) {
            this.total_amount_coin = total_amount_coin;
        }

        public double getTotal_amount_price() {
            return total_amount_price;
        }

        public void setTotal_amount_price(double total_amount_price) {
            this.total_amount_price = total_amount_price;
        }

        public int getTotal_consumption_coin() {
            return total_consumption_coin;
        }

        public void setTotal_consumption_coin(int total_consumption_coin) {
            this.total_consumption_coin = total_consumption_coin;
        }

        public int getTotal_ad_coin() {
            return total_ad_coin;
        }

        public void setTotal_ad_coin(int total_ad_coin) {
            this.total_ad_coin = total_ad_coin;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getUpdate_at() {
            return update_at;
        }

        public void setUpdate_at(String update_at) {
            this.update_at = update_at;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }
    }
}
