package stringassignment;

import java.util.*;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("String: ");
        String s = sc.nextLine();
        String rvs = new StringBuilder(s).reverse().toString();
        if( s.equals(rvs)){
            System.out.println( s + " is a palindrome.");
        }else{
            System.out.println( s + " isn't a palindrome.");
        }
    }
}
