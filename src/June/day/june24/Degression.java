package June.day.june24;

/**
 * Created by www56 on 2017/3/24.
 */
//需求：
    //输出从100每次递减5的值，直至输出到5.
public class Degression {
    public static void main(String[] args) {
        int num =100;       //初始值
        while (num>5){      //大于五才会进入循环
            num-=5;         //递减五，赋值
            System.out.println(num);
        }
    }
}
