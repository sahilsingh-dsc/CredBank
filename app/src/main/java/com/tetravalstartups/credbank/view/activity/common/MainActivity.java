package com.tetravalstartups.credbank.view.activity.common;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tetravalstartups.credbank.R;
import com.tetravalstartups.credbank.view.fragment.HistoryFragment;
import com.tetravalstartups.credbank.view.fragment.ProfileFragment;
import com.tetravalstartups.credbank.view.fragment.TransferFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){

        tvTitle = findViewById(R.id.tvTitle);
        tvTitle.setText("TRANSFER MONEY");
        BottomNavigationView navBottom = findViewById(R.id.navBottom);
        navBottom.setOnNavigationItemSelectedListener(MainActivity.this);
        navBottom.setSelectedItemId(R.id.footer_menu_transfer);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;

        switch (menuItem.getItemId()){

            case R.id.footer_menu_transfer :
                tvTitle.setText("Transfer Money");
                fragment = new TransferFragment();
                break;

            case R.id.footer_menu_history :
                tvTitle.setText("History");
                fragment = new HistoryFragment();
                break;

            case R.id.footer_menu_profile :
                tvTitle.setText("Profile");
                fragment = new ProfileFragment();
                break;
        }

        return loadFragment (fragment);
    }

        private boolean loadFragment(Fragment fragment){

            if (fragment != null){
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
                return true;

            }
            return false;
    }

}

