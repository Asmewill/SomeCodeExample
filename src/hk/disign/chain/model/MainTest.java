package hk.disign.chain.model;

/**
 * Created by Administrator on 2018/11/10
 * https://blog.csdn.net/u012810020/article/details/71194853
 */
public class MainTest {
    public static void main(String[] args){
        //д��һ
        Request.Builder builder=new Request.Builder();//ͨ����̬�ڲ��๹��builder����
        builder.setName("zhangsan");
        builder.setDays("5");
        builder.setReason("�¼�");
        Request request=builder.build();//build��������request����
        //д����
        Request request1=new Request.Builder().setName("lisi").setDays("7").setReason("�¼�").build();
        //System.out.print("�����"+request.toString());

        ChainOfResponsibilityClient client=new ChainOfResponsibilityClient();
        client.addRatifys(new CustomInterceptor());
        Result result=client.execute(request);
        System.out.println("���:"+result.toString());

    }
}
