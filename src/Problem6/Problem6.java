package Problem6;

public class Problem6 {
    public static void main(String[] args) {
        int[] a = {2, 21, 3, 45, 12, 18, 6, 3, 1, 22};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin) {
                secondMin = a[i];
            }
        }
        System.out.println("Second minimum is: " + secondMin);
    }
}
