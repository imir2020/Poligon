package streams.lambda;

public class Lambada {
    static int sum(int f, Expression ex) {
        if (ex.isEqual(f)) return 45;
        return -2;

    }

    private static Operate action(int number) {
        switch (number) {
            case 1:
                return (x, y) -> x + y;
            case 2:
                return (x, y) -> x - y;
            case 3:
                return (x, y) -> x * y;
            default:
                return (x, y) -> 0;
        }
    }

    public static void main(String[] args) {
        //Ссылки на метод как параметры методов
        Expression ex = One::met1;

        System.out.println(sum(34, ex));

        //Ссылки на конструкторы
        ClassBuilder one = One::new;
        System.out.println(one);


        //Лямбды как результат методов
        Operate fuck = action(2);
        int result = fuck.execute(5, 4);
        System.out.println(result);
    }
}