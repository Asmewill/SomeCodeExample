package hk.disign.prototype.model;

/**
 * Created by jian.shui on 2019/1/24
 */
public class Card implements Cloneable {
    private int num;//����
    private Spec spec=new Spec();
    public Card(){
        System.out.println("Card ִ�й��캯��");
    }

    @Override
    protected Card clone() throws CloneNotSupportedException {
        System.out.println("cloneʱ��ִ�й��캯��");
        Card card= (Card) super.clone();
        card.spec=spec.clone();//��Spce����Ҳ����clone,ʵ�����
        return card;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(int width,int  length) {
        spec.width=width;
        spec.length=length;
    }

    public class Spec implements Cloneable{
        private int width;
        private int length;

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        @Override
        protected Spec clone() throws CloneNotSupportedException {
            return (Spec) super.clone();
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", spec=" +"{width="+spec.getWidth()+",length="+spec.getLength()+
                '}';
    }
}
