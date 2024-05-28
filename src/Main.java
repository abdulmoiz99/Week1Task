import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Problem 1: Part 1
        Random rand = new Random();
        int x = rand.nextInt(1, 9);
        double result  = Math.pow(Math.PI, x);
        System.out.printf("%.2f%n", result);


        //Problem 1: Part 2
        int y = rand.nextInt(3, 14);
        double result2 = Math.pow(y, Math.PI);
        System.out.printf("%.2f%n", result2);


        //Problem 2
        float a = 1.27f, b = 3.881f, c =9.6f;
        int sumWithCasting = (int)(a + b + c);
        System.out.println(sumWithCasting);

        int sumWithRoundOff = Math.round(a + b + c);
        System.out.println(sumWithRoundOff);


    }
}