package com.example.l.medhelper.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.l.medhelper.R;

public class InfoActivity extends AppCompatActivity {

    private EditText userName;
    private EditText userSurname;
    private EditText userBornDate;
    private EditText userGender;
    private EditText userBloodGroup;
    private EditText userHealthProblems;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        userName = findViewById(R.id.user_name);
        userSurname = findViewById(R.id.user_surname);
        userBornDate = findViewById(R.id.user_born_date);
        userGender = findViewById(R.id.user_gender);
        userBloodGroup = findViewById(R.id.user_blood_group);
        userHealthProblems = findViewById(R.id.user_health_problems);
        saveButton = findViewById(R.id.save_button);
        actionForSaveButton(saveButton);
    }

    private void actionForSaveButton(Button button) {
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPref.edit().putString("username", userName.getText().toString()).
                        putString("usersurname", userSurname.getText().toString()).
                        putString("userborndate", userBornDate.getText().toString()).
                        putString("usergender", userGender.getText().toString()).
                        putString("userbloodgroup", userBloodGroup.getText().toString()).
                        putString("userhealthproblems", userHealthProblems.getText().toString())
                        .apply();
                Intent intent = new Intent(InfoActivity.this, MarzPageActivity.class);
                startActivity(intent);
            }
        });
    }

}
