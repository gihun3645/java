package 제네릭과_컬렉션_프레임워크;

// 아직은 정해지지 않은 타입인 T를 쓰겠다.
public class GenericBox<T> {
    private T t;

    public void add(T obj) {
        this.t = obj;
    }

    public T get() {
        return this.t;
    }
}
