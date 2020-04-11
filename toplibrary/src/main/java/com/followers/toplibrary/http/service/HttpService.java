package com.followers.toplibrary.http.service;

import com.google.gson.JsonElement;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import rx.Observable;

/**
 * Created by meng on 2017/10/10.
 */

public interface HttpService {

     //登录
     @POST("user/login")
     Observable<JsonElement> login(@Body Map<String, Object> map);

    //获取用户信息
    @POST("user/info")
    Observable<JsonElement> getUserInfo(@Body Map<String, Object> map);

    //获取配置文件
    @POST("config")
    Observable<JsonElement> getConfig(@Body Map<String, Object> map);

     //上传图片
     @Multipart
     @POST("admin/upload_img")
     Observable<ResponseBody> upLoadImage(@Part MultipartBody.Part file);

     //获取金币列表
     @POST("coins/list")
     Observable<JsonElement> getCoinsList(@Body Map<String, Object> map);

     //购买金币
     @POST("coins/buy")
     Observable<JsonElement> buyCoins(@Body Map<String, Object> map);

     //购买金币订单
     @POST("coins/orders")
     Observable<JsonElement> buyCoinsOrders(@Body Map<String, Object> map);

     //google支付成功的回调
     @POST("pay/google_pay_callback")
     Observable<JsonElement> googlePayCallback(@Body Map<String, Object> map);

     //发布帖子
     @POST("likes/publish")
     Observable<JsonElement> sendLikesPost(@Body Map<String, Object> map);

     //获取普通点赞帖子列表
     @POST("likes/list")
     Observable<JsonElement> getLikesPostList(@Body Map<String, Object> map);

     //获取置顶帖子列表
     @POST("likes/req_rank_list")
     Observable<JsonElement> getTopLikesPostList(@Body Map<String, Object> map);

     //点赞帖子置顶
     @POST("likes/req_rank")
     Observable<JsonElement> topLikesPost(@Body Map<String, Object> map);

     //点赞回调
     @POST("likes/mark")
     Observable<JsonElement> likesMark(@Body Map<String, Object> map);

     //给我点过赞的用户列表
     @POST("user/likes_me")
     Observable<JsonElement> getLikesMe(@Body Map<String, Object> map);

     //获取点赞帖子排行榜
     @POST("likes/ranking_list")
     Observable<JsonElement> getRankingLikesList(@Body Map<String, Object> map);

     //获取用户发布过的帖子
     @POST("likes/publish_list")
     Observable<JsonElement> getUserPublishList(@Body Map<String, Object> map);

     //发布关注帖子
     @POST("followers/publish")
     Observable<JsonElement> sendFollowersPost(@Body Map<String, Object> map);

     //获取普通的关注帖子
     @POST("followers/list")
     Observable<JsonElement> getFollowersPost(@Body Map<String, Object> map);

     //获取置顶关注帖子列表
     @POST("followers/req_rank_list")
     Observable<JsonElement> getTopFollowersPost(@Body Map<String, Object> map);

     //关注帖子置顶
     @POST("followers/req_rank")
     Observable<JsonElement> topFollowersPost(@Body Map<String, Object> map);

     //用户关注回调
     @POST("followers/mark")
     Observable<JsonElement> followersMark(@Body Map<String, Object> map);

     //关注过我的用户列表
     @POST("user/followers_me")
     Observable<JsonElement> followersMe(@Body Map<String, Object> map);

     //关注排行榜
     @POST("followers/ranking_list")
     Observable<JsonElement> rankingFollowersList(@Body Map<String, Object> map);


}
