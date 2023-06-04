package com.study.java.EnumType;

public enum Country {
    KOREA {
        public void print() {
            System.out.println("대한민국");
        }
    },
    JAPAN {
        public void print() {
            System.out.println("일본");
        }
    },
    USA {
        public void print() {
            System.out.println("미국");
        }
    };
    public abstract void print();
}
