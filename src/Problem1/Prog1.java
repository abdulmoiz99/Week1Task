package Problem1;

//Create a class called Prog1. In the main method of the class, output to the console the result
//of doing the following two computations:
//        1. Get a random number x in the range 1 .. 9 and compute πx
//        .
//2. Get a random number y in the range 3 .. 14 and compute yπ
//        .
//Use Math API to solve πx and yπ
//. To get the random numbers, apply the knowledge gained
//from the Random Generator. Print the result two digits after decimal using System.out.prinf().

import java.util.Random;

public class Prog1 {
    public static void main(String[] args) {
      Random randomNumber = new Random();

      int x = randomNumber.nextInt(9) + 1;

      double resultOne = Math.pow(Math.PI, x);

      int y = randomNumber.nextInt(12) + 3;

      double resultTwo = Math.pow(y, Math.PI);

      System.out.printf("π^%d = %.2f%n", x, resultOne);
      System.out.printf("%d^π = %.2f%n", y, resultTwo);
    }
}

