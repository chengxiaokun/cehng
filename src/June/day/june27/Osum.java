package June.day.june27;

/**
 * Created by www56 on 2017/3/27.
 */
//需求：
//求1~10之间的所有偶数和

public class Osum {
    public static void main(String[] args) {
        int num = 0;//偶数和
        for (int a =1;a<=10;a++){
            if (a%2!=0){
                continue;
            }num+=a;
        }
        System.out.println(num);
    }
}
