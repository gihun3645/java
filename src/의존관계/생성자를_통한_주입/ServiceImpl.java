package 의존관계.생성자를_통한_주입;

public class ServiceImpl implements Service {
    @Override
    public void doSomething() {
        System.out.println("serviceImpl is doing something");
    }
}
