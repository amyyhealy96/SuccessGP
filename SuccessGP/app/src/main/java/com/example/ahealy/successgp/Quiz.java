package com.example.ahealy.successgp;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.kofigyan.stateprogressbar.StateProgressBar;



public class Quiz extends AppCompatActivity {


    String[] descriptionData = {"Info", "Locations", "Quiz", "Apply"};
    private Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        btnSubmit = (Button)findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Quiz.this, DemoEngineering.class));
            }
        });

        StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.state_progress_bar);
        stateProgressBar.setStateDescriptionData(descriptionData);

        stateProgressBar.setStateDescriptionTypeface("fonts/RobotoSlab-Light.ttf");
        stateProgressBar.setStateNumberTypeface("fonts/Questrial-Regular.ttf");



        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_apply);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.action_home:
                        Intent intent = new Intent(Quiz.this, LandingPage.class);
                        startActivity(intent);
                        break;


                }

                switch (menuItem.getItemId()) {

                    case R.id.action_back:
                        Intent intent = new Intent(Quiz.this, Roles.class);
                        startActivity(intent);
                        break;


                }


                return true;


                            }
                });
            };
        }



