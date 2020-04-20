package com.followers.toplibrary.http;


import android.content.Context;

import com.bumptech.glide.Glide;
import com.followers.toplibrary.bean.BuyCoinsBean;
import com.followers.toplibrary.bean.BuyCoinsOrderBean;
import com.followers.toplibrary.bean.CoinsBean;
import com.followers.toplibrary.bean.CommBean;
import com.followers.toplibrary.bean.ConfigBean;
import com.followers.toplibrary.bean.FollowersMeBean;
import com.followers.toplibrary.bean.FollowersPostBean;
import com.followers.toplibrary.bean.FollowersPostListBean;
import com.followers.toplibrary.bean.LikesMeBean;
import com.followers.toplibrary.bean.LikesPostBean;
import com.followers.toplibrary.bean.LoginBean;
import com.followers.toplibrary.bean.PayCallBackBean;
import com.followers.toplibrary.bean.RankFollowersBean;
import com.followers.toplibrary.bean.RankingLikesBean;
import com.followers.toplibrary.bean.RateBean;
import com.followers.toplibrary.bean.RateStatusBean;
import com.followers.toplibrary.bean.RewardBean;
import com.followers.toplibrary.bean.SendLikesPostBean;
import com.followers.toplibrary.bean.TopFollowersPostBean;
import com.followers.toplibrary.bean.TopLikesBean;
import com.followers.toplibrary.bean.TopLikesPostBean;
import com.followers.toplibrary.bean.UserInfoBean;
import com.followers.toplibrary.bean.UserPublishBean;
import com.followers.toplibrary.http.request.HttpRequest;
import com.followers.toplibrary.http.request.RequestManager;
import com.followers.toplibrary.util.GsonUtil;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import mobile.Mobile;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import rx.Observable;

public class HttpUtil {

