package stringassignment;

import java.util.*;

public class Reverse_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("String: ");
        String s = sc.nextLine();
        StringBuilder rvs = new StringBuilder(s);
        rvs.reverse();
        System.out.println(rvs.toString());
    }
}
