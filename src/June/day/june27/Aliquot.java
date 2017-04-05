package June.day.june27;

/**
 * Created by www56 on 2017/3/27.
 */
// 输出 1 － 100之间能被5整除，但不能被3或8整除的值

public class Aliquot {
    public static void main(String[] args) {
        for (int a = 0;a<=100;a++){
            if (a%5==0 & a%3!=0 & a%8!=0){
                System.out.println(" 1 － 100之间能被5整除，但不能被3或8整除的值有"+a);
            }
        }
    }
}
