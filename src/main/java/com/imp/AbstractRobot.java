package com.imp;

import com.interfaces.Hand;
import com.interfaces.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public abstract class AbstractRobot implements InitializingBean, DisposableBean {
    private Hand hand;
    private Leg leg;
    private String colour;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(toString() + ": !!! afterPropertiesSet of InitializingBean invoked !!!");
    }

    @Override
    public void destroy(){
        System.out.println(toString() + ": !!! destroy of DisposableBean invoked !!!");
    }

    public void printMe() {
        hand.catchSmth();
        leg.leg();
        System.out.println("colour is " + colour);
        System.out.println();
    }

    public AbstractRobot(Hand hand, Leg leg, String colour) {
        this.hand = hand;
        this.leg = leg;
        this.colour = colour;
    }

    public AbstractRobot() {
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
