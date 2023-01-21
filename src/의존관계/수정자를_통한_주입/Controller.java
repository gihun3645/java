package 의존관계.수정자를_통한_주입;


public class Controller {
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void callService() {
        service.doSomething();
    }
}
