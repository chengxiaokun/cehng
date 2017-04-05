package June.day.june28;

/**
 * Created by www56 on 2017/3/28.
 */
public class Array {
    public static void main(String[] args) {
        int array[]  = new int[37];//定义数组 int;类型
        array[1]=1;//数组里第二个数
        array[0]=1;//第一个数
        for (int num=2;num<37;num++){//num：数组里第几个数
            array[num]=array[num-1]+array[num-2];
            System.out.println(array[num]);//数组全部输出
        }
        System.out.print(array[36]);//第三十七个数
    }
}
