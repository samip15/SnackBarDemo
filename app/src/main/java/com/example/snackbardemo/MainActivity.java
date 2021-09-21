package com.example.snackbardemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    CoordinatorLayout layout;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);

    }

    @Override
    public void onBackPressed() {
        counter++;
        if (counter == 2) {
            super.onBackPressed();
        } else {
            // Create a snackbar
            Snackbar snackbar
                    = Snackbar
                    .make(
                            layout,
                            "Press Back Again To Exit......",
                            Snackbar.LENGTH_LONG);

            snackbar.show();
        }
    }
}