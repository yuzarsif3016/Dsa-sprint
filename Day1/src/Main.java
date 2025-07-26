import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        System.out.println(list);
//
//        for(var item: list){
//            System.out.println("element is " + item);
//        }

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(23);
        list.add(30);
        list.add(22);
        list.add(null);
        list.addFirst(12);

        System.out.println(list);
    }
}
