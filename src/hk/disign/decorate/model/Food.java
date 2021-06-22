package hk.disign.decorate.model;

/**
 * Created by jian.shui on 2018/12/7
 */
public class Food {
    private String food_name;
    public Food(){

    }
    public Food(String food_name) {
        this.food_name = food_name;
    }
    public String make(){
        return  food_name;
    }
}
