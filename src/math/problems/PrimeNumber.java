package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */
        int limit =1000000;
        System.out.println("Prime numbers between 1 and " + limit);

        for(int i=1; i < 10000000; i++){
            boolean isPrime = true;
            for(int j=2; j < i ; j++){
                if(i % j ==0){
                    isPrime = false;
                    break;
                }
            }
        }

    }

}
