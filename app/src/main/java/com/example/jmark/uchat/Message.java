package com.example.jmark.uchat;

/**
 * Created by jmark on 2017-10-19.
 */

public abstract class Message {

    private String senderId;
    private String receiverId;
    private String time;
    private String messageId;
    private String message;
    private Integer tag;

    public void message(String messageId, String message, String time, String senderId, String receiverId, Integer tag){
        this.messageId = messageId;
        this.message = message;
        this.time = time;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.tag = tag;
    }
    /*
    public String getMessageId()  {return messageId;}
    public String getMessage()    {return message;}
    public String getSenderId()   {return senderId;}
    public String getReceiverId() {return receiverId;}
    public String getTime()       {return time;}
    */
}
