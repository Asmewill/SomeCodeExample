package hk.disign.chain.model;

/**
 * Created by jian.shui on 2019/1/8
 * 处理请求
 */
public interface Ratify {
    //处理请求
    public Result deal(Chain chain);
    //对request和result封装，用来转发
    interface Chain{
        //获取当前的request
        Request request();
        //转发Request
        Result proceed(Request request);
    }
}
