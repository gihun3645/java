package 학교_자바수업.practice;

import javax.swing.*;
import java.io.*;
import java.text.DecimalFormat;

public class BMI {
    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("키를 입력하시오(cm) : ");
//        Double height = Double.parseDouble(br.readLine());
//        System.out.println("체중을 입력하시오(kg) : ");
//        Double weight = Double.parseDouble(br.readLine());
//        br.close();
//
//        Double bmi = weight / ((height / 100) * (height / 100));
//        System.out.println("체질량 지수 : " + bmi);

        double height = Double.parseDouble(JOptionPane.showInputDialog("키를 입력하시오(cm) : "));
        double weight = Double.parseDouble(JOptionPane.showInputDialog("체중을 입력하시오(kg) : "));
        double bmi = weight / ((height / 100) * (height / 100));

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedBmi = df.format(bmi);

        JOptionPane.showMessageDialog(null, "체질량 지수 : " + formattedBmi);
        System.exit(0);
    }
}
