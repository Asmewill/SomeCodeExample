package hk.disign.share.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jian.shui on 2019/1/24
 */
public class ShareBikeFactory {
    Map<String,IBike> pool=new HashMap<>();
    public  IBike getBike(String name){
        IBike iBike=null;
        if(!pool.containsKey(name)){
            iBike=new ShareBike();
            pool.put(name,iBike);
            System.out.println("����199ԪѺ�𣬿����ó�:"+name);
        }else{
            iBike=pool.get(name);
            System.out.println("Ѻ���ѽ���ֱ���ó�:"+name);
        }
        return iBike;
    }
}
