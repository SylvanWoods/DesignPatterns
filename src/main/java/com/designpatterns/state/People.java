package com.designpatterns.state;

public abstract class People {

    protected String name;

    protected String message;

    protected TravelWay travelWay;

    public void changeState(TravelWay travelWay){
        this.travelWay = travelWay;
    }


    protected void saySate(){
        this.travelWay.travelWay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
