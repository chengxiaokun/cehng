package June.day.june29;

/**
 * Created by $chengxiaokun$ on 2017/3/30.
 */
public class Juicer {
    //榨汁机
    String type="九阳";//型号
    public String juicing(String type){//
        System.out.println(type+"榨汁");
        if (type.equals("苹果")){
            return type+"汁";
        }else {
            return "果汁";
        }
    }
}
