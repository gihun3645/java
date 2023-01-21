package 의존관계.생성자를_통한_주입;

public class Main {
    public static void main(String[] args) {

        Controller controller1 = new Controller(new ServiceImpl());
        Controller controller2 = new Controller(
                () -> System.out.println("Lambda implementationis doing something")
        );
        Controller controller3 = new Controller(new Service() {
            @Override
            public void doSomething() {
                System.out.println("Anonymous class is doing something");
            }
        });
        controller1.callService();
        controller2.callService();
        controller3.callService();
    }
}
