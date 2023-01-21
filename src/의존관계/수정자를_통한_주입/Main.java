package 의존관계.수정자를_통한_주입;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        // 어떤 구현체이든, 구현체가 어떤방법으로 구현되든 service 인터페이스를 구현하기만 하면 된다.
        controller.setService(new Service() {
            @Override
            public void doSomething() {
                System.out.println("Anonymous class is doing something");
            }
        });

        controller.setService(
                () -> System.out.println("Lambda implementation is doing something")
        );

        // 어떻게든 구현체를 주입하고 호출하면 된다.
        controller.callService();
    }
}
