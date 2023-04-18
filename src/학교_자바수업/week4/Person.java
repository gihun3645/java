package 학교_자바수업.week4;

public class Person {
    private String name1;
    private String name2;
    private int age;

    public Person(String fName, String gName, int age) {
        this.name1 = fName;
        this.name2 = gName;
        this.age = age;
    }

    public Person(String name, int age) {
        int index = name.indexOf(" ");
        name1 = name.substring(0, index);
        name2 = name.substring(index + 1);
        this.age = age;
    }


    public String toString() {
        return "이름=" + name1 + " " + name2 + ", 나이=" + age;
    }

    public boolean equals(Person other) {
        return name1.equals(other.name1)
                && name2.equals(other.name2)
                && age == other.age;
    }
}
