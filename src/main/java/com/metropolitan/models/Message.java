package com.metropolitan.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;


public class Message implements Serializable {

    private String content;
    private String type;

    public Message() {
    }

    public Message(String content, String type) {
        this.content = content;
        this.type = type;
    }




    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
