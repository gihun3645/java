package 의존관계.수정자를_통한_주입;

public class ServiceImpl implements Service{
    @Override
    public void doSomething() {
        System.out.println("serviceImpl is doing something");
    }
}
