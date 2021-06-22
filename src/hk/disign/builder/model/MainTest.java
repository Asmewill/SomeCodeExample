package hk.disign.builder.model;

/**
 * Created by Administrator on 2018/11/10
 * https://blog.csdn.net/u012810020/article/details/71194853
 */
public class MainTest {
    public static void main(String[] args){
       Request request=new Request.Builder()
               .setName("shuijian")
               .setReason("GoHome")
               .setDays("2days")
               .build();
       System.out.println(request.toString());
    }
}
