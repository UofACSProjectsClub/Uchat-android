package com.example.jmark.uchat;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jmark on 2017-10-19.
 */

public abstract class Chat {

    private String chatId;
    public ArrayList<Message> messages = new ArrayList<Message>();
    public ArrayList<User> participants = new ArrayList<User>();

    public void chat(String chatId, ArrayList<Message> messages, ArrayList<User> participants){
        this.chatId = chatId;
        this.messages = messages;
        this. participants = participants;

    }

}
