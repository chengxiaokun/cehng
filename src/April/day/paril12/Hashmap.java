package April.day.paril12;



import java.util.HashMap;
import java.util.Map;


/**
 * Created by $chengxiaokun$ on 2017/4/12.
 */
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();//HashMap:键值排序
        map.put(1,"啊");
        map.put(2,"2");
        map.put(null,"3");
        map.put(4,"4");

        System.out.println(map.size());
        System.out.println(map.get(3));

        for (Integer integer : map.keySet()) {
            System.out.println(integer+"-"+map.get(integer));//键值+内容//键值排序
        }
        for (String s : map.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }


}
