package hk.disign.decorate.model;

/**
 * Created by jian.shui on 2018/12/7
 */
public class Vegetable extends Food {
    private Food basic_food;

    public Vegetable(Food basic_food) {
        this.basic_food = basic_food;
    }

    @Override
    public String make() {
        return basic_food.make()+"+�߲�";
    }
}
