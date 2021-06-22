package hk.disign.chain.model;

/**
 * Created by jian.shui on 2019/1/8
 */
public class DepartmentHeader implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request=chain.request();
        System.out.println("DepartmentHeader=====>request:"+request.toString());
        if(Integer.parseInt(request.getDays())>7){
              return  new Result(false,"DepartmentHeader:�����ʱ��̫��,������׼");
        }
        return new Result(true,"DepartmentHeader:��Ҫ�ż��������鴦�����ڻ���!");
    }
}
