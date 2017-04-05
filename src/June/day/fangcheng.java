package June.day;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/7.
 */
public class fangcheng {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int x;
//
        Scanner input = new Scanner(System.in);
        System.out.print("请输入a的值");
        a = input.nextInt();
        System.out.print("请输入的b值");
        b = input.nextInt();
        System.out.print("请输入的c值");
        c = input.nextInt();
//
//
        if (b * b - 4 * a * c > 0 && a != 0){
            x = (-b + (b * b - 4 * a * c) / (b * b - 4 * a * c)) / (2 * a);
            x = (-b - (b * b - 4 * a * c) / (b * b - 4 * a * c)) / (2 * a);
            System.out.print("x=" + x);
        }
//

        if (b * b - 4 * a * c == 0 && a != 0) {
            x = -b / (2 * a);
            System.out.print("x=" + x);
        }
        if (b*b-4*a*c<0&&a!=0){
            System.out.print("x无实数跟");
        }
//
    }
}
