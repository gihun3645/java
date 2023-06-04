package com.study.java.인터페이스;

public interface LottoMachine {
    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;
    public void setBalls(Ball[] balls);
    public void mix();
    public Ball[] getBalls();
}
