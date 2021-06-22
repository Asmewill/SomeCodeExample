package hk.disign.prototype.model;

/**
 * Created by Administrator on 2018/11/10
 * https://www.jianshu.com/p/6d1333917ae5
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Card card1=new Card();
        card1.setNum(111);
        card1.setSpec(66,67);
        System.out.println(card1.toString());
        System.out.println("---------------------");
        //����
        Card card2=card1.clone();
        System.out.println(card2.toString());
        System.out.println("---------------------");
        //����֮��card2��num�������¸�ֵ
        card2.setNum(222);
        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println("---------------------");
        //����֮��card2��Spec�������¸�ֵ֮����card1Ҳ���Ÿı��ˣ����־���ǳ����
        card2.setSpec(76,77);
        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println("---------------------");







    }
}
