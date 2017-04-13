package April.day.paril12;

import java.util.LinkedHashMap;

/**
 * Created by $chengxiaokun$ on 2017/4/12.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>map=new LinkedHashMap<>();//LinkedHashMap:输入顺序排序
        map.put(1,"a");
        map.put(-1,"啊");
        map.put(100,"c");
        map.put(5,"d");

        System.out.println(map.size());
        System.out.println(map.get(-1));

        for (Integer integer : map.keySet()) {//输入顺序排序//迭代循环
            System.out.println(integer+":"+map.get(integer));//输出键+键值对应内容
        }
    }
}
