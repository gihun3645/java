package 팩토리_메소드_패턴과__자바_리플렉션;


public class BeanFactoryMain {
    public static void main(String[] args) {

        BeanFactory bf1 = BeanFactory.getInstance();
        BeanFactory bf2 = BeanFactory.getInstance();
        if(bf1 == bf2) {
            System.out.println("bf1 == bf2");
        }

        Bus b1 = bf1.getBus();
        Bus b2 = bf1.getBus();

        // 객체생성을 대신해주는 클래스를 팩토리라고함
    }
}
