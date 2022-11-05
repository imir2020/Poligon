package regexp.one;

public class Test {
    public static void main(String[] args) {
        /*
        \\d - одна положительная цифра
       -\\d - одна отрицательная цифра
        \\w - одна любая буква: [a-zA-Z] - так ли это?
        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до этого вопросительного знака
        (x|y|z) - одна строка из множества строк
        [a-zA-Z] - одна строка из множества строк
        [0-9] то же самое \\d все цифры
        [^abc] - мы хотим все символы кроме [abc]
        . -  любой символ
        {3} - три символа : (\\d{3})
        {3,} - три или более символа: (\\d{3,})
        {3, 5} - от трёх до пяти символов: (\\d{3,5})
       */
        String str = "123456";

        String str2 = "-7";
        String str3 = "-7";
        String str4 = "7";
        String str5 = "-+7";


        System.out.println(str.matches("\\d+"));
        System.out.println(str2.matches("\\d*") + " str2");
        System.out.println(str3.matches("-\\d*") + " str3");
        System.out.println(str4.matches("-?\\d*") + " str4");
        System.out.println(str5.matches("(-|\\+|-\\+)?\\d*") + " str5");

        String str6 = "fo7o344tt65";
        System.out.println(str6.matches("[a-zA-Z0-9]+\\d+") + " str6");
        String str7 = "sdf";

        System.out.println(str7.matches("[^abc]*") + " str7");
        String url = "https://www.google.com";

        System.out.println(url.matches("https://www\\..+\\.(com|ru)") + " url");

        String str8 = "6t";
        System.out.println(str8.matches("\\w{2}")+ " str8");

    }
}
