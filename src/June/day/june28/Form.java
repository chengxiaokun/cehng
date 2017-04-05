package June.day.june28;

/**
 * Created by www56 on 2017/3/28.
 */
public class Form {

        //实现99乘法表
        public static void main(String[] args) {
            for (int i = 1;i<10;i++) {
                for (int j = 1;j<=i;j++) {
                    System.out.print(j + "*" + i + "=" + i * j+"\t");
                }
                System.out.println();
            }
        }
    }

