package stringassignment;

import java.util.*;

public class Find_the_longest_word_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("String: ");
        String s = sc.nextLine();
        String[] words = s.split("\\s+");
        String longest = words[0];
        for (String str: words)
        {
           if ( longest.length() < str.length() ){
               longest = str;
           }
        }
        System.out.println(longest + " is the longest word.");
    }
}
