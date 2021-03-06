package com.dp201.creditapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    public void ClickLogin(View view) {
    }

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View View){
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickProfile(View view){
        MainActivity.redirectActivity(this, ProfileActivity.class);
    }

    public void ClickHome(View view){
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickCalendar(View view){
        MainActivity.redirectActivity(this,CalendarActivity.class);
    }

    public void ClickAboutUs(View view){
        MainActivity.redirectActivity(this,AboutUs.class);
    }

    public void ClickSettings(View view){MainActivity.redirectActivity(this,SettingsActivity.class);}

    public void ClickLogout(View view){
        MainActivity.logout(this);
    }

    protected void onPause(){
        super.onPause();

        MainActivity.closeDrawer(drawerLayout);
    }
}