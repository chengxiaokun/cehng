package June.day.Esam;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/25.
 */
public class Esam1 {
    public static void main(String[] args) {
        int a;
        int b =0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字");
         a = input.nextInt();
        while (a/10!=0){
            b+=a;
            a/=10;

        }System.out.println(b);
    }
}
