package June.day.june23;

/**
 * Created by www56 on 2017/3/23.
 */
public class Number {
//    训练要点：
//    while循环结构
//    需求说明：
//    编程实现：计算100以内（包括100）的偶数之和
//    实现思路：
//            1、声明整型变量num和sum
//2、循环条件：num<=100
//            3、循环操作：累加求和

    public static void main(String[] args) {
        int num =0;//初始值 偶数
        int sum =0;//初始值  和
        while (num<=100){
            sum+=num;//sum=sum+num。
            num+=2;//num=num+2。
        }
        System.out.print(sum);
    }

}
