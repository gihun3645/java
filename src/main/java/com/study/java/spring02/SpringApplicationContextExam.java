package com.study.java.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.java.exam.Book;

public class SpringApplicationContextExam {
    public static void main(String[] args) {
        // 인스턴스를 인터페이스 타입으로 참조할 수 있다.
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book1 = (Book)context.getBean("book1"); //빈은 기본적으로 오브젝트 타입으로 리턴하기 때문에 형변환을 해줘야
        // 아니면 이렇게
//        Book book2 = context.getBean("book1", Book.class);
        
        book1.setTitle("즐거운 Spring Boot");
        book1.setPrice(5000);
        
        System.out.println(book1.getTitle());
        System.out.println(book1.getPrice());
        
        Book book2 = (Book)context.getBean("book2");
        System.out.println(book2.getTitle()); // null
    }
}
