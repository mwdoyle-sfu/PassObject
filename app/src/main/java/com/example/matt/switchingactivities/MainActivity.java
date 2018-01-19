package com.example.matt.switchingactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setuplaunchButton();
    }

    private void setuplaunchButton() {
        Button btn = (Button) findViewById(R.id.Launch_second);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked 'launch second'.", Toast.LENGTH_LONG)
                        .show();

                // Launch the second activity
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                PetRock rocky = new PetRock("Charlie", 56);
                Intent intent = SecondActivity.makeIntent(MainActivity.this, rocky);
                startActivity(intent);

                // Kill the MainActivity
//                finish();
            }
        });
    }
}
