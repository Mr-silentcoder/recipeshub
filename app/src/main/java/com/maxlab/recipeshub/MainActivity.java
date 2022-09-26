package com.maxlab.recipeshub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.Window;

import com.iammert.library.readablebottombar.ReadableBottomBar;
import com.maxlab.recipeshub.databinding.ActivityMainBinding;
import com.maxlab.recipeshub.fragments.CategoryFragment;
import com.maxlab.recipeshub.fragments.ExploreFragment;
import com.maxlab.recipeshub.fragments.FavoriteFragment;
import com.maxlab.recipeshub.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragFrame, new HomeFragment());
        transaction.commit();

        binding.listMenu.setOnClickListener(view ->{
            dialog = new Dialog(this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.bottomsheet);

            dialog.show();
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
            dialog.getWindow().setGravity(Gravity.BOTTOM);
        });




















        //bottom menu
        binding.BottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (i){
                    case 0:
                        transaction.replace(R.id.fragFrame, new HomeFragment());
                        transaction.commit();
                        break;
                    case 1:
                        transaction.replace(R.id.fragFrame, new ExploreFragment());
                        transaction.commit();
                        break;
                    case 2:
                        transaction.replace(R.id.fragFrame, new CategoryFragment());
                        transaction.commit();
                        break;
                    case 3:
                        transaction.replace(R.id.fragFrame, new FavoriteFragment());
                        transaction.commit();
                        break;
                }

            }
        });

    }
}