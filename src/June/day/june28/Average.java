package June.day.june28;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/28.
 */
//需求说明：
//        某次程序大赛，A74110班有4名学员参加，学员的成绩由用户输入，计算该班参赛学员的平均分

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c=0;//总成绩
        for (int a = 1;a<5;a++){
            System.out.println("请输入成绩");
            double b =input.nextDouble();
            c+=b;
        }System.out.println(c/4);
    }
}
