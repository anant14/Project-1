package com.example.sidkathuria.dictionary.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sidkathuria.dictionary.R;
import com.example.sidkathuria.dictionary.adapters.AllActivitiesAdapter;
import com.example.sidkathuria.dictionary.api.LanguageApi;
import com.example.sidkathuria.dictionary.models.results;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AllActivities extends AppCompatActivity {
RecyclerView recyclerView;
    AllActivitiesAdapter allActivitiesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_activities_recycler);

allActivitiesAdapter = new AllActivitiesAdapter(this,new ArrayList<Languages>());
        recyclerView = (RecyclerView)findViewById(R.id.rv);
recyclerView.setAdapter(allActivitiesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Retrofit retrofit =new  Retrofit.Builder()
                .baseUrl("https://od-api-demo.oxforddictionaries.com:443/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

LanguageApi langApi = retrofit.create(LanguageApi.class);
        langApi.getLanguages().enqueue(new Callback<results>(){
            @Override
            public void onResponse(Call<results> call, Response<results> response) {

            }

            @Override
            public void onFailure(Call<results> call, Throwable t) {

            }
        });
    }
}
