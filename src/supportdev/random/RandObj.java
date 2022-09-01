package supportdev.random;

/*
Создать методы, генерирующие массив объектов заданного типа и нужной длины. На основе рефлексии.
 */
public class RandObj<T> {

    //generate of massive of objects like type Object

    public static Object[] getObjMass(int length) {
     if (length <= 0)length = 1;
        Object[] massive = new Object[length];
        for (int i = 0; i < length; i++) {
            massive[i] = new Object();
        }
        return massive;
    }

    //generate of the definite type massive of objects
//    public T[] getTMass(int length) {
//        if (length <= 0)length = 1;
//        System.out.println(length);
//        T[] massive = (T[]) new Object[length];
//        for (int i = 0; i < length; i++) {
//            massive[i] = (T) new Object();
//        }
//        return massive;
//    }

    public static void main(String[] args) {
        RandObj<Integer> j = new RandObj<>();

        for (int i = 0; i < 12; i++) {
            Object tMass = getObjMass(12)[i];
            System.out.println(tMass);
        }

    }

}
