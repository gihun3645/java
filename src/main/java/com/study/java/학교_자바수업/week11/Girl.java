package com.study.java.학교_자바수업.week11;

class Girl {
    public String name;

    public Girl(String name) {
        this.name = name;
    }

    public String show() {
        return name + "는 자바 초보자야";
    }
}

class GoodGirl extends Girl {
    public GoodGirl(String name) {
        super(name);
    }

    @Override
    public String show() {
        return name + "는 자바 잘 해";
    }
}

class BestGirl extends GoodGirl {
    public BestGirl(String name) {
        super(name);
    }

    @Override
    public String show() {
        return name + "는 자바 엄청 잘 해";
    }
}