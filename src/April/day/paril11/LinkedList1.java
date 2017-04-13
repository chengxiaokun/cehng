package April.day.paril11;

import java.util.LinkedList;

/**
 * Created by $chengxiaokun$ on 2017/4/11.
 */
public class LinkedList1 {
    public static void main(String[] args) {
        java.util.LinkedList<String> song = new java.util.LinkedList<>();
        song.add("a");
        song.add("b");
        System.out.println(song.size());//集合大小

        System.out.println(song.get(0));//下标

        for (String s : song) {//迭代
            System.out.println(s);
        }

        System.out.println(song.getFirst());//第一个元素

        System.out.println(song.getLast());//最后一个元素
    }
}
