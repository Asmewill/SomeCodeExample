package hk.disign.command.model;

/**
 * Created by jian.shui on 2019/1/24
 */
public class ShutDownCommand implements Command {
    Receiver receiver;

    public ShutDownCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("�����ɫִ�йػ�����");
        receiver.action();
    }
}
