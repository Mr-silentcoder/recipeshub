package com.maxlab.recipeshub.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maxlab.recipeshub.R;
import com.maxlab.recipeshub.adapter.CategoryPageAdapter;
import com.maxlab.recipeshub.databinding.FragmentCategoryBinding;
import com.maxlab.recipeshub.model.ViewpageModel;

import java.util.ArrayList;

public class CategoryFragment extends Fragment {
    FragmentCategoryBinding binding;
    RecyclerView catView;
    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCategoryBinding.inflate(getLayoutInflater());
        catView = binding.catView;
        ArrayList<ViewpageModel> viewpageModels = new ArrayList<>();
        CategoryPageAdapter categoryPageAdapter = new CategoryPageAdapter(getContext(), viewpageModels);
        viewpageModels.add(new ViewpageModel("","https://149352091.v2.pressablecdn.com/wp-content/uploads/2014/09/Fotolia_1848649_Subscription_L-1200x715.jpg","Porotta","Breakfast"));
        viewpageModels.add(new ViewpageModel("","http://www.flavorsofmumbai.com/wp-content/uploads/2011/11/closeup-Prawns-Fry-Goan-1280x720.jpg","Chappathi","Appetizers"));
        viewpageModels.add(new ViewpageModel("","https://www.thespruceeats.com/thmb/I_M3fmEbCeNceaPrOP5_xNZ2xko=/3160x2107/filters:fill(auto,1)/vegan-tofu-tikka-masala-recipe-3378484-hero-01-d676687a7b0a4640a55be669cba73095.jpg","Kanji","Main Dish"));
        catView.setLayoutManager(new GridLayoutManager(getContext(), 1));
        catView.setAdapter(categoryPageAdapter);
        return binding.getRoot();
    }
}