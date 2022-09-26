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

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ExploreViewHolder> {
    private final Context context;
    private final ArrayList<ViewpageModel> viewpageModels;

    public ExploreAdapter(Context context, ArrayList<ViewpageModel> viewpageModels) {
        this.context = context;
        this.viewpageModels = viewpageModels;
    }

    @NonNull
    @Override
    public ExploreAdapter.ExploreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.exploreview, parent, false);
        return new ExploreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExploreAdapter.ExploreViewHolder holder, int position) {
        ViewpageModel model = viewpageModels.get(position);
        holder.catName.setText(model.getCatName());
        holder.rcpyName.setText(model.getRecipeName());
        Glide.with(context).load(model.getRecipeImage()).into(holder.rcpyImage);
    }

    @Override
    public int getItemCount() {
        return viewpageModels.size();
    }

    public static class ExploreViewHolder extends RecyclerView.ViewHolder {
        ImageView rcpyImage;
        TextView rcpyName, catName;
        public ExploreViewHolder(@NonNull View itemView) {
            super(itemView);
            rcpyImage = itemView.findViewById(R.id.rcImage);
            rcpyName  = itemView.findViewById(R.id.recipeName);
            catName   = itemView.findViewById(R.id.catgName);
        }
    }
}
