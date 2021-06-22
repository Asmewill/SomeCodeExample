package hk.com.example.genericty;

public class GenericFruit  {
    /**
     * 这才是一个真正的泛型方法。
     * 首先在public与返回值之间的<T>必不可少，这表明这是一个泛型方法，并且声明了一个泛型T
     * 这个T可以出现在这个泛型方法的任意位置.
     * 泛型的数量也可以为任意多个
     *    如：public <T,K> K showKeyName(Generic<T> container){
     *        ...
     *        }
     */


    static class Fruit{
        @Override
        public String toString() {
            return super.toString();
        }
    }
    static class Apple extends Fruit{
        @Override
        public String toString() {
            return super.toString();
        }
    }
    static class Person{
        @Override
        public String toString() {
            return super.toString();
        }
    }

    static class GeneratorTest<T> {
        public  void show_1(T t){
            System.out.println(t.toString());
        }
        public <E> void show_2(E e){
            System.out.println(e.toString());
        }
        public <T> void show_3(T t){
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args){
        Apple apple=new Apple();
        Person person=new Person();
        GeneratorTest<Fruit>  fruitGeneratorTest=new GeneratorTest<>();
        //apple是Fruit的子类，所以这里可以
        fruitGeneratorTest.show_1(apple);
        //编译器会报错，因为泛型类型实参指定的是Fruit，而传入的实参类是Person
       // fruitGeneratorTest.show_1(person);
        //使用这两个方法都可以成功
        fruitGeneratorTest.show_2(apple);
        fruitGeneratorTest.show_2(person);
        //使用这两个方法都可以成功
        fruitGeneratorTest.show_3(apple);
        fruitGeneratorTest.show_3(person);
    }



}
