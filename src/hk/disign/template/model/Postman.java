package hk.disign.template.model;

/**
 * Created by jian.shui on 2019/1/24
 */
public abstract class Postman {

    public void post(){
        prepare();
        call();
        if(isSign()){
            sign();
        }else{
            refuse();
        }


    }

    protected void refuse() {
    }

    protected void sign() {
        System.out.println("�������,�ͻ��Ѿ�ǩ�գ�");
    }

    protected boolean isSign() {
        return true;
    }

    protected abstract void call();

    protected void prepare() {
        System.out.println("����Ѿ����׼������...");
    }
}
