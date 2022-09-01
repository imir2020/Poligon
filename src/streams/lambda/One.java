package streams.lambda;

public class One {
    Expression expression;

    {
        expression = n -> n % 3 != 0;
    }


    //Лямбды как параметры методов
    int sum(int a, Expression expr) {
        if (expr.isEqual(a)) return 128;
        return -1;
    }

    static boolean met1(int e) {
        if (e < 50) return true;
        return false;
    }

    boolean ewt2() {
        return true;
    }

    public static void main(String[] args) {
        One one = new One();

        //Лямбды как параметры методов
        int temp = one.sum(31, one.expression);
        System.out.println(temp);

    }
}
