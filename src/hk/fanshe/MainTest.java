package hk.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTest {
    public static void main(String[] args){
        //1.��ȡClass�����ַ�ʽ
        //Class.forName(className)��ͨ�����ȫ�޶�����ȡ����� Class ����
        Class class1=null;
        try {
             class1=Class.forName("hk.fanshe.SmallPineapple");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //ͨ�����ȫ�޶�����ȡ����� Class ����
        Class class2=SmallPineapple.class;
        //ʵ��.getClass()��ͨ��ʵ���������ȡ��ʵ���� Class ����
        Class class3=new SmallPineapple().getClass();

        System.out.println("Class.forName() == SmallPineapple.class:" + (class1 == class2));
        System.out.println("Class.forName() == instance.getClass():" + (class1 == class3));
        System.out.println("instance.getClass() == SmallPineapple.class:" + (class2 == class3));

        //2.�������ʵ��������Ķ��ַ�ʽ

        //Class �������newInstance()����
        SmallPineapple instance1=null;
        try {
             instance1= (SmallPineapple) class1.newInstance();//newInstance() ����ʵ�������Ĭ���޲ι�������
        } catch (Exception e) {
            e.printStackTrace();
        }
        instance1.getInfo();

        //Constructor ����������newInstance()����
        Constructor constructor = null;
        SmallPineapple instance2 = null;
        try {
            constructor = class2.getConstructor(String.class, int.class);
            instance2 = (SmallPineapple) constructor.newInstance("С����", 21);
            constructor.setAccessible(true);
            instance2.getInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //��ȡ���еı�����Field��
        //Field[] getFields()����ȡ�������б�public���ε����б���
        //Field getField(String name)�����ݱ�������ȡ���е�һ���������ñ������뱻public����
        //Field[] getDeclaredFields()����ȡ�������еı��������޷���ȡ�̳������ı���
        //Field getDeclaredField(String name)������������ȡ���е�ĳ���������޷���ȡ�̳������ı���


        //��ȡ���еķ�����Method��
        //Method[] getMethods()����ȡ���б�public���ε����з���
        //Method getMethod(String name, Class...<?> paramTypes)���������ֺͲ������ͻ�ȡ��Ӧ�������÷������뱻public����
        //Method[] getDeclaredMethods()����ȡ���з��������޷���ȡ�̳������ķ���
        //Method getDeclaredMethod(String name, Class...<?> paramTypes)���������ֺͲ������ͻ�ȡ��Ӧ�������޷���ȡ�̳������ķ���


        //��ȡ��Ĺ�������Constructor��
        //Constuctor[] getConstructors()����ȡ�������б�public���εĹ�����
        //Constructor getConstructor(Class...<?> paramTypes)�����ݲ������ͻ�ȡ����ĳ�����������ù��������뱻public����
        //Constructor[] getDeclaredConstructors()����ȡ�������й�����
        //Constructor getDeclaredConstructor(class...<?> paramTypes)�����ݲ������ͻ�ȡ��Ӧ�Ĺ�����

       //ÿ�ֹ����ڲ��� Declared ϸ��Ϊ2�ࣺ
       //��Declared���εķ��������Ի�ȡ�����ڲ����������б����������͹������������޷���ȡ�̳���������Ϣ
       //��Declared���εķ��������Ի�ȡ������public���εı����������͹��������ɻ�ȡ�̳���������Ϣ


        //3.ͨ��������÷���
        //3.1�޲�����public����
        Method method = null;
        try {
            method = class3.getMethod("getInfo");
            if (method != null) {
                //method.invoke(class3.getConstructor(String.class,int.class,String.class).newInstance("С����",18,"48kg"),null);
                method.invoke(instance2,null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //3.2�в�����private����
        Method method1 = null;
        try {
            method1 = class3.getDeclaredMethod("getDetailInfo",String.class,int.class,String.class);
            method1.setAccessible(true);
            if (method1 != null) {
                //method.invoke(class3.getConstructor(String.class,int.class,String.class).newInstance("С����",18,"48kg"),null);
                method1.invoke(instance2,"����",36,"48kg");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //4.ͨ���������˽������
        try {
            SmallPineapple sp = new SmallPineapple("С����", 666,"54kg");
            Class clazz = sp.getClass();

            Field field = clazz.getDeclaredField("weight");
            field.setAccessible(true);
            System.out.println("���ﵽС���ܵ������ǣ�" + field.get(sp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //5.��ȱ��
    //�����˳��������ԣ������ƻ�����ķ�װ�ԣ�ͬʱ��������ܵ����
    //���÷����������ʱ���������޷���ǰ��֪��������ͣ������Ƿ�Ϸ���
    // �������������Ƿ�ƥ�䡣ֻ���ڳ�������ʱ���÷���Ĵ���ʱ�Ż��ͷ��ʼ��顢���á����ؽ��


}
