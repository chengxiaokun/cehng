package June.day.june24;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/24.
 */
//需求：
    //从键盘上任意输入一个整数，输出这个整数是几位数。
public class Place {
    public static void main(String[] args) {
        int num;                                //输入的整数
        int x=1;                                //循环次数

        System.out.println("请输入一个整数");   //输出
        Scanner input=new Scanner(System.in);   //扫描 输入
        num = input.nextInt();

        while (num/10!=0){                      //条件 （123/10=12）
            num=num/10;                          //除以10以后的num值
            x++;                                 //每循环一次次数（x）就加一

        }System.out.println("这个数是"+x+"位数！");
    }

}
