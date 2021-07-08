package hk.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTest {
    public static void main(String[] args){
        //1.获取Class的三种方式
        //Class.forName(className)：通过类的全限定名获取该类的 Class 对象
        Class class1=null;
        try {
             class1=Class.forName("hk.fanshe.SmallPineapple");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //通过类的全限定名获取该类的 Class 对象
        Class class2=SmallPineapple.class;
        //实例.getClass()：通过实例化对象获取该实例的 Class 对象
        Class class3=new SmallPineapple().getClass();

        System.out.println("Class.forName() == SmallPineapple.class:" + (class1 == class2));
        System.out.println("Class.forName() == instance.getClass():" + (class1 == class3));
        System.out.println("instance.getClass() == SmallPineapple.class:" + (class2 == class3));

        //2.构造类的实例化对象的二种方式

        //Class 对象调用newInstance()方法
        SmallPineapple instance1=null;
        try {
             instance1= (SmallPineapple) class1.newInstance();//newInstance() 构造实例会调用默认无参构造器。
        } catch (Exception e) {
            e.printStackTrace();
        }
        instance1.getInfo();

        //Constructor 构造器调用newInstance()方法
        Constructor constructor = null;
        SmallPineapple instance2 = null;
        try {
            constructor = class2.getConstructor(String.class, int.class);
            instance2 = (SmallPineapple) constructor.newInstance("小菠萝", 21);
            constructor.setAccessible(true);
            instance2.getInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取类中的变量（Field）
        //Field[] getFields()：获取类中所有被public修饰的所有变量
        //Field getField(String name)：根据变量名获取类中的一个变量，该变量必须被public修饰
        //Field[] getDeclaredFields()：获取类中所有的变量，但无法获取继承下来的变量
        //Field getDeclaredField(String name)：根据姓名获取类中的某个变量，无法获取继承下来的变量


        //获取类中的方法（Method）
        //Method[] getMethods()：获取类中被public修饰的所有方法
        //Method getMethod(String name, Class...<?> paramTypes)：根据名字和参数类型获取对应方法，该方法必须被public修饰
        //Method[] getDeclaredMethods()：获取所有方法，但无法获取继承下来的方法
        //Method getDeclaredMethod(String name, Class...<?> paramTypes)：根据名字和参数类型获取对应方法，无法获取继承下来的方法


        //获取类的构造器（Constructor）
        //Constuctor[] getConstructors()：获取类中所有被public修饰的构造器
        //Constructor getConstructor(Class...<?> paramTypes)：根据参数类型获取类中某个构造器，该构造器必须被public修饰
        //Constructor[] getDeclaredConstructors()：获取类中所有构造器
        //Constructor getDeclaredConstructor(class...<?> paramTypes)：根据参数类型获取对应的构造器

       //每种功能内部以 Declared 细分为2类：
       //有Declared修饰的方法：可以获取该类内部包含的所有变量、方法和构造器，但是无法获取继承下来的信息
       //无Declared修饰的方法：可以获取该类中public修饰的变量、方法和构造器，可获取继承下来的信息


        //3.通过反射调用方法
        //3.1无参数的public方法
        Method method = null;
        try {
            method = class3.getMethod("getInfo");
            if (method != null) {
                //method.invoke(class3.getConstructor(String.class,int.class,String.class).newInstance("小菠萝",18,"48kg"),null);
                method.invoke(instance2,null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //3.2有参数的private方法
        Method method1 = null;
        try {
            method1 = class3.getDeclaredMethod("getDetailInfo",String.class,int.class,String.class);
            method1.setAccessible(true);
            if (method1 != null) {
                //method.invoke(class3.getConstructor(String.class,int.class,String.class).newInstance("小菠萝",18,"48kg"),null);
                method1.invoke(instance2,"大菠萝",36,"48kg");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //4.通过反射访问私有属性
        try {
            SmallPineapple sp = new SmallPineapple("小菠萝", 666,"54kg");
            Class clazz = sp.getClass();

            Field field = clazz.getDeclaredField("weight");
            field.setAccessible(true);
            System.out.println("窥觑到小菠萝的体重是：" + field.get(sp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //5.优缺点
    //增加了程序的灵活性，但是破坏了类的封装性，同时会带来性能的损耗
    //利用反射操作对象时，编译器无法提前得知对象的类型，访问是否合法，
    // 参数传递类型是否匹配。只有在程序运行时调用反射的代码时才会从头开始检查、调用、返回结果


}
