package hk.disign.proxy.model;

/**
 * Created by jian.shui on 2019/1/4
 */
public class MonitorUtil {
    private static ThreadLocal<Long> tl = new ThreadLocal<>();

    public static void start() {
        tl.set(System.currentTimeMillis());
    }

    //����ʱ��ӡ��ʱ
    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "������ʱ" + (finishTime - tl.get()) + "ms");
    }
}
