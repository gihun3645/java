package com.study.java.학교_자바수업.week5;

public class Bunsu {
    private int bunja, bunmo;
    private int gcd(int x, int y) {
        return (y!=0) ? gcd(y, x%y) : x;
    }



    public Bunsu(int bunja, int bunmo) {
        this.bunja = bunja;
        this.bunmo = bunmo;
    }

    public String toString() {
        return bunja + "/" + bunmo;
    }

    public Bunsu times(Bunsu b) {
//        return new Bunsu(bunja * b.bunja, bunmo * b.bunmo);
        Bunsu result = new Bunsu(0, 0);
        // 도트 문법 분자 분모의 결과를 result에 저장
        result.bunja = bunja * b.bunja;
        result.bunmo = bunmo * b.bunmo;
        return result;
    }

    public Bunsu plus(Bunsu b) {
        Bunsu result = new Bunsu(0, 0);
        result.bunja = bunja * b.bunmo + bunmo * b.bunja;
        result.bunmo = bunmo * b.bunmo;
        return result;
    }

    public Bunsu minus(Bunsu b) {
        Bunsu result = new Bunsu(0, 0);
        result.bunja = bunja * b.bunmo - bunmo * b.bunja;
        result.bunmo = bunmo * b.bunmo;
        return result;
    }
}
