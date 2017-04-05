package June.day.june27;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/27.
 */
//需求说明：
//        商场对顾客的年龄层次进行调查
//        计算各层次的顾客比例

public class Age {
    public static void main(String[] args) {
        double c =0;//三十岁以上的个数
        double d =0;//三十岁以下的的个数
        double e;//三十岁以上所占比例
        double f;//三十岁以下所占比例
        Scanner input = new Scanner(System.in);
        for (int b =1;b<=10;b++){
            System.out.println("请输入第"+b+"位的年龄：");
            int old = input.nextInt();
            if (old>=30){
                c++;
            }
            else {
                d++;
            }
        }
        e = c/10*100;
        f = d/10*100;
        System.out.println("三十岁以上顾客所占比例是"+e+"%");
        System.out.println("三十岁以下顾客所占比例是"+f+"%");
    }
}
