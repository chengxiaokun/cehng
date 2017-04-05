package June.day;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/7.
 */
public class sanjiaoxing {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input =new Scanner(System.in);
        System.out.println("请输入X值");
        x = input.nextInt();
        if (x<=0){
            y = x+1;
           System.out.print("y="+y);}
           if (x>=0){
            y = 1-x;
            System.out.print("y="+y);
           }
    }
}
