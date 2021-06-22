package hk.disign.strategy.model;

/**
 * Created by Administrator on 2018/11/10
 *http://baijiahao.baidu.com/s?id=1601547440739500969&wfr=spider&for=pc
 */
public class MainTest {
    public static void main(String[] args){
        Strategy addStrage=new AddStrategy();
        Environment environment=new Environment(addStrage);
        int sum1=environment.calc(10,10);
        System.out.println("Result1:"+sum1);
        Strategy subStrage=new SubStrategy();
        int sum2=subStrage.calc(20,10);
        System.out.println("Result2:"+sum2);
    }
}
