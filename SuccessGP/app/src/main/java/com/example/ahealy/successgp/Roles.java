package com.example.ahealy.successgp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.kofigyan.stateprogressbar.StateProgressBar;

public class Roles extends AppCompatActivity {

    String[] descriptionData = {"Info", "Locations", "Quiz", "Apply"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roles);

        StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.state_progress_bar);
        stateProgressBar.setStateDescriptionData(descriptionData);

        stateProgressBar.setStateDescriptionTypeface("fonts/RobotoSlab-Light.ttf");
        stateProgressBar.setStateNumberTypeface("fonts/Questrial-Regular.ttf");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.the_bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.action_next:
                        Intent intent = new Intent(Roles.this, Quiz.class);
                        startActivity(intent);
                        break;




                }

                switch (menuItem.getItemId()) {

                    case R.id.action_back:
                        Intent intent = new Intent(Roles.this, FindOutMore.class);
                        startActivity(intent);
                        break;


                }

                switch (menuItem.getItemId()) {

                    case R.id.action_home:
                        Intent intent = new Intent(Roles.this, LandingPage.class);
                        startActivity(intent);
                        break;


                }

                switch (menuItem.getItemId()) {

                    case R.id.action_next:
                        Intent intent = new Intent(Roles.this, Quiz.class);
                        startActivity(intent);
                        break;


                }



                return true;
            }
        });

    }

}
