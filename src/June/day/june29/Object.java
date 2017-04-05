package June.day.june29;

/**
 * Created by www56 on 2017/3/29.
 */
public class Object {
    //对象
    double weight;//重量
    double speed;//速度
    String type;//型号
    String color;//颜色
    public  void run(){
        System.out.println("重量"+weight+"\n"+"速度"+speed+"\n"+"型号"+type+"\n"+"颜色"+color);
    }

    public static void main(String[] args) {
        Object benchi =new Object();
        benchi.weight=1800;
        benchi.speed=180;
        benchi.type="奔驰530";
        benchi.color="红色";
        benchi.run();
    }
}
