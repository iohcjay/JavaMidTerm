package string.problems;
import java.util.Arrays;
public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void main(String[] args) {
    String word = "CAT";
    String anagram = "ACT";

        System.out.println("CAT and ACT are anagrams :" + isAnagramUsingStringMethods(word, anagram));



    }
    public static boolean isAnagramUsingStringMethods(String word, String anagram){
        if(word.length() != anagram.length())
            return false;

        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int index = anagram.indexOf(c);

            if (index != -1){
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            }   else
                return false;
        }
        return anagram.isEmpty();
    }
    }



