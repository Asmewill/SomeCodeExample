package hk.disign.proxy.model;

/**
 * Created by jian.shui on 2019/1/4
 */
public class Student implements Person {
    private String name;
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            //������Ǯ����һ��ʱ��
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "�Ͻ����50Ԫ");
    }
}
