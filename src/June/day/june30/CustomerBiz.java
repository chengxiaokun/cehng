package June.day.june30;

/**
 * Created by $chengxiaokun$ on 2017/3/30.
 */
//需求说明：
//        创建客户业务类，实现客户姓名的添加和显示
//实现思路：
//        创建CustomerBiz类
//        创建带参方法addName()
//        创建方法showNames()
//        创建测试类
//难点指导：
//        创建无返回值的带参方法
public class CustomerBiz {
    String name;//客户名字
    String[] customer = new String[8];//创建客户名字数组
    int i = 0;
    public String addname(String customername){
      if (i<8){
          customer[i] = customername;
          i++;
      }
      for (int j =0;j<i;j++){
          if (customer[j].equals(customername)){
              return "a";
          }
      }
      return "b";
    }
}


