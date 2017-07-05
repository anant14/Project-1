package com.example.sidkathuria.dictionary.api;

import com.example.sidkathuria.dictionary.models.antonyms;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by sidkathuria on 7/5/2017.
 */

public interface AntonymsApi {
    @Headers({

            "app_id : 5037d509",
            "app_key : 4dc1aebaa63721f0f8e79a55e2514bc7"
            })
    @GET("/entries/en/{word_id}/antonyms")
    Callback<antonyms> getAntonyms(
      @Path("word_id") String word_id
    );

}
//app key = 4dc1aebaa63721f0f8e79a55e2514bc7
// app id = 5037d509