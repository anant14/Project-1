package com.example.sidkathuria.dictionary.api;

import com.example.sidkathuria.dictionary.models.Languages;
import com.example.sidkathuria.dictionary.models.results;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by sidkathuria on 7/5/2017.
 */

public interface LanguageApi {
    @Headers({

            "app_id :5037d509",
            "app_key : 4dc1aebaa63721f0f8e79a55e2514bc7"
    })
    @GET("/languages")
        Call<results> getLanguages();
}
