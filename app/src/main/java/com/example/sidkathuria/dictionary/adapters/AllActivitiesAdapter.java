package com.example.sidkathuria.dictionary.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sidkathuria.dictionary.R;

import java.util.ArrayList;

/**
 * Created by sidkathuria on 7/5/2017.
 */

public class AllActivitiesAdapter extends RecyclerView.Adapter<AllActivitiesAdapter.AllActivitiesViewHolder> {
    private Context context;
    private ArrayList<Languages> arrayList;

    public AllActivitiesAdapter(Context context, ArrayList<Languages> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public void onBindViewHolder(AllActivitiesViewHolder holder, int position) {

Languages thislang = arrayList.get(position);
        holder.tvLanguages.setText(thislang.getLanguage());

    }


    @Override
    public AllActivitiesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = li.inflate(R.layout.activity_all_activities,parent,false);

        return new AllActivitiesViewHolder(itemView);
    }

    @Override
    public int getItemCount(){
        return arrayList.size();
}

class AllActivitiesViewHolder extends RecyclerView.ViewHolder{
TextView tvLanguages;
    public AllActivitiesViewHolder(View itemView) {
        super(itemView);
        tvLanguages = (TextView)itemView.findViewById(R.id.tvLanguages);
    }
}

}
