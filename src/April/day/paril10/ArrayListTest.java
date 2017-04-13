package April.day.paril10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by $chengxiaokun$ on 2017/4/10.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();//引入字符串类型

        list.add("hi");
        list.add("hello");
        list.add("asd");
        list.add("ccc");
        list.addAll(2,list);//重复一遍 2起始位置
        //list.remove(0);//删除

        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println("---");
        for (String s : list) {//iter增强for循环//fori//for i 循环
            System.out.println(s);
        }
        System.out.println("---");
        System.out.println(list.contains("hi"));//判断是否拥有这个实例
        System.out.println("----------");
        System.out.println(list.containsAll(list));//判断是否为字符串类型
        System.out.println("------");
        System.out.println(list.indexOf("ccc"));//显示实例数的组下标
    }
}
