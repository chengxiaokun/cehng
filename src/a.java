/**
 * Created by www56 on 2017/3/25.
 */
public class a {
    public static void main(String[] args) {
        String a;
        a = "Hello World";
        System.out.println("拆分\n" + "Hello\n" + "World");
        System.out.println("Hello".toUpperCase());//大写
        System.out.println("World".toLowerCase());//小写
        String x = "20100110";
        System.out.println("输出年月日" + x.substring(0, 4) + "年" + x.substring(4, 6) + "月" + x.substring(6, 8) + "日");


    }
}
