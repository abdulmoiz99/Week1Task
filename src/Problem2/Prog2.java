package Problem2;

public class Prog2 {
    public static void main(String[] args) {
        float nbr = 1.27F;
        float nbr2 = 3.881F;
        float nbr3 = 9.6F;

        int sum = (int)(nbr + nbr2 + nbr3);
        int sum2 = Math.round(nbr + nbr2 + nbr3);

        System.out.println(sum);
        System.out.println(sum2);
    }
}
