package com.example.jmark.uchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();

    }
    //method to go to messages when you login and store user input
    public void login() {
        // get username by id and store it into "inputUsername"
        EditText inputUsername = (EditText) findViewById(R.id.usernameBox);
        // Store typed username - Input in variable
        String username = inputUsername.getText().toString();
        // get password by id and store it into "inputPassword"
        EditText inputPassword = (EditText) findViewById(R.id.passwordBox);
        // Store typed password - Input in variable
        String password = inputPassword.getText().toString();

        Button button = (Button) findViewById(R.id.signInButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent showMessages = new Intent(MainActivity.this, Messages.class);
                startActivity(showMessages);
            }
        });
    }
}
