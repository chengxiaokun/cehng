package April.day.paril11;

/**
 * Created by $chengxiaokun$ on 2017/4/11.
 */
public class MyLinkedList {
    public MyLinkedList(){

    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("s");
    }
    public boolean add(String element){
        return true;
    }
    private class node{//node节点
        String element;//element元素
        node prev;//prev上一个
        node next;//下一个

        public node(String element, node prev, node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
