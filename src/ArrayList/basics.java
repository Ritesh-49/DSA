package ArrayList;

import java.util.ArrayList;

public class basics {

    public static void main(String[] args) {
        // Array list does not have default value
        ArrayList<Integer> arr = new ArrayList<>(6);  // 6 is initial capacity of the arr Arraylist not size its size can increase

        arr.add(0,10); //like arr[0] = 10;
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);

        // to print ArrayList item

        System.out.println(arr.get(0)); // like arr[0]
//        System.out.println(arr);

        for (int i = 0; i <6; i++) {
            System.out.print(arr.get(i));
        }

     }
}
