package hk.disign.command.model;

/**
 * Created by jian.shui on 2019/1/24
 */
public class Invoker {
   private  Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        System.out.println("������ִ������");
        command.execute();
    }

}
