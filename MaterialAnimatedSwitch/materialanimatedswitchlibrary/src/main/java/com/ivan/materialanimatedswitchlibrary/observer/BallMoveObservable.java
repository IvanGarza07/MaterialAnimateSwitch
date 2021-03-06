package com.ivan.materialanimatedswitchlibrary.observer;

import java.util.Observable;


public class BallMoveObservable extends Observable {

    private int ballAnimationValue;
    private int ballPosition;

    public void setBallAnimationValue(int val) {
        this.ballAnimationValue = val;
        setChanged();
        notifyObservers();
    }

    public void update() {
        setChanged();
        notifyObservers();
    }

    public int getBallAnimationValue() {
        return ballAnimationValue;
    }

    public void setBallPosition(int ballPosition) {
        this.ballPosition = ballPosition;
    }

    public int getBallPosition() {
        return ballPosition;
    }
}
