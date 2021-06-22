package hk.disign.chain.model;

import java.util.ArrayList;

/**
 * Created by jian.shui on 2019/1/8
 */
public class ChainOfResponsibilityClient {
    private ArrayList<Ratify> ratifies;

    public ChainOfResponsibilityClient() {
        ratifies=new ArrayList<>();
    }

    /**
     * 为了展示“责任链模式”的真正的迷人之处（可扩展性），在这里构造该方法以便添加自定义的“责任人”
     * @param ratify
     */
    public void addRatifys(Ratify ratify){
        ratifies.add(ratify);
    }

    /***
     *
     * 方法描述：执行请求
     * @param request
     * @return
     */

    public Result execute(Request request){
        ArrayList<Ratify> arrayList=new ArrayList<>();
        arrayList.addAll(ratifies);
        arrayList.add(new GroupLeader());
        arrayList.add(new Manager());
        arrayList.add(new DepartmentHeader());
        RealChain realChain=new RealChain(arrayList,request,0);
        return realChain.proceed(request);
    }
}
