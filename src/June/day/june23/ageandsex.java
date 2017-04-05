package June.day.june23;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/21.
 */
/*设定年龄和性别变量(age和sex)，
如果年龄够7岁，或者年龄够5岁并且性别是’男’，
就可以搬动桌子*/
public class ageandsex {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        //声明两个未知变量，并且输入
////        System.out.print("请输入年龄");
////        int age = input.nextInt();
////        System.out.print("请输入性别");
////        char sex = input.next().charAt(0);
////        //判断，输出。
////        if (age>=7||(age>=5 && sex=='男')){
////            System.out.print("可以搬动桌子");
////        }else {
////            System.out.print("不能搬动");
////        }
        Scanner input = new Scanner(System.in);
        System.out.println("商品销售系统");
        char flag ='y';
        while (flag=='y'){
            //输入商品编号，对应价格。
            System.out.println("请输入商品编号");
            int num = input.nextInt();
            switch (num){
                case 1:
                    System.out.println("篮球价格是49.9元");
                    break;
                case 2:
                    System.out.println("足球价格是45元");
                    break;
                case 3:
                    System.out.println("排球价格是30元");
                    break;
                default:
                    System.out.println("请输入123");
            }
            System.out.println("是否继续查询（y/n）");
            flag = input.next().charAt(0);
        }
        input.close();
        System.out.println("滚");
    }
}
