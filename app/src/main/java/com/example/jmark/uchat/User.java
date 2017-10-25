package com.example.jmark.uchat;

import java.util.ArrayList;

/**
 * Created by jmark on 2017-10-19.
 */

public abstract class User {

    private String uid;
    private String email;
    private ArrayList<Message> messages = new ArrayList<>();
    private ArrayList<Chat> chats = new ArrayList<>();

    public void User (String uid, String email, ArrayList<Message> messages, ArrayList<Chat> chats){
        this.uid = uid;
        this.email = email;
        this.messages = messages;
        this.chats = chats;
    }

}
