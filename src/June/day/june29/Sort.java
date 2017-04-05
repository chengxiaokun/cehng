package June.day.june29;

import java.util.Arrays;

/**
 * Created by $chengxiaokun$ on 2017/3/30.
 */
public class Sort {
    public static void main(String[] args) {
        int num []={9,8,7,6,5,4,3,2,1};
        for (int i=0;i<num.length-1;i++){
            for (int j =0;j<num.length-i-1;){
                if (num[j]>num[j+1]){
                    int sum =0;
                    sum = num[j];
                    num[j] = num[j+1];
                    num[j+1] = sum;
                }
            }
        }System.out.println(Arrays.toString(num));
    }
}
