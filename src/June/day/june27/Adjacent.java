package June.day.june27;

/**
 * Created by www56 on 2017/3/27.
 */
/*
需求;
    输出 10 - 99 之间所有“相邻”的值,如: 23, 34, 45
*/

public class Adjacent {
    public static void main(String[] args) {
        int b;//十位
        int c;//个位
      for (int a =10;a<99;a++){
          b=a/10;
          c=a%10;
          if (b+1==c||c-1==b){
              System.out.println(a);
          }
      }
    }
}
