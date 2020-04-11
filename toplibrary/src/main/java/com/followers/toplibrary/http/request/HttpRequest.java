package com.followers.toplibrary.http.request;


import com.followers.toplibrary.http.ObjectLoader;
import com.followers.toplibrary.http.RetrofitServiceManager;
import com.followers.toplibrary.http.service.HttpService;
import com.google.gson.JsonElement;

import java.util.Map;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by meng on 2017/10/10.
 */

public class HttpRequest extends ObjectLoader {

    private HttpService httpService;

    public HttpRequest() {

        httpService = RetrofitServiceManager.getInstance().create(HttpService.class);
    }

    /**
     *
     * 用户登录
     * @return
     */

    public Observable<JsonElement> login(Map<String,Object> map){

        return observable(httpService.login(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    //获取用户信息
    public Observable<JsonElement> getUserInfo(Map<String,Object> map){

        return observable(httpService.getUserInfo(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    //获取配置文件
    public Observable<JsonElement> getConfig(Map<String,Object> map){

        return observable(httpService.getConfig(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 获取金币列表
     * @return
     */

    public Observable<JsonElement> getCoinsList(Map<String,Object> map){

        return observable(httpService.getCoinsList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 购买金币
     * @return
     */

    public Observable<JsonElement> buyCoins(Map<String,Object> map){

        return observable(httpService.buyCoins(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 购买金币的订单列表
     * @return
     */

    public Observable<JsonElement> buyCoinsOrders(Map<String,Object> map){

        return observable(httpService.buyCoinsOrders(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * google支付回调
     * @return
     */

    public Observable<JsonElement> googlePayCallback(Map<String,Object> map){

        return observable(httpService.googlePayCallback(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 发布点赞帖子
     * @return
     */

    public Observable<JsonElement> sendLikesPost(Map<String,Object> map){

        return observable(httpService.sendLikesPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 获取普通点赞帖子列表
     * @return
     */

    public Observable<JsonElement> getLikesPostList(Map<String,Object> map){

        return observable(httpService.getLikesPostList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 获取置顶帖子列表
     * @return
     */

    public Observable<JsonElement> getTopLikesPostList(Map<String,Object> map){

        return observable(httpService.getTopLikesPostList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     *
     * 置顶点赞的帖子
     * @return
     */

    public Observable<JsonElement> topLikesPost(Map<String,Object> map){

        return observable(httpService.topLikesPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     *
     * 点赞回调
     * @return
     */

    public Observable<JsonElement> likesMark(Map<String,Object> map){

        return observable(httpService.likesMark(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 给我点赞的用户列表
     * @return
     */

    public Observable<JsonElement> getLikesMe(Map<String,Object> map){

        return observable(httpService.getLikesMe(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }



    /**
     *
     * 获取点赞帖子的排行榜
     * @return
     */

    public Observable<JsonElement> getRankingLikesList(Map<String,Object> map){

        return observable(httpService.getRankingLikesList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }



    /**
     *
     * 用户发布过的帖子
     * @return
     */

    public Observable<JsonElement> getUserPublishList(Map<String,Object> map){

        return observable(httpService.getUserPublishList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }



    /**
     *
     * 发布关注的帖子
     * @return
     */

    public Observable<JsonElement> sendFollowersPost(Map<String,Object> map){

        return observable(httpService.sendFollowersPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }



    /**
     *
     * 获取普通关注的帖子
     * @return
     */

    public Observable<JsonElement> getFollowersPost(Map<String,Object> map){

        return observable(httpService.getFollowersPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }



    /**
     *
     * 获取置顶关注的帖子列表
     * @return
     */

    public Observable<JsonElement> getTopFollowersPost(Map<String,Object> map){

        return observable(httpService.getTopFollowersPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }



    /**
     *
     * 关注帖子置顶
     * @return
     */

    public Observable<JsonElement> topFollowersPost(Map<String,Object> map){

        return observable(httpService.topFollowersPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }



    /**
     *
     * 关注回调
     * @return
     */

    public Observable<JsonElement> followersMark(Map<String,Object> map){

        return observable(httpService.followersMark(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }



    /**
     *
     * 关注我的用户列表
     * @return
     */

    public Observable<JsonElement> followersMe(Map<String,Object> map){

        return observable(httpService.followersMe(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }



    /**
     *
     * 关注排行榜
     * @return
     */

    public Observable<JsonElement> rankingFollowersList(Map<String,Object> map){

        return observable(httpService.rankingFollowersList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


}
