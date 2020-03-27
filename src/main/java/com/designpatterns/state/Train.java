package com.designpatterns.state;

public class Train implements TravelWay {


    @Override
    public void travelWay() {
        System.out.println(this.getClass().getName());
    }
}
