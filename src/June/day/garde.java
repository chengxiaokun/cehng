package June.day;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/22.
 */
//利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
//        程序分析：(a> b)?a:b这是条件运算符的基本例子。

public class garde {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入成绩
        System.out.println("请输入成绩");
        double x = input.nextInt();
        //确定成绩区间
        if (x<0 | x>100){
            System.out.println("请输入0-100的数值");
            //判断
        }else if (x>=90){
            System.out.println("A");
        }else if (x>=60&x<89){
            System.out.println("B");
        }else if (x<60){
            System.out.println("c");
        }

    }
}
