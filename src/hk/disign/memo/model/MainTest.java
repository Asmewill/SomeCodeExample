package hk.disign.memo.model;

/**
 * Created by Administrator on 2018/11/10
 * https://www.cnblogs.com/luohanguo/p/7825656.html
 */
public class MainTest {
    public static void main(String[] args){
        Game game=new Game();
        game.paly();
        CreateMemo createMemo=new CreateMemo();
        createMemo.setMemo(game.createMemo());//��Ϸ�浵
        game.exit();
        //�ڶ��ν�����Ϸ
        System.out.println("�ڶ��ν�����Ϸ");
        Game secondGame=new Game();
        secondGame.setMemo(createMemo.getMemo());//ȡ��֮ǰ����¼�е�����
        secondGame.paly();
        secondGame.exit();
    }
}
