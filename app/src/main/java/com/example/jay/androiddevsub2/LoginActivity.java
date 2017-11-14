package com.example.jay.androiddevsub2;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
    CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        floatingActionButton = findViewById(R.id.login_fab);
        coordinatorLayout = findViewById(R.id.login_c);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(floatingActionButton, "test", 2000).show();
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
            }
        });
    }
}
