package String;

public class stringCompration {
    static void main(String[] args) {
        String s = "aaaaabbbccuuuddhh";
        char[] arr = s.toCharArray();
        String ans = "";

        int i =0, j=0;

        while(j<arr.length){
            if (arr[j] == arr[i]) j++;
            else {
                ans +=arr[i];
                int len = j-i; // it will find the length from starting a to ending a, starting b to ending b and so on
                if(len > 1) ans += len;
                i=j;  // i ko j tk lane ke liye
            }
        }
        ans +=arr[i];
        int len = j-i;
        if(len > 1) ans += len;
        System.out.println(ans);
    }
}
