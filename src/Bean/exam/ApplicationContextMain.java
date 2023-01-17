package Bean.exam;

import 상속.Parent;

public class ApplicationContextMain {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = ApplicationContext.getInstance();
        ApplicationContext context2 = ApplicationContext.getInstance();

        if(context == context2) {
            System.out.println("2개의 context는 같다.");
        }
        System.out.println("--------------");
//        Object book1 = context.getBean("book1");
        Book book = (Book)context.getBean("book1"); // id에 해당하는 인스턴스를 달라.
        book.setPrice(5000);
        book.setTitle("즐거운 자바");

        System.out.println(book.getPrice());
        System.out.println(book.getTitle());
        // 5000
        // 즐거운 자바

        System.out.println("-------------");
        Book book2 = (Book)context.getBean("book1");
        System.out.println(book2.getTitle());

        if(book == book2) {
            System.out.println("같은 인스턴스");
        } else {
            System.out.println("다른 인스턴스");
        }
    }
}
