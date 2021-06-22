package hk.disign.chain.model;

/**
 * Created by jian.shui on 2019/1/8
 */
public class GroupLeader implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request=chain.request();
        System.out.println("GroupLeader====>request:"+request.toString());
        if(Integer.parseInt(request.getDays())>1){
            //��װ�µ�Request����
            Request newRequest=new Request.Builder().newRequest(request).setManagerInfo(request.getName()+"ƽʱ���ֲ���,����������Ŀ��æ").build();
            return chain.proceed(newRequest);
        }
        return new Result(true,"GroupLeader:��ȥ���");
    }
}
