package com.ufv.restservice.restservice;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getld() {
        return id;
    }

    public String getContent(){
        return content;
    }
}