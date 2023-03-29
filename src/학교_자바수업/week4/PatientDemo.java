package 학교_자바수업.week4;

import java.util.Scanner;

public class PatientDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("이름을 입력하시오:");
        String name = input.nextLine().trim();
        System.out.println("키를 입력하시오(cm):");
        double height = input.nextDouble();
        System.out.println("체중을 입력하시오(kg):");
        double weight = input.nextDouble();

        Patient p = new Patient(name, height, weight);
        System.out.println(p.getName()+"의 BMI = "+ p.getBMI());
    }
}
