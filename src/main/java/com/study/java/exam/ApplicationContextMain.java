//package com.study.java.exam;
//
//public class ApplicationContextMain {
//	public static void main(String[] args) throws Exception{
//		ApplicationContext context = ApplicationContext.getInstance();
//		ApplicationContext context2 = ApplicationContext.getInstance();
//		if (context == context2 )
//			System.out.println("(싱글턴이라 같은 메모리를 사용해서  2개의 context는 같다)");
//
//		Book book = (Book)context.getBean("book1");
//		book.setPrice(5000);
//		book.setTitle("즐거운자바 ");
////
//		System.out.println(book.getPrice());
//		System.out.println(book.getTitle());
//
//		System.out.println("=================");
//		Book book2 = (Book)context.getBean("book1");
//		System.out.println(book2.getTitle()); // getBean  메서드를 호출할 때 마다 인스턴스를 새로 생성
//
//		if (book == book2) {
//			System.out.println("같은 ");
//		} else {
//			System.out.println("다른 ");
//		}
//	}
//}