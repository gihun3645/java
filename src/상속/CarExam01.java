package 상속;

public class CarExam01 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.run();
        b1.안내방송();

        Car c1 = new Bus(); // 버스는 자동차다/
        c1.run();
        // c1.안내방송(); 컴파일 에러가 발생한다.
        // Bus 인스턴스르 Car 타입으로 참조하면 Car 타입의 메소드만 사용가능함
        // Bus가 가지고 있는 추가적인 메소드를 사용하려면..?
        Bus b2 = (Bus)c1;
        // c1이 참조하는 Bus 인스턴스를 원래의 Bus 형태로 참조해서 사용하겠다고 선언
        // c1이 참조하는 인스턴스가 Bus 여서 가능함
        b2.안내방송();

        Car c2 = new SuperCar();
        c2.run(); // 사륜구동으로 달린다.(슈퍼카)
    }
}
