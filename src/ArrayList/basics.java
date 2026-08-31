package ArrayList;

import java.util.ArrayList;

public class basics {

    public static void main(String[] args) {
        // Array list does not have default value
        ArrayList<Integer> arr = new ArrayList<>(6);  // 6 is initial capacity of the arr Arraylist not size its size can increase

        arr.add(0,10); //like arr[0] = 10;
        arr.add(1,20); // for initialization
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);

        // to print ArrayList item

        System.out.println(arr.get(0)); // like arr[0]
//        System.out.println(arr);
        System.out.println(arr.size()); // size operator is used to calculate the size of array list
        for (int i = 0; i <arr.size(); i++) {
            System.out.print(arr.get(i)+" ");  // arr[i]
        }

        System.out.println();

        arr.set(2, 300); // to change or modify value at index 2

        System.out.println(arr);


        arr.add(90); // it will add value at the end of the arraylsit without overriding any existing element



        // Impotant
        // The difference between a built-in array and an ArrayList in Java,
        // is that the size of an array cannot be modified (if you want to add or remove
        // elements to/from an array, you have to create a new one). While elements can be
        // added and removed from an ArrayList whenever you want.

        /* arr.add(0, 20) // initializa the value at 0 index
        arr.set1(0,300) // it will modify/ update the value
        arr.get(3) it will return value of index 3
        arr.add(90) // pushes 90 to the end of the list and increasing the size of the list
        //default size of the array lsit is 0,
         */

     }
}
