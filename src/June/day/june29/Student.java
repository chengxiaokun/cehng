package June.day.june29;

/**
 * Created by www56 on 2017/3/29.
 */
public class Student {
    String name;
    int age;
    String garde;
    String hobby;
    public void show(){//显示内容😂
        System.out.println("名字"+name+"\n"+"年龄"+age+"\n"+"班级"+garde+"\n"+"爱好"+hobby);
    }

    public static void main(String[] args) {
        Student zhanghao = new Student();
        zhanghao.name="张浩";
        zhanghao.age=13;
        zhanghao.garde="三年级";
        zhanghao.hobby="吃";
        zhanghao.show();//输出显示内容😂
    }
}
