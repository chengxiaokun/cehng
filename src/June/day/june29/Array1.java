package June.day.june29;

import java.util.Arrays;

/**
 * Created by www56 on 2017/3/29.
 */
public class Array1 {

    public static void main(String[] args) {
        int a [][]=new int[4][];//数组
        a[0] = new int[4];//数组第一个元素个数
        a[1] = new int[4];//第二个个数
        a[2] = new int[4];//3.。。
        a[3] = new int[4];//4.。。
        int num =0;
        for (int i=0;i<4;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j] = num;
                num++;//数组里每个元素的排列方式

            }System.out.println(Arrays.toString(a[i]));
        }
    }
}
