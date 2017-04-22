package com.example.yougourta.projmob.NavDrawer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yougourta.projmob.Classes.MesRdvListeSingleRow;
import com.example.yougourta.projmob.R;

import java.util.ArrayList;
import java.util.List;

import io.huannguyen.swipeablerv.adapter.StandardSWAdapter;

/**
 * Created by Yougourta on 4/22/17.
 */

public class ConfirmerRdvsAdapter extends StandardSWAdapter<MesRdvListeSingleRow> {

    ArrayList<MesRdvListeSingleRow> items;
    protected ConfirmerRdvsAdapter(ArrayList<MesRdvListeSingleRow> items) {
        super(items);
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.liste_rdv_single_row, parent, false);
        return new com.example.yougourta.projmob.NavDrawer.ConfirmerRdvsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((com.example.yougourta.projmob.NavDrawer.ConfirmerRdvsViewHolder)holder).initData(items.get(position).getNom(), items.get(position).getLogement(),items.get(position).getDate(), items.get(position).getHeure());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
