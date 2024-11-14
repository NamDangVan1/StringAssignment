package stringassignment;

import java.util.*;

public class Split_words_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("String: ");
        String s = sc.nextLine();
        String[] words = s.split("\\s+");
        System.out.println(Arrays.toString(words));
    }
}
