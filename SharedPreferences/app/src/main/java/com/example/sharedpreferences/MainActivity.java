package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch switchButton;
    Boolean bool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchButton=findViewById(R.id.switch1);

        SharedPreferences preferences=getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        bool=preferences.getBoolean("THEME",false);
        if (bool){
            switchButton.setChecked(true);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else{
            switchButton.setChecked(false);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
        switchButton.setOnClickListener(v->{
            if(switchButton.isChecked()){
                switchButton.setChecked(true);
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                editor.putBoolean("THEME",true);
            }else{
                switchButton.setChecked(false);
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                editor.putBoolean("THEME",false);
            }
            editor.apply();
        });
    }
}