package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the questionButton */
    public void sendNewQuestion(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, SendQuestionActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the friendsButton */
    public void viewFriends(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ViewFriendsActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the settingsButton */
    public void goToSettings(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}