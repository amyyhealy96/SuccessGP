package com.example.ahealy.successgp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DemoEngineering extends AppCompatActivity {

    private CardView btnApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_engineering);



        btnApply = (CardView) findViewById(R.id.btnApply);

        btnApply.setOnClickListener(new View.OnClickListener() {
                                         @Override

                                         public void onClick(View view) {
                                             Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                                             myWebLink.setData(Uri.parse("https://salesforce.wd1.myworkdayjobs.com/en-US/External_Career_Site/job/Ireland---Dublin/Success-Graduate---Solution-Engineering_JR24714"));
                                             startActivity(myWebLink);
                                         }
                                     });


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_apply);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.action_back:
                        Intent intent = new Intent(DemoEngineering.this, Quiz.class);
                        startActivity(intent);
                        break;


                }

                switch (menuItem.getItemId()) {

                    case R.id.action_home:
                        Intent intent = new Intent(DemoEngineering.this, LandingPage.class);
                        startActivity(intent);
                        break;


                }


                return true;
            }
        });
    }

}
