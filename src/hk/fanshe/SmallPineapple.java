package hk.fanshe;

public class SmallPineapple {
     public String name;
     public int age;
     private String weight;
     public SmallPineapple(){

     }
     public SmallPineapple(String name,int age){
         this.age=age;
         this.name=name;
     }

    public SmallPineapple(String name,int age,String weight){
        this.age=age;
        this.name=name;
        this.weight=weight;
    }
    public void getInfo(){
        System.out.println("["+name+"的年龄是"+age+"]");
     }
    private void getDetailInfo(String name,int age,String weight){
        System.out.println("["+name+"的年龄是"+age+",体重是"+weight+"]");
    }
}
