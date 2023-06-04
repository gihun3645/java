package com.study.java.EnumType;

public enum Gender {
    MALE("XY"),
    FEMALE("XX");

    private String chromosome; // 염색체
    private Gender(String chromosome) {
        this.chromosome = chromosome;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "chromosome='" + chromosome + '\'' +
                '}';
    }

    public void print() {
        System.out.println("염색체 정보 : "+chromosome);
    }
}