    //登录
    public static void login(String user_pk,String user_name, String cover,final HttpListener<LoginBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("user_name",user_name);
        map.put("cover",cover);
        Observable observable = new HttpRequest().login(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                LoginBean  loginBean= GsonUtil.format(s,LoginBean.class);

                if (null != loginBean){

                    listener.onSuccess(loginBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取用户信息
    public static void getUserInfo(String user_pk,final HttpListener<UserInfoBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().getUserInfo(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                UserInfoBean  userInfoBean= GsonUtil.format(s,UserInfoBean.class);

                if (null != userInfoBean){

                    listener.onSuccess(userInfoBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取配置文件
    public static void getConfig(final HttpListener<ConfigBean> listener) {

        Map<String, Object> map = new HashMap<>();

        Observable observable = new HttpRequest().getConfig(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                ConfigBean  configBean= GsonUtil.format(s,ConfigBean.class);

                if (null != configBean){

                    listener.onSuccess(configBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //上传图片
    public static void uploadImage(final Context context, final String imageUrl , final HttpListener<CommBean> listener) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                File file = null;
                try {
                    file = Glide.with(context)
                            .load(imageUrl)
                            .downloadOnly(200, 200)
                            .get();
                    //上传图片需要MultipartBody
                    RequestBody requestBody = RequestBody.create(MediaType.parse("image/jpg"), file);
                    MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName()+".jpg", requestBody);
                    RetrofitUtils.getInstance().upLoadImage(body).setHttpListener(new RetrofitUtils.HttpListener() {
                        @Override
                        public void onSuccess(String jsonStr) {

                            CommBean commBean = GsonUtil.format(Mobile.decrypt(jsonStr),CommBean.class);

                            if(null != commBean){

                                listener.onSuccess(commBean);
                            }

                        }

                        @Override
                        public void onError(String error) {
                            listener.onError(error);
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


    //获取金币列表
    public static void getCoinsList(final HttpListener<CoinsBean> listener) {

        Map<String, Object> map = new HashMap<>();
        Observable observable = new HttpRequest().getCoinsList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                CoinsBean coinsBean = GsonUtil.format(s,CoinsBean.class);

                if(null != coinsBean){

                    listener.onSuccess(coinsBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //购买金币
    public static void buyCoins(String user_pk,String product_id,final HttpListener<BuyCoinsBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("product_id",product_id);
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().buyCoins(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                BuyCoinsBean buyCoinsBean = GsonUtil.format(s,BuyCoinsBean.class);

                if(null != buyCoinsBean){

                    listener.onSuccess(buyCoinsBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //购买金币订单列表
    public static void buyCoinsOrders(String user_pk,final HttpListener<BuyCoinsOrderBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().buyCoinsOrders(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                BuyCoinsOrderBean buyCoinsOrderBean = GsonUtil.format(s,BuyCoinsOrderBean.class);

                if(null != buyCoinsOrderBean){

                    listener.onSuccess(buyCoinsOrderBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //google支付成功回调
    public static void googlePayCallback(String user_pk,String token,String google_pay_id,final HttpListener<Boolean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("token",token);
        map.put("google_pay_id",google_pay_id);
        Observable observable = new HttpRequest().googlePayCallback(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                PayCallBackBean payCallBackBean = GsonUtil.format(s,PayCallBackBean.class);

                if(null != payCallBackBean){

                    if(null != payCallBackBean.getData() && payCallBackBean.getData().equals("success") && payCallBackBean.isStatus()){

                        listener.onSuccess(true);
                    }else{

                        listener.onSuccess(false);
                    }
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //发布点赞的帖子
    public static void sendLikesPost(String user_pk,String user_name,String url,String img,String remark,boolean is_top,final HttpListener<Integer> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("user_name",user_name);
        map.put("url",url); //跳转的url
        map.put("img",img); //图片地址
        map.put("remark",remark);
        if(is_top){

            map.put("is_top","1");

        }else{

            map.put("is_top","0");
        }

        Observable observable = new HttpRequest().sendLikesPost(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SendLikesPostBean sendLikesPostBean = GsonUtil.format(s,SendLikesPostBean.class);

                if(null != sendLikesPostBean){

                    if(sendLikesPostBean.isStatus()){

                        listener.onSuccess(1);

                    }else if(sendLikesPostBean.getMessage().equals("Insufficient balance")&&!sendLikesPostBean.isStatus()){

                        listener.onSuccess(2);

                    }else{

                        listener.onError(sendLikesPostBean.getMessage());
                    }
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取普通点赞的帖子列表
    public static void getLikesPostList(String user_pk,String page,final HttpListener<LikesPostBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("page",page);
        Observable observable = new HttpRequest().getLikesPostList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                LikesPostBean likesPostBean = GsonUtil.format(s,LikesPostBean.class);

                if(null != likesPostBean){

                    listener.onSuccess(likesPostBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取置顶点赞的帖子
    public static void getTopLikesPostList(String user_pk,String page,final HttpListener<TopLikesPostBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("page",page);
        Observable observable = new HttpRequest().getTopLikesPostList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                TopLikesPostBean topLikesPostBean = GsonUtil.format(s,TopLikesPostBean.class);

                if(null != topLikesPostBean){

                    listener.onSuccess(topLikesPostBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //置顶点赞帖子
    public static void topLikesPost(String user_pk,String id,final HttpListener<Integer> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("id",id);
        Observable observable = new HttpRequest().topLikesPost(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                TopLikesBean topLikesBean = GsonUtil.format(s,TopLikesBean.class);

                if(null != topLikesBean){

                    if(topLikesBean.isStatus()){

                        listener.onSuccess(1);

                    }else if(topLikesBean.getMessage().equals("Insufficient balance") && !topLikesBean.isStatus()){

                        listener.onSuccess(2);

                    }else{

                        listener.onError(topLikesBean.getMessage());
                    }

                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //点赞回调
    public static void likesMark(String user_pk,String user_name,String cover,boolean is_top,String id,final HttpListener<Boolean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("user_name",user_name);
        map.put("cover",cover);
        map.put("id",id);
        if(is_top){
            map.put("is_top","1");
        }else{
            map.put("is_top","0");
        }

        Observable observable = new HttpRequest().likesMark(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                CommBean commBean = GsonUtil.format(s,CommBean.class);

                if(null != commBean){

                    listener.onSuccess(commBean.isStatus());
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }



    //给我点赞的用户列表
    public static void getLikesMe(String user_pk,final HttpListener<LikesMeBean> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        Observable observable = new HttpRequest().getLikesMe(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                LikesMeBean likesMeBean = GsonUtil.format(s,LikesMeBean.class);

                if(null != likesMeBean){

                    listener.onSuccess(likesMeBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取点赞帖子的排行榜
    public static void getRankingLikesList(final HttpListener<RankingLikesBean> listener) {

        Map<String, Object> map = new HashMap<>();

        Observable observable = new HttpRequest().getRankingLikesList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                RankingLikesBean rankingLikesBean = GsonUtil.format(s,RankingLikesBean.class);

                if(null != rankingLikesBean){

                    listener.onSuccess(rankingLikesBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取发布帖子历史
    public static void getUserPublishList(String user_pk,final HttpListener<UserPublishBean> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        Observable observable = new HttpRequest().getUserPublishList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                UserPublishBean userPublishBean = GsonUtil.format(s,UserPublishBean.class);

                if(null != userPublishBean){

                    listener.onSuccess(userPublishBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //发布关注帖子
    public static void sendFollowersPost(String user_pk,String user_name,String url,String img,String remark,boolean is_top,final HttpListener<Integer> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("user_name",user_name);

        map.put("url",url);

        map.put("img",img);

        map.put("remark",remark);

        if(is_top){

            map.put("is_top","1");

        }else{

            map.put("is_top","0");
        }

        Observable observable = new HttpRequest().sendFollowersPost(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                CommBean commBean = GsonUtil.format(s,CommBean.class);

                if(null != commBean){

                    if(commBean.isStatus()){

                        listener.onSuccess(1);
                    }else if(!commBean.isStatus() && commBean.getMessage().equals("Insufficient balance")){

                        listener.onSuccess(2);

                    }else{

                        listener.onError(commBean.getMessage());
                    }
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取普通关注帖子
    public static void getFollowersPost(String user_pk,String page,final HttpListener<FollowersPostBean> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("page",page);

        Observable observable = new HttpRequest().getFollowersPost(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                FollowersPostBean followersPostBean = GsonUtil.format(s,FollowersPostBean.class);

                if(null != followersPostBean){

                    listener.onSuccess(followersPostBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取置顶关注帖子
    public static void getTopFollowersPost(String user_pk,String page,final HttpListener<TopFollowersPostBean> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("page",page);

        Observable observable = new HttpRequest().getTopFollowersPost(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                TopFollowersPostBean topFollowersPostBean = GsonUtil.format(s,TopFollowersPostBean.class);

                if(null != topFollowersPostBean){

                    listener.onSuccess(topFollowersPostBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //关注帖子置顶
    public static void topFollowersPost(String user_pk,String id,final HttpListener<Integer> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("id",id);

        Observable observable = new HttpRequest().topFollowersPost(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                CommBean commBean = GsonUtil.format(s,CommBean.class);

                if(null != commBean){

                    if(commBean.isStatus()){

                        listener.onSuccess(1);
                    }else if(!commBean.isStatus()&&commBean.getMessage().equals("Insufficient balance")){

                        listener.onSuccess(2);

                    }else{

                        listener.onError(commBean.getMessage());
                    }
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //关注帖子回调
    public static void followersMark(String user_pk,String user_name,String cover,boolean is_top, String id,final HttpListener<Integer> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("user_name",user_name);

        map.put("cover",cover);

        if(is_top){
            map.put("is_top","1");
        }else{

            map.put("is_top","0");
        }
        map.put("id",id);

        Observable observable = new HttpRequest().followersMark(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                CommBean commBean = GsonUtil.format(s,CommBean.class);

                if(null != commBean){

                    if(commBean.isStatus()){

                        listener.onSuccess(1);
                    }else{

                        listener.onSuccess(2);
                    }

                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //关注我的用户列表
    public static void followersMe(String user_pk,final HttpListener<FollowersMeBean> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        Observable observable = new HttpRequest().followersMe(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                FollowersMeBean followersMeBean = GsonUtil.format(s,FollowersMeBean.class);

                if(null != followersMeBean){

                    listener.onSuccess(followersMeBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获得粉丝排行榜
    public static void rankingFollowersList(final HttpListener<RankFollowersBean> listener) {

        Map<String, Object> map = new HashMap<>();

        Observable observable = new HttpRequest().rankingFollowersList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                RankFollowersBean rankFollowersBean = GsonUtil.format(s,RankFollowersBean.class);

                if(null != rankFollowersBean){

                    listener.onSuccess(rankFollowersBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //发布过的粉丝帖子
    public static void followersPostList(String user_pk,final HttpListener<FollowersPostListBean> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        Observable observable = new HttpRequest().followersPostList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                FollowersPostListBean followersPostListBean = GsonUtil.format(s,FollowersPostListBean.class);

                if(null != followersPostListBean){

                    listener.onSuccess(followersPostListBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }



    //用户是否可以好评
    public static void rateStatus(String user_pk,final HttpListener<Boolean> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        Observable observable = new HttpRequest().rateStatus(map);

        new RequestManager() {
            @Override
            public void success(String s) {

               RateStatusBean rateStatusBean =  GsonUtil.format(s,RateStatusBean.class);

               if(null != rateStatusBean){

                   listener.onSuccess(rateStatusBean.isStatus());
               }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }




    //好评加金币
    public static void rate(String user_pk,final HttpListener<Boolean> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        Observable observable = new HttpRequest().rate(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                RateBean rateBean = GsonUtil.format(s,RateBean.class);

                if(null != rateBean){

                    listener.onSuccess(rateBean.isStatus());
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }




    //积分墙加金币
    public static void rewardCoins(String user_pk,String start_time,String end_time,final HttpListener<Integer> listener) {

        Map<String, Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("start_time",start_time);

        map.put("end_time",end_time);

        Observable observable = new HttpRequest().rewardCoins(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                RewardBean rewardBean = GsonUtil.format(s,RewardBean.class);

                if(null != rewardBean){

                    listener.onSuccess(rewardBean.getData());
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }





}

