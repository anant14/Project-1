package com.example.sidkathuria.dictionary.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sidkathuria.dictionary.R;
import com.example.sidkathuria.dictionary.api.AntonymsApi;
import com.example.sidkathuria.dictionary.api.SynonymsApi;
import com.example.sidkathuria.dictionary.api.dictionaries;
import com.example.sidkathuria.dictionary.models.MyDictionary;
import com.example.sidkathuria.dictionary.models.antonyms;
import com.example.sidkathuria.dictionary.models.synonyms;

import org.w3c.dom.Text;

import java.util.Dictionary;
import java.util.Enumeration;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Result extends AppCompatActivity {
TextView tvTitle,tvDefenition,tvActualDefenition,tvExample,tvActualExample,tvType,tvActualType;
    String type,example,defenition;MyDictionary dict;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvTitle = (TextView)findViewById(R.id.tvTitle);
        tvExample = (TextView)findViewById(R.id.tvExample);
        tvDefenition =(TextView)findViewById(R.id.tvDefenition);
        tvActualDefenition = (TextView)findViewById(R.id.tvActualDefenition);
        tvActualExample = (TextView)findViewById(R.id.tvActualExample);
        tvType = (TextView)findViewById(R.id.tvType);
        tvActualType = (TextView)findViewById(R.id.tvActualType);
        Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://od-api-demo.oxforddictionaries.com:443/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

final String WordRecieved = getIntent().getStringExtra("word");

//        synonyms  mysynonym = new synonyms();
//antonyms myantonym = new antonyms();

final SynonymsApi synonymsApi = retrofit.create(SynonymsApi.class);
        final AntonymsApi antonymsApi = retrofit.create(AntonymsApi.class);

       final dictionaries dictApi = retrofit.create(dictionaries.class);
        dictApi.getDictionary(WordRecieved);



    }
}
