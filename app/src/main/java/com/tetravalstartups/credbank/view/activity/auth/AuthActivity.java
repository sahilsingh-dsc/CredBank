package com.tetravalstartups.credbank.view.activity.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tetravalstartups.credbank.R;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        Bundle bundle = getIntent().getExtras();
    }
}
