package hk.disign.template.model;

/**
 * Created by jian.shui on 2019/1/24
 */
public  class PostmanB extends Postman{
    @Override
    protected void call() {
        System.out.println("��ϵ�ջ���B,׼������...");
    }

    @Override
    protected boolean isSign() {
        return false;
    }

    @Override
    protected void refuse() {
        super.refuse();
        System.out.println("��Ʒ��ʵ�ﲻ�����ܾ�ǩ��!");
    }
}
