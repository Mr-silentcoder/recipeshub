package com.maxlab.recipeshub.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.maxlab.recipeshub.R;
import com.maxlab.recipeshub.model.ViewpageModel;

import java.util.ArrayList;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.RecentViewHolder> {
    private final Context context;
    private final ArrayList<ViewpageModel> viewpageModels; // demo model

    public RecentAdapter(Context context, ArrayList<ViewpageModel> viewpageModels) {
        this.context = context;
        this.viewpageModels = viewpageModels;
    }

    @NonNull
    @Override
    public RecentAdapter.RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recentview, parent, false);
        return new RecentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentAdapter.RecentViewHolder holder, int position) {
        ViewpageModel model = viewpageModels.get(position);
        holder.rcpName.setText(model.getRecipeName());
        holder.catName.setText(model.getCatName());
        Glide.with(context).load(model.getRecipeImage()).into(holder.rcImage);
    }

    @Override
    public int getItemCount() {
        return viewpageModels.size();
    }

    public static class RecentViewHolder extends RecyclerView.ViewHolder {
        ImageView rcImage;
        TextView rcpName, catName;
        public RecentViewHolder(@NonNull View itemView) {
            super(itemView);
            rcImage = itemView.findViewById(R.id.rcpImage);
            rcpName = itemView.findViewById(R.id.rcpName);
            catName = itemView.findViewById(R.id.ctrName);
        }
    }
}
