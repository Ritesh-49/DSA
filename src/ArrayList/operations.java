package ArrayList;

import java.util.ArrayList;

public class operations {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list + " " +  list.size());  //default size of the array lsit is 0,

        list.add(0, 20);
        System.out.println(list + " " +  list.size());

        list.add(1, 30);
        System.out.println(list + " " +  list.size());

        list.add(2, 30);
        System.out.println(list + " " +  list.size());

        list.add(3, 40);
        System.out.println(list + " " +  list.size());

        list.remove(1);
        System.out.println(list + " " +  list.size());

    }
}
