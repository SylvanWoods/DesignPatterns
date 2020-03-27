package com.designpatterns.state;

public class State2 implements TravelWay {



    @Override
    public void sayState() {
        System.out.println(this.getClass().getName());
    }


}
