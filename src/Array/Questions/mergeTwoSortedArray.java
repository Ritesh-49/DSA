package Array.Questions;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int [] a = {10,15,20,25};
        int [] b = {5,8,20,30,40};
        int [] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i<a.length && j<b.length){
            if (a[i] <= b[j]){
                c[k] = a[i];
                i++ ; k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        if (i == a.length){ // now take elements from b only
            while (j<b.length){
                c[k] = b[j];
                j++; k++;

            }
        }

        if (j == b.length){ // now take elements from a only
            while (i<a.length){
                c[k] = a[i];
                i++; k++;

            }
        }

        for (int elem : c){
            System.out.print(elem + " ");
        }
    }
}
