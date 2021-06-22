package hk.com.example.genericty;

/***
 * 定义一个泛型接口
 * @param <T>
 */

public interface Generator<T> {

    public T next();
}
