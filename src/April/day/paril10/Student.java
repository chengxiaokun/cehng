package April.day.paril10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by $chengxiaokun$ on 2017/4/10.
 */
//编写一个学生类，将学生的姓名，年龄，性别分别保存到
// HashSet ArrayList Hashtable 中，并利用迭代器 Iterator 将姓名，年龄，性别打印出来

//创建学生类
public class Student {
    public static void main(String[] args) {
        List<String>xuesheng=new ArrayList<>();
        xuesheng.add("name");
        xuesheng.add("age");
        xuesheng.add("garden");
        Iterator iterator=xuesheng.iterator();
        for (String s : xuesheng) {
            System.out.println(s);

        }
    }
}
