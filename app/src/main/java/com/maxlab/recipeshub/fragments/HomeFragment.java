package com.maxlab.recipeshub.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maxlab.recipeshub.adapter.CategoryAdapter;
import com.maxlab.recipeshub.adapter.RecentAdapter;
import com.maxlab.recipeshub.adapter.VideomodelAdapter;
import com.maxlab.recipeshub.adapter.ViewpageAdapter;
import com.maxlab.recipeshub.databinding.FragmentHomeBinding;
import com.maxlab.recipeshub.model.CategoryModel;
import com.maxlab.recipeshub.model.ViewpageModel;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    RecyclerView catView , recentView , videosView;
    ViewPager2 viewPager;
    WormDotsIndicator dotsIndicator;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        catView = binding.catView;
        recentView = binding.recentView;
        videosView = binding.videosView;
        viewPager = binding.viewPager2;
        dotsIndicator = binding.wormDotsIndicator;

        ArrayList<ViewpageModel> viewpageModels = new ArrayList<>();
        ViewpageAdapter viewpageAdapter = new ViewpageAdapter(getContext(), viewpageModels);
        viewpageModels.add(new ViewpageModel("","https://149352091.v2.pressablecdn.com/wp-content/uploads/2014/09/Fotolia_1848649_Subscription_L-1200x715.jpg","Porotta","Breakfast"));
        viewpageModels.add(new ViewpageModel("","https://149352091.v2.pressablecdn.com/wp-content/uploads/2014/09/Fotolia_4619038_Subscription_L-1200x715.jpg","Chappathi","Appetizers"));
        viewpageModels.add(new ViewpageModel("","https://www.menudrive.com/wp-content/uploads/2021/02/Seafood.png","Kanji","Main Dish"));
        viewPager.setAdapter(viewpageAdapter);
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        viewPager.setOffscreenPageLimit(2);
        dotsIndicator.attachTo(viewPager);


        ArrayList<CategoryModel> categoryModels = new ArrayList<>();
        CategoryAdapter adapter = new CategoryAdapter(getContext(), categoryModels);

        categoryModels.add(new CategoryModel("","Appetizers","https://insanelygoodrecipes.com/wp-content/uploads/2021/05/Jollof-Rice-with-Green-Onions.jpg"));
        categoryModels.add(new CategoryModel("","Breakfast","https://hips.hearstapps.com/delish/assets/17/31/1501791674-delish-chicken-curry-horizontal.jpg"));
        categoryModels.add(new CategoryModel("","Main Dish","https://irepo.primecp.com/2018/05/373152/Chicken-Ranch-Casserole_Large600_ID-2747720.jpg"));

        catView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        catView.setAdapter(adapter);

        ArrayList<ViewpageModel> recentmodel = new ArrayList<>();
        RecentAdapter recentAdapter = new RecentAdapter(getContext() , recentmodel);

        recentmodel.add(new ViewpageModel("","https://149352091.v2.pressablecdn.com/wp-content/uploads/2014/09/Fotolia_1848649_Subscription_L-1200x715.jpg","Porotta","Breakfast"));
        recentmodel.add(new ViewpageModel("","https://149352091.v2.pressablecdn.com/wp-content/uploads/2014/09/Fotolia_4619038_Subscription_L-1200x715.jpg","Chappathi","Appetizers"));
        recentmodel.add(new ViewpageModel("","https://irepo.primecp.com/2018/05/373152/Chicken-Ranch-Casserole_Large600_ID-2747720.jpg","Kanji","Main Dish"));

        recentView.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL, false));
        recentView.setAdapter(recentAdapter);

        ArrayList<ViewpageModel> videomodel = new ArrayList<>();
        VideomodelAdapter videomodelAdapter = new VideomodelAdapter(getContext(), videomodel);

        videomodel.add(new ViewpageModel("","https://img.sndimg.com/food/image/upload/q_92,fl_progressive/v1/img/recipes/51/15/2/A8oXB1kNSbmCvZpIoCq4_spaghetti-pie-3.jpg","Porotta","Breakfast"));
        videomodel.add(new ViewpageModel("","https://149352091.v2.pressablecdn.com/wp-content/uploads/2014/09/Fotolia_4619038_Subscription_L-1200x715.jpg","Chappathi","Appetizers"));
        videomodel.add(new ViewpageModel("","https://www.menudrive.com/wp-content/uploads/2021/02/Seafood.png","Kanji","Main Dish"));

        videosView.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL, false));
        videosView.setAdapter(videomodelAdapter);

        return binding.getRoot();
    }
}