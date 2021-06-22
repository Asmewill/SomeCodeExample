package hk.disign.chain.model;

/**
 * Created by jian.shui on 2019/1/8
 * 类描述：结果对象
 */
public class Result {
    public boolean isRality;
    public String  info;

    public Result(boolean isRality, String info) {
        this.isRality = isRality;
        this.info = info;
    }

    public boolean isRality() {
        return isRality;
    }

    public void setRality(boolean rality) {
        isRality = rality;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result{" +
                "isRality=" + isRality +
                ", info='" + info + '\'' +
                '}';
    }
}
