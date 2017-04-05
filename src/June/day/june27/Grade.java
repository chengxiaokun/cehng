package June.day.june27;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/27.
 */
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b;//各科成绩
        int sum=0;//成绩总和
        int avg;//平均分

        for (int a =0;a<5;a++){
            System.out.println("请输入第"+(a+1)+"门课程");
            b = input.nextInt();
            sum = sum + b;
        }
        avg = sum/5;
        System.out.println("总成绩是"+sum);
        System.out.println("平均成绩是"+avg);
    }
}
