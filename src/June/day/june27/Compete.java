package June.day.june27;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/27.
 */
//需求：
//1~10之间的整数相加，得到的累加值大于20后结束循环，且输出此累加值

public class Compete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c =0;//数字和
        for (int a = 1;a<10;a++){

            System.out.println("请输入第"+a+"个1-10之间的数字：");
            int b = input.nextInt();
            c+=b;
            if (c>20){//大于二十跳出循环
                break;

            }
            System.out.println("现在你所输入的数字和是"+c);//每次输入后的数字和
        }
        System.out.println("你输入的数字和是"+c+"超出二十，程序结束");
    }
}
