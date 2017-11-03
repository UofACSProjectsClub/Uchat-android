//WARNING, THIS IS FOR CHATS, NOT FOR MESSAGES

package com.example.jmark.uchat;

import android.content.Intent;
import android.support.v4.util.LogWriter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Messages extends AppCompatActivity {
    public int chatsToDisplay = 4;
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Uchat                Chats");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        listView = (ListView) findViewById(R.id.chats);
        ArrayList<String> chats = new ArrayList<>();
        //fill the chats array with the names of people you're chatting
        for(int i=1;i<11;i++){
            chats.add("Chat" + Integer.toString(i));

        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, chats);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
                Intent showMessages = new Intent(Messages.this, displayMessages.class);
                startActivity(showMessages);

            }
        });

    }

}
