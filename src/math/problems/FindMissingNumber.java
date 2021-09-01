package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */
        int total_num;
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        total_num = 10;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        int num_sum = 0;
        for (int i: array) {
            num_sum += i;
        }
        System.out.println( expected_num_sum - num_sum);


    }

}
