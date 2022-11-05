package regexp.two;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "Hello.there.hey";
        String[] words = s.split("\\.");
        System.out.println(Arrays.toString(words));

        String f = "Hello2 there3 hey5";
        String modString = f.replaceAll("[2|3|5]", "!");
        System.out.println(modString);
    }
}
