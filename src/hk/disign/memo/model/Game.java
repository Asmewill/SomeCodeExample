package hk.disign.memo.model;

/**
 * Created by jian.shui on 2019/1/24
 */
public class Game {
    private int mLevel=0;
    private int mIcon=0;

    /***
     * ��ʼ��Ϸ
     */
    public void paly(){
        System.out.print("������");
        mLevel++;
        System.out.println("��ǰ�ȼ�Ϊ��"+mLevel);
        mIcon+=32;
        System.out.println("��ý�ң�"+mIcon);
        System.out.println("��ǰ�������Ϊ:"+mIcon);
    }

    /***
     * �˳���Ϸ
     */
    public void exit(){
        System.out.println("�˳���Ϸ������Ϊ���ȼ�="+mLevel+",���="+mIcon);
    }

    //��������¼
    public Memo createMemo(){
        Memo memo=new Memo();
        memo.setmLevel(mLevel);
        memo.setmIcon(mIcon);
        return memo;
    }

    public void setMemo(Memo memo){
        mLevel=memo.getmLevel();
        mIcon=memo.getmIcon();
    }

}
