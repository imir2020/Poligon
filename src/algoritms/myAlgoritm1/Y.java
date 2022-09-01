package algoritms.myAlgoritm1;

public class Y {


    int[] nums = new int[] { 1, 2, 3, 5 };

    public static void main(String[] args) {
        int row = 7;
        String  list = "djdkkk";
        String[] mas = new String[row];
        int j = 0;
        for (int i = 0; i < row /2; i++) {
            mas[j] = String.valueOf(list.charAt(i));
           // System.out.print(mas[j] + j+ " ");//test
            j+=2;

        }

        int k = 1;
        for (int i =row /2; i < row - 1 ; i++) {
            mas[k] = String.valueOf(list.charAt(i));
            k+= 2;
            System.out.print(mas[j] +  " ");
        }
        System.out.println();
        System.out.println("____________________");
        System.out.println();
        for (int i = 0; i < mas.length ; i++) {
            System.out.println(mas[i] + i + " ");
        }
    }
}
