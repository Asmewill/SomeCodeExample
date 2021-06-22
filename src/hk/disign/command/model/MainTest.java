package hk.disign.command.model;

/**
 * Created by Administrator on 2018/11/10
 * https://www.jianshu.com/p/ff909f9d925f
 */
public class MainTest {
    public static void main(String[] args){
       Receiver receiver=new Receiver();//�������������
       Command command=new ShutDownCommand(receiver);//����һ������ľ���ʵ�ֶ��󣬲�ָ�����������
       Invoker invoke=new Invoker(command);//����һ����������ߣ���ָ����������
       invoke.action();
    }
}
