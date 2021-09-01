
package math.problems;
public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {

        int maxNumber = 40, previousNumber = 0, nextNumber = 1;

        System.out.println("Fibonacci Series of " + maxNumber + " numbers:");

        for (int i = 1; i <= maxNumber; ++i) ;
        {
            System.out.println(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }
}



