package com.study.java.인터페이스;

public class LottoMachineImpl implements LottoMachine{
    private Ball[] balls;
    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    @Override
    public void mix() {
        for(int i=0; i<10000; i++) {
            int x1 = (int)(Math.random() * MAX_BALL_COUNT);
            int x2 = (int)(Math.random() * MAX_BALL_COUNT);
            if(x1 != x2) {
                Ball tmp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }
    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[RETURN_BALL_COUNT];
        for(int i = 0; i< RETURN_BALL_COUNT; i++) {
            result[i] = balls[i];
        }
        return result;
    }
}
