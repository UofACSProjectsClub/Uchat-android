package com.example.jmark.uchat;

import android.support.v4.util.LogWriter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Messages extends AppCompatActivity implements View.OnClickListener {
    public int chatsToDisplay = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        //creates the number of chats necessary
        for (int i = 0; i < chatsToDisplay; i++) {
            Log.i("test", "test");
            chatButton(i);
        }
    }
   public void onClick(View v) {
        // default method for handling onClick Events..
       Log.i("test", "test");
   }

    //initiates the chat button for a specific chat
    public void chatButton(int i) {
        switch (i) {
            case 0:
                Button btn0 = (Button) findViewById(R.id.chat0);
                btn0.setOnClickListener(this);
                break;
            case 1:
                Button btn1 = (Button) findViewById(R.id.chat1);
                btn1.setOnClickListener(this);
                break;
            case 2:
                Button btn2 = (Button) findViewById(R.id.chat2);
                btn2.setOnClickListener(this);
                break;
            case 3:
                Button btn3 = (Button) findViewById(R.id.chat3);
                btn3.setOnClickListener(this);
                break;
            case 4:
                Button btn4 = (Button) findViewById(R.id.chat4);
                btn4.setOnClickListener(this);
                break;
        }
    }
}
