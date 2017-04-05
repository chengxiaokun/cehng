package June.day.june27;

/**
 * Created by www56 on 2017/3/27.
 */
/*需求;
    输出　100 -- 999之间, 所有个位为7的数*/
public class Aliquot7 {

    public static void main(String[] args) {
//        for (int a = 100;a<=999;a++){
//          if (a%10==7){
//              System.out.println(a);
//          }
//        }
       /* 需求;
        输出  100 -- 999之间, 所有百位 + 十位 == 个位　的数*/
        for (int a = 100;a<=999;a++){
            int  b=a/100;//百位
            int c=a/10%10;//十位
            int d=a%10;//个位
            if (b+c==d){
                System.out.println(a);
            }
        }
    }
}
