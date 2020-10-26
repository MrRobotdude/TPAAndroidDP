package com.dp201.creditapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View View){
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickProfile(View view){
        MainActivity.redirectActivity(this,ProfileActivity.class);
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

    public void ClickSettings(View view){recreate();}

    public void ClickLogout(View view){
        MainActivity.logout(this);
    }

    protected void onPause(){
        super.onPause();

        MainActivity.closeDrawer(drawerLayout);
    }

    public void ToggleNightTheme(){
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }

    public void ChangeLanguage(){

    }
}