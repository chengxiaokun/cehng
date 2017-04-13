package April.day.paril12;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by $chengxiaokun$ on 2017/4/12.
 */
//使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
//        添加几条信息
//        列出所有的员工姓名
//        列出所有员工姓名及其工资
//        删除名叫 Tom 的员工信息
//        输出 Jack 的工资，并将其工资改为 1500 元
//        将所有工资低于 1000 元的员工的工资上涨 20%
public class Staff {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new LinkedHashMap<>();
        map.put("Tom",1500);
        map.put("Jack",800);
        map.put("Jerry",900);
        map.put("Mark",1800);
        for (String s : map.keySet()) {
            System.out.println(s);

            System.out.println(s+map.get(s));
            System.out.println("///////////");
        }
        map.remove("Tom",1500);
        System.out.println(map);
        System.out.println("///////////");
        System.out.println(map.get("Jack"));
        map.put("Jack",1500);
        System.out.println(map.get("Jack"));
        System.out.println("///////////");
        for (String s : map.keySet()) {
            if (map.get(s)<1000){
                map.put(s,(int)(map.get(s)*1.2));
            }
        }
        System.out.println(map);

    }
}
