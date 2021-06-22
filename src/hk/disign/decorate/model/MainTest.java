package hk.disign.decorate.model;

/**
 * https://www.jianshu.com/u/dc1e37336946
 * Created by Administrator on 2018/11/10
 * https://blog.csdn.net/z4909801/article/details/59059263
 * װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ������Ƕ�̬�ģ�
 * Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͳһ�ӿڻ��߼̳�ͬһ�����࣬װ�ζ�����б�װ�ζ����ʵ����
 * https://www.jianshu.com/p/df1a96c5c046
 */
public class MainTest {

    public static void main(String[] args){
        Food food=new Food("�㳦");
        Bread bread=new Bread(food);
        Cream cream=new Cream(bread);
        Vegetable vegetable=new Vegetable(cream);
        System.out.print("���н����"+vegetable.make()+"\n");
    }
}
