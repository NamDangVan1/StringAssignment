package stringassignment;

import java.util.*;
 
public class Count {
    public static int count(String s, String a){
        int count = 0;
        for ( int i = 0; i < s.length(); i++ ){
            if ( a.charAt(0) == s.charAt(i) ){
                count += 1;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("String: ");
        String s = sc.nextLine();
        System.out.print("A character: ");
        String a = sc.next();
        System.out.println("appears " + count(s,a) + " times.");
    }
    
}
