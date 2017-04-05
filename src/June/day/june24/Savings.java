package June.day.june24;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/24.
 */
//需求：
    //在银行存款，每年的利率为0.003，计算五年后，获得的本金。
public class Savings {
    public static void main(String[] args) {
        double x;                                   //本金
        int y = 1;                                  //存款年数初始值

        Scanner input = new Scanner(System.in);
        System.out.println("请输入存款数额（元）");//扫描 输入金额
        x = input.nextInt();

        while (y <= 5) {                            //循环范围 循环体
            x += x*0.003;
            y++;

        } System.out.println("五年后金额为："+x+"元");//停止后本金
    }
}
