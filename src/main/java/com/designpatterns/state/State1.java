package com.designpatterns.state;

public class State1 implements TravelWay {


    @Override
    public void sayState() {
        System.out.println(this.getClass().getName());
    }
}
