package com.example.contactmanagement;

import
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username =(TextView) findViewById(R.id.username)
        TextView password =(TextView) findViewById(R.id.password)
        MaterialButton signinbtn = (MaterialButton) findViewById(R.id.signinbtn);
        //admin and admin
        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().tostring().equals("admin") && password.getText().tostring().equals("admin")) {
                    //correct
                    Toast.makeText(MainActivity.this,"Login successsful",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
}
