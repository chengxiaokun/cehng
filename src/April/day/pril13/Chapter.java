package April.day.pril13;

/**
 * Created by $chengxiaokun$ on 2017/4/13.
 */
public class Chapter <t>{
    public static void main(String[] args) {
        Chapter chapter=new Chapter();
        System.out.println(chapter.concat(1,3));
        System.out.println(chapter.concat(2,6));
        System.out.println(chapter.concat(4,5));
    }
    private String concat(t x,t y){
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
