package com.example.matt.switchingactivities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private static final String EXTRA_NAME = "com.example.matt.switchingactivities.SecondActivity - the personName";
    private static final String EXTRA_AGE = "com.example.matt.switchingactivities.SecondActivity - the age";

    private PetRock myRock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        extractDatafromIntent();
        setupEndActivityButton();
    }

    private void extractDatafromIntent() {
        Intent intent = getIntent();
        String name = intent.getStringExtra(EXTRA_NAME);
        int age = intent.getIntExtra(EXTRA_AGE, 0);
        myRock = new PetRock(name,age);
    }

    private void setupEndActivityButton() {
        Button btn = (Button) findViewById(R.id.end_second);
        btn.setText("Name = " + myRock.getName() + "  age = " + myRock.getAge());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            // Common bug: intent to launch MainActivity
//                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
//                startActivity(intent);
            }
        });
    }

    public static Intent makeIntent(Context context, PetRock rock) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra(EXTRA_NAME, rock.getName());
        intent.putExtra(EXTRA_AGE, rock.getAge());
        return intent;
    }

}
