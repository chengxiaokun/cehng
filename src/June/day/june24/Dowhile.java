package June.day.june24;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/24.
 */
public class Dowhile {
    public static void main(String[] args) {
        boolean c = true;//赋值

        do {
            System.out.println("是否完成了任务 n/y");//输出
            Scanner ab = new Scanner(System.in);//死句子，获取输入内容
            char cb = ab.next().charAt(0);//定义 赋值 输入 判断
            if (cb=='y'){
                c=false;
                System.out.println("小伙子，厉害啦!(.◕ˇ∀ˇ◕）");
            }
            else {
                c=true;
                System.out.println("小菜比，滚回去接着写!  ╮(╯_╰)╭ ");
            }
        }
        while (c);
    }
}
