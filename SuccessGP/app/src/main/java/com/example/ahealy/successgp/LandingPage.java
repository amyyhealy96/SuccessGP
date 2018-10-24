package com.example.ahealy.successgp;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class LandingPage extends AppCompatActivity implements View.OnClickListener {



    private CardView infoCard, rolesCard, quizCard, applyCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);


        //Defining Cards on Landing Page
        infoCard = (CardView) findViewById(R.id.infoCard);
        rolesCard = (CardView) findViewById(R.id.rolesCard);
        quizCard = (CardView) findViewById(R.id.quizCard);
        applyCard = (CardView) findViewById(R.id.applyCard);


        //Add OnClick Listeners
        infoCard.setOnClickListener(this);
        rolesCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
        applyCard.setOnClickListener(new View.OnClickListener() {
            @Override

                        public void onClick(View view) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://salesforce.wd1.myworkdayjobs.com/en-US/External_Career_Site/job/Ireland---Dublin/Success-Graduate---Solution-Engineering_JR24714"));
                startActivity(myWebLink);
       }

                  })  ;

              };;;

            @Override
            public void onClick(View v) {

                Intent i;

                switch (v.getId()) {
                    case R.id.infoCard:
                        i = new Intent(this, FindOutMore.class) ;    
                        startActivity(i);
                        break;
                    case R.id.rolesCard:
                        i = new Intent(this, Roles.class);
                        startActivity(i);
                        break;
                    case R.id.quizCard:
                        i = new Intent(this, Quiz.class);
                        startActivity(i);
                        break;

                    default:
                        break;

                } }
            }







