package com.example.sidkathuria.dictionary.api;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by sidkathuria on 7/5/2017.
 */

public interface definitionsApi {
    @Headers({
            "Accept: application/json",
            "app_id: 5037d509",

            "app_key : 4dc1aebaa63721f0f8e79a55e2514bc7"
    })
    @GET("/entries/en/{word_id}/definitions")
    Callback<definitions> getDefintions(
            @Path("word_id") String word_id
    );
}
