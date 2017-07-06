package com.example.sidkathuria.dictionary.api;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by sidkathuria on 7/4/2017.
 */

public interface dictionaries {
    @Headers({
            "Accept: application/json",
            "app_id : 5037d509",
            "app_key : 4dc1aebaa63721f0f8e79a55e2514bc7"
    })
    @GET("/api/v1/dictionary/{word}")
    Callback<MyDictionary> getDictionary(
    @Path("word") String word
            );
}
