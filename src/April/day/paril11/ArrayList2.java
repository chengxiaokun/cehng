package April.day.paril11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by $chengxiaokun$ on 2017/4/11.
 */
public class ArrayList2 {
    public static void main(String[] args) {
        List<String>song1=new ArrayList<>();
        song1.add("1");
        song1.add("2");
        List<String>and2=new ArrayList<>();
        and2.add("1");
        and2.add("2");
        and2.add("3");

        System.out.println(song1.equals(and2));//判断song1和and2是否相同//大小//对应元素//顺序

        List<String>che3=new ArrayList<>(and2.subList(1,3));//把and2截取实例化给che3//1-3从1开始不包括1包括3
        System.out.println(che3);

        System.out.println(che3.containsAll(song1));//che3是否包含song1

        and2.removeAll(che3);//删除and2里面包含che3的元素

        System.out.println(and2);

        che3.retainAll(and2);//两个集合里面相同元素
        System.out.println(che3);
    }
}
