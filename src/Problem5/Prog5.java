package Problem5;

import java.util.Arrays;

public class Prog5 {
    public static int[] combine(int[] a, int[] b) {
        int [] combinedArr = new int[a.length + b.length];

        for(int i =0; i < a.length; i++) {
            combinedArr[i] = a[i];
        }

        for(int j = 0; j < b.length; j++) {
            combinedArr[a.length + j] = b[j];
        }


        return combinedArr;
    }


    public static void main(String[] args) {
        int [] a = {5,6,-4,3,1};
        int [] b = { 3,8,9,11};
       int[] result = combine(a, b);
       System.out.println(Arrays.toString(result));
    }
}
