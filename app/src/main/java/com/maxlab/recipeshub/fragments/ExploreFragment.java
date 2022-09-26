package com.maxlab.recipeshub.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maxlab.recipeshub.R;
import com.maxlab.recipeshub.adapter.ExploreAdapter;
import com.maxlab.recipeshub.databinding.FragmentExploreBinding;
import com.maxlab.recipeshub.model.ViewpageModel;

import java.util.ArrayList;


public class ExploreFragment extends Fragment {
    FragmentExploreBinding binding;
    RecyclerView exploreView;
    public ExploreFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentExploreBinding.inflate(getLayoutInflater());
        exploreView = binding.exploreView;

        ArrayList<ViewpageModel> exploremodel = new ArrayList<>();
        ExploreAdapter exploreAdapter = new ExploreAdapter(getContext() , exploremodel);

        exploremodel.add(new ViewpageModel("","https://149352091.v2.pressablecdn.com/wp-content/uploads/2014/09/Fotolia_1848649_Subscription_L-1200x715.jpg","Porotta","Breakfast"));
        exploremodel.add(new ViewpageModel("","https://149352091.v2.pressablecdn.com/wp-content/uploads/2014/09/Fotolia_4619038_Subscription_L-1200x715.jpg","Chappathi","Appetizers"));
        exploremodel.add(new ViewpageModel("","https://lh3.googleusercontent.com/yX8kG-BJwUcj7n2rwgzVOw9wMA45esK4bM3hVyALgGyCnxCMnKQX8AtW4CkeFHmeiuJ2ryEe2SEfOuiRoQHo=w1280-h960-c-rj-v1-e365","Kanji","Main Dish"));
        exploremodel.add(new ViewpageModel("","https://i.pinimg.com/originals/08/11/8d/08118dc8874857b4c8fcbc0e426dcf9d.jpg","Samosa","FastFood"));
        exploreView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        exploreView.setAdapter(exploreAdapter);

        return binding.getRoot();
    }
}
