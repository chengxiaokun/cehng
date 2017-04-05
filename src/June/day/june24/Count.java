package June.day.june24;

/**
 * Created by www56 on 2017/3/24.
 */
public class Count {
    public static void main(String[] args) {
        int num=0 ;          //数字初始值
        int sum=0;           //和的初始值
        while (num<1000){   //循环条件
            num+=7;         //7的倍数
            sum+=num;       //和
        }
        System.out.println(sum);
    }
}
