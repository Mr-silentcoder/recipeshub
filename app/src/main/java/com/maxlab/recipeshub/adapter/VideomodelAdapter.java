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

public class VideomodelAdapter extends RecyclerView.Adapter<VideomodelAdapter.VideoViewHolder> {
    private final Context context;
    private final ArrayList<ViewpageModel> viewpageModels;

    public VideomodelAdapter(Context context, ArrayList<ViewpageModel> viewpageModels) {
        this.context = context;
        this.viewpageModels = viewpageModels;
    }

    @NonNull
    @Override
    public VideomodelAdapter.VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.videoview, parent, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideomodelAdapter.VideoViewHolder holder, int position) {
          ViewpageModel model = viewpageModels.get(position);
          holder.racipeName.setText(model.getRecipeName());
          holder.catName.setText(model.getCatName());
        Glide.with(context).load(model.getRecipeImage()).into(holder.racipeImage);
    }

    @Override
    public int getItemCount() {
        return viewpageModels.size();
    }

    public static class VideoViewHolder extends RecyclerView.ViewHolder {
        ImageView racipeImage;
        TextView  racipeName, catName;
        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            racipeImage = itemView.findViewById(R.id.rcpyImage);
            racipeName  = itemView.findViewById(R.id.rcpyName);
            catName     = itemView.findViewById(R.id.ctryName);
        }
    }
}
