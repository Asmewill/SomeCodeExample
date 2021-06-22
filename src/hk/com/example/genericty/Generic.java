package hk.com.example.genericty;

/**
 * 泛型上边界
 * @param <T>
 */

public class Generic<T extends Number> {
    T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
