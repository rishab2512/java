import java.util.*;

public class SubstringOfString {
    public static void printsubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            String substr = "";

            for (int j = i; j < str.length(); j++) {
                substr = substr + str.charAt(j);
                System.out.println(substr + "\n");

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcd";
        printsubstrings(str);
    }
}
