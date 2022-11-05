package regexp.pattern_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = " Hello, dkj hh fd akhk, dsahhf! dhf dkhjfhd j@gmail.com, dkjf jfj j, sdlkfj dd dkfkf w3@yandex.ru";
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());

            System.out.println(matcher.group(3));

        }
    }
}
