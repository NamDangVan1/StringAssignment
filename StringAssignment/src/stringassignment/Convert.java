package stringassignment;

import java.util.*;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("String: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for ( char c : s.toCharArray() ){
            if (Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(Character.toUpperCase(c));
            }
        }
        
        System.out.println(sb.toString());
    }
}
