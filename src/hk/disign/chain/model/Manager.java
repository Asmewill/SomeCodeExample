package hk.disign.chain.model;

/**
 * Created by jian.shui on 2019/1/8
 */
public class Manager implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request=chain.request();
        System.out.println("Manager====>request:"+request.toString());
        if(Integer.parseInt(request.getDays())>3){
            //�����µ�Request
            Request newRequest=new Request.Builder().newRequest(request).setManagerInfo(request.getName()+"ÿ�µ�KPI���˻�����,������׼").build();
            return chain.proceed(newRequest);

        }
        return new Result(true,"Manager:����������꣬��Ŀ�벻����");
    }
}
