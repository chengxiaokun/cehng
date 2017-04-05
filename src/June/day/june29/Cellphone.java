package June.day.june29;

/**
 * Created by $chengxiaokun$ on 2017/3/29.
 */
//需求：
//      编写手机类（Cellphone）：可以下载音乐，可以播放这些音乐，可以进行充电
//      编写测试类（TestPhone）
public class Cellphone {
        String brant;
        public void TextPhone() {
            System.out.println("手机品牌："+brant+"\n"+"功能：\n1、下载音乐；\n2、播放音乐");
        }

        public static void main(String[] args) {
            Cellphone huawei = new Cellphone();
            huawei.brant ="华为";
            huawei.TextPhone();
            Cell huaweicell = new Cell();//重用电池类方法（Cell）
            huaweicell.brand ="聚能环"+"\t"+"\n";
            huaweicell.TextCell();
        }
    }
