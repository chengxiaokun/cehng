package June.day.june31;

import java.io.PrintStream;

/**
 * Created by $chengxiaokun$ on 2017/3/31.
 */
public class Human {
    public static final PrintStream OUT = System.out;
    //class = fields + methods  类=域+方法
    //域
    //private 私有的 访问限制符
     String name;
    private  char gender;//性别
    private int age;//年龄
    private double height;//身高
    private double weight;//体重

    public Human(String name, char gender, int age, double height, double weight) {//构造方法
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //方法
    //访问限定修饰符 返回de类型 方法名([参数列表])
    //alt+insert 自动生成
    // public 共有的 void 没有具体返回值（类型）
    //形式参数 formal parameter 没有具体值 暂时
    //实际参数 actual parameter
    public void study(int studyTime/*参数列表
    */){//study 学习 成员方法

    //方法体
       System.out.println();
    }

    public static void main(String[] args) {
        Human human = new Human("lala",'男',
                18,185.2,50);       //ctrl+p提示  实参
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.gender);
        System.out.println(human.height);
    }

}
