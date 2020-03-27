package com.designpatterns.state;

public class Xiaomi extends People {

    public void sayState(){
        System.out.println(getName());
        this.travelWay.sayState();
        System.out.println(getMessage());
    }


    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
