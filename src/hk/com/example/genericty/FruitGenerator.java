package hk.com.example.genericty;

/***
 * @param <T>
 */

import java.util.Random;

/**��ʵ�ַ��ͽӿڵ��࣬δ���뷺��ʵ��ʱ��
 * �뷺����Ķ�����ͬ�����������ʱ���轫���͵�����Ҳһ��ӵ�����
 * ����class FruitGenerator<T> implements Generator<T>{
 * ������������ͣ��磺class FruitGenerator implements Generator<T>���������ᱨ��"Unknown class"
 */
//public class FruitGenerator<T> implements Generator<T> {
//    @Override
//    public T next() {
//        return null;
//    }
//}
public class FruitGenerator implements Generator<String> {
    private String[] friuts=new String[]{"apple","blanana","pear"};

    @Override
    public String next() {
        Random random=new Random();
        return friuts[random.nextInt(3)];
    }
}