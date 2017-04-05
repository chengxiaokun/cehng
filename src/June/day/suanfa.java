package June.day;

import java.util.Scanner;

/**
 * Created by www56 on 2017/3/7.
 */
public class suanfa {
    public static void main(String[] agrs){


   int math;
   int c;
   int englishi;
   int physical;
   Scanner input=new Scanner(System.in);
   System.out.println("请输入数学的成绩");
   math = input.nextInt();
   System.out.println("请输入c语言的成绩");
   c = input.nextInt();
   System.out.println("请输入英语的成绩");
   englishi = input.nextInt();
   System.out.println("请输入物理的成绩");
//   System.out.println();
   physical = input.nextInt();
//   if (math>c.englishi.physical);
   System.out.println(math+c+englishi+physical);
   if (math>c&&math>englishi&&math>physical) {
      System.out.print("分数最高的是"+"数学"+math);}
      if (c>math&&c>englishi&&c>physical){
      System.out.print("分数最高的是"+"c语言"+c);}
      if (englishi>math&&englishi>c&&englishi>physical){
      System.out.print("分数最高的是"+"英语"+englishi);}
      if (physical>math&&physical>c&&physical>englishi){
      System.out.print("分数最高的是"+"物理"+physical);}
    }
}
