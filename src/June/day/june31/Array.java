package June.day.june31;

import java.util.Arrays;

/**
 * Created by $chengxiaokun$ on 2017/4/1.
 */
public class Array {
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5,6};
        for (int i =0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                int num =0;
                if (array[j]<array[j+1]){
                    num=array[j];
                    array[j]=array[j+1];
                    array[j+1]=num;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

}
