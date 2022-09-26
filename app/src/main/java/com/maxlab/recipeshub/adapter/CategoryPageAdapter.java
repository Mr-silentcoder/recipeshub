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

public class CategoryPageAdapter extends RecyclerView.Adapter<CategoryPageAdapter.ViewpageViewHolder> {

    private final Context context;
    private final ArrayList<ViewpageModel> viewpageModels;

    public CategoryPageAdapter(Context context, ArrayList<ViewpageModel> viewpageModels) {
        this.context = context;
        this.viewpageModels = viewpageModels;
    }

    @NonNull
    @Override
    public CategoryPageAdapter.ViewpageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.catpageview, parent , false);
        return new ViewpageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryPageAdapter.ViewpageViewHolder holder, int position) {
      ViewpageModel model = viewpageModels.get(position);
      holder.rcName.setText(model.getRecipeName());
      holder.catName.setText(model.getCatName());
      Glide.with(context).load(model.getRecipeImage()).into(holder.rcImage);
    }

    @Override
    public int getItemCount() {
        return viewpageModels.size();
    }

    public static class ViewpageViewHolder extends RecyclerView.ViewHolder {
        ImageView rcImage;
        TextView rcName, catName;
        public ViewpageViewHolder(@NonNull View itemView) {
            super(itemView);
            rcImage = itemView.findViewById(R.id.vImage);
            rcName  = itemView.findViewById(R.id.rcName);
            catName = itemView.findViewById(R.id.ctName);
        }
    }
}
