package annotations.annotation2;

@ToString
public class Rectangle {
    @ToString(includeName = false)
    private int width = 5;

    @ToString
    private int height = 4;


    public static void main(String[] args) {
        Rectangle r = new Rectangle();
       ToStrings toStrings = new ToStrings();
       ;
        System.out.println(toStrings.toString(r));
    }
}
