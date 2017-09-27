package com.cibertpoet.cibert_app.view;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cibertpoet.cibert_app.R;
import com.cibertpoet.cibert_app.view.fragment.HomeFragment;
import com.cibertpoet.cibert_app.view.fragment.ProfileFragment;
import com.cibertpoet.cibert_app.view.fragment.SearchFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

public class ConteinerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteiner);

        BottomBar bottmbar= (BottomBar)findViewById(R.id.bottombar);
        bottmbar.setDefaultTab(R.id.home);

        bottmbar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.home:
                        HomeFragment homeFragment= new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.conteiner,homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_ENTER_MASK)
                                .addToBackStack(null).commit();

                        break;
                    case R.id.profile:
                        ProfileFragment profileFragment= new ProfileFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.conteiner,profileFragment)
                                .setTransition(FragmentTransaction.TRANSIT_ENTER_MASK)
                                .addToBackStack(null).commit();
                        break;
                    case R.id.search:
                        SearchFragment searchFragment= new SearchFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.conteiner,searchFragment)
                                .setTransition(FragmentTransaction.TRANSIT_ENTER_MASK)
                                .addToBackStack(null).commit();

                        break;
                }
            }
        });
    }
}
