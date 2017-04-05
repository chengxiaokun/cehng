package June.day.june24;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/24.
 */
//需求说明：
//        如果用户输入错误，可以重复输入直到输入正确，执行相应的操作后退出循环

public class Repetition {
    public static void main(String[] args) {
        System.out.println("***************\n1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销\n***************");
        Scanner input = new Scanner(System.in);
        int x =0;                                           //设编号为X，初始值
        boolean y=true;                                    //开关初始值
        do {
            System.out.println("请选择，输入数字");         //输出

            x = input.nextInt();                            //输入
            if (x==1||x==2||x==3||x==4){                    //定义范围
                y=false;                                    //开关状态
                switch (x){                                 //取值选择
                    case 1:
                        System.out.println("客户信息管理");
                        break;
                    case 2:
                        System.out.println("购物结算");
                        break;
                    case 3:
                        System.out.println("真情回馈");
                        break;
                    case 4:
                        System.out.println("注销");
                }

            }
            else {
                y=true;
                System.out.println("错误，请重新输入");
            }
        }while (y);
        System.out.println("欢迎再次使用！");
    }
}
