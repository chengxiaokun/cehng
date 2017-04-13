package April.day.paril10;

import June.day.Helloworld;

import java.util.Hashtable;

/**
 * Created by $chengxiaokun$ on 2017/4/10.
 */
public class HashtableTest {
    public static void main(String[] args){
        Hashtable<Integer,String>hashtable=new Hashtable<>();//实例化
        hashtable.put(1,"a");
        hashtable.put(2,"b");
        hashtable.put(3,"c");
        hashtable.put(4,"d");
        hashtable.put(5,"e");
        hashtable.put(6,"h");
        hashtable.size();//键的大小
        hashtable.remove(2);//按键清楚
        hashtable.keySet();//键的集合
        System.out.println(hashtable.size());//输出集合大小
        System.out.println(hashtable.get(6));//输出第几个
        for (Integer integer :hashtable.keySet()){
            System.out.println(integer);
        }
    }
}
