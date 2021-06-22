package hk.disign.chain.model;

/**
 * Created by jian.shui on 2019/1/8
 */
public class CustomInterceptor implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request=chain.request();
        System.out.println("CustomInterceptor====>"+request.toString());
        String reason=request.getReason();
        if(reason!=null&&reason.equals("�¼�")){
              Request newRequest=new Request.Builder().newRequest(request).setCustomInfo(request.getName()+"������¼٣����Һ��ż������쵼����һ��").build();
              System.out.println("CustomInterceptor====>ת������");
              return chain.proceed(newRequest);
        }
        return new Result(true,"ͬ�����");
    }
}
