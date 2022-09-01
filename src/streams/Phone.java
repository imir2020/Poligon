package streams;

public class Phone {
    static int start = 5;
    String label;
    int price;
     int index = start++;

    public Phone(String label, int price) {
        this.label = label;
        this.price = price;
    }
}
