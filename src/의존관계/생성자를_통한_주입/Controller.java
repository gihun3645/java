package 의존관계.생성자를_통한_주입;


public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void callService() {
        service.doSomething();
    }
}
