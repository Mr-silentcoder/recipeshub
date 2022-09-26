package com.maxlab.recipeshub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.maxlab.recipeshub.databinding.ActivityCategoryBinding;

public class CategoryActivity extends AppCompatActivity {
    ActivityCategoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        final String catName = getIntent().getStringExtra("catName");
        final String catId   = getIntent().getStringExtra("catId");

        binding.catQName.setText(catName);


        binding.backBtn.setOnClickListener(view -> {
            onBackPressed();
        });
    }
}