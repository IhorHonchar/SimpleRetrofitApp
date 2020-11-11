package ua.honchar.simpleretrofitapp;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface JSONPlaceHolderApi {
    @GET("/posts")
    public Single<List<Post>> getPosts();
}
