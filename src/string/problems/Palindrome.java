package string.problems;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {

        System.out.println("Enter any String : ");
        Scanner in = new Scanner(System.in);

        String original = in.nextLine();
        int length = original.length();

        boolean isPalindrome = true;

        for(int beginIndex = 0; beginIndex < length; beginIndex++){
            if(original.charAt(beginIndex) != original.charAt(length-1-beginIndex)){
                System.out.println("String is NOT a Palindrome");
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("String is a palindrome.");
        }

    }
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
}


