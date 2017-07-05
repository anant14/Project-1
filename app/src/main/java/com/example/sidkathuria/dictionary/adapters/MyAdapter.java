package com.example.sidkathuria.dictionary.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.sidkathuria.dictionary.R;

/**
 * Created by sidkathuria on 7/5/2017.
 */

public class MyAdapter extends BaseAdapter {

    private String Word;
    private Context context;

    public MyAdapter(String word, Context context) {
        Word = word;
        this.context = context;
    }

    @Override
    public int getCount() {
        return Word.length();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = li.inflate(R.layout.activity_result,parent,false);

        return itemView;
    }
}
