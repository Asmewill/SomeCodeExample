package hk.thread.pool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/11/10
 * https://www.cnblogs.com/ljp-sun/p/6580147.html
 * https://blog.csdn.net/l540675759/article/details/62230562
 */
public class MainTest {
    public static void main(String[] args){

//        //线程池中只允许同时存在2个线程
//        System.out.println("****************************newFixedThreadPool*******************************");
//        ExecutorService newFixedThreadPool=Executors.newFixedThreadPool(2);
//        for(int j=0;j<4;j++){
//            final  int index=j;
//            newFixedThreadPool.execute(new MyRunnable(index));
//        }
//
//
//        //创建一个定长线程池,延时执行某个代码
//        System.out.println("****************************newScheduleThreadPool*******************************");
//        ScheduledExecutorService newScheduleThreadPool= Executors.newScheduledThreadPool(2);
//        for(int k=0;k<4;k++){
//           final  int index=k;
//            //执行结果：延迟三秒之后执行，除了延迟执行之外和newFixedThreadPool基本相同，可以用来执行定时任务
//            newScheduleThreadPool.schedule(new MyRunnable(index),3, TimeUnit.SECONDS);
//        }


        System.out.println("****************************newCachedThreadPool*******************************");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        for(int i=0;i<4;i++) {
            final int index=i;
            newCachedThreadPool.execute(new MyRunnable(index));
        }


//        System.out.println("****************************newSingleThreadExecutor*******************************");
//        ExecutorService newSingleThreadExtutor=Executors.newSingleThreadExecutor();
//        for(int l=0;l<4;l++){
//            final int index=l;
//            //执行结果：只存在一个线程，顺序执行
//            newSingleThreadExtutor.execute(new MyRunnable(index));
//        }
    }
}
