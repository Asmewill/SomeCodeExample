package hk.disign.proxy.model;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by jian.shui on 2019/1/4
 *https://www.cnblogs.com/gonjan-blog/p/6685611.html
 */
public class ProxyTest {
    public static void main(String[] args) {
        //����һ��ʵ��������������Ǳ�����Ķ���
        Person zhangsan = new Student("����");

        //����һ�����������������InvocationHandler
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangsan);

        //����һ���������stuProxy������zhangsan����������ÿ��ִ�з��������滻ִ��Invocation�е�invoke����
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);

        //����ִ���Ͻ���ѵķ���
        stuProxy.giveMoney();

    }

}
