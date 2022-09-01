package streams;


import supportdev.random.RandomNumbers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamF {

//    public static String MakeUpperCase(String str) {
//        return str.toUpperCase();
//    }

    public static void main(String[] args) {
        //  StreamF og = new StreamF();
//        System.out.println(og.MakeUpperCase("dlddldl"));
        RandomNumbers rand = new RandomNumbers();


        int[] mas = rand.massiveOfRandom(100);
        Integer[] mis = new Integer[mas.length];
        for (int i = 0; i < mis.length; i++) {
            mis[i] = mas[i];
        }


//        StreamF one = new StreamF();

//        Stream<Integer> numbers = Stream.of(4, 6, -66, 1, 2);
//        Stream<Integer> numb = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        Stream
//                .concat(numb, numbers).
//                sorted().
//                distinct()
//                .forEachOrdered(System.out::println);

//        Stream<Integer> nr = numb;
//        nr.filter(n -> n < 0)
//                .skip(2)
//                .limit(3)
//                .forEach(System.out::println);


//        System.out.println( nr.filter(n -> n> 0)
//
//                .count());


//        List<Integer> list = new ArrayList<>();
//        for (Integer r : mas) {
//            list.add(r);
//            //System.out.println(r);
//        }
        //Optional<Integer> name = list.stream().findFirst();
        // System.out.println(name.get() + " first");

//        Optional<Integer> sur = list.stream().findAny();
//        System.out.println(sur.get() + " any" );

//        boolean all = list.stream().allMatch(s -> s < 99);
//        System.out.println(all);


//        boolean any = list.stream().anyMatch(f -> f > 98);
//        System.out.println(any);
//
//
//        boolean none = list.stream().noneMatch( s -> s==0);
//        System.out.println(none);

//        Optional<Integer> opt = list.stream().max(Integer::compareTo);
//        System.out.println(opt.get() + " min");
//        Stream<Integer> rts = list.stream();
//        Optional<Integer> opt = rts.filter(n -> n<11&&n%2==0)
//                .reduce((b,f) -> b*f);
//        System.out.println(opt.get());

        //   Stream<Double> numberStream = Stream.of(-4.00001, 3.0, -2.00001, 1.00001);
//        double identity = 1.00001;
//        double result = numberStream.reduce(identity, (x,y)->x * y);
//        System.out.println(result);  // 24
//        class Phone {
//
//            private String name;
//            private int price;
//
//            public Phone(String name, int price) {
//                this.name = name;
//                this.price = price;
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public int getPrice() {
//                return price;
//            }
//        }
//        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
//                new Phone("Lumia 950", 45000),
//                new Phone("Samsung Galaxy S 6", 40000),
//                new Phone("LG G 4", 32000));

//        int sum = phoneStream.reduce(0,
//                (x,y)-> {
//                    if(y.getPrice()<50000)
//                        return x + y.getPrice();
//                    else
//                        return x + 0;
//                },
//        int sum = phoneStream.parallel().reduce(0,
//                (r, t) -> {
//                    if (t.getPrice() < 50000) return r + t.getPrice();
//                    else
//                        return r + 0;
//                },
//                (r, t) -> r+t );//
//        System.out.println(sum);
//   String str2 = "ffffflll";
//       String rt =  str2.toUpperCase();
//        System.out.println(rt);
//
//        String str = "делаем все буквы заглавными";
//        String strUpper = str.toUpperCase();
//        System.out.println("Оригинал строки: " + str);
//        System.out.println("Изменение строки в верхний регистр: " + strUpper);


//        ArrayList<Integer> numbers = new ArrayList();
//        numbers.addAll(Arrays.asList(mis));
//        Optional<Integer> op = numbers.stream().min(Integer::compare);
//        if (op.isPresent()) {
//            System.out.println(op.get());
//        }
//        System.out.println(op.orElse(-1));
//
        //        System.out.println(op.orElseGet(() -> og.some(23)));
//
//        System.out.println(op.orElseThrow(IllegalStateException::new));
//        op.ifPresent(s -> System.out.println(s));

//        op.ifPresentOrElse(
//                v -> System.out.println(v),
//                () -> System.out.println("not found")
//        );

//
//        Set<Integer> set = numbers.stream()
//                .collect(Collectors.toSet());
//
//        for (Integer e :
//            set ) {
//            System.out.println(e);
//        }
//
//        HashSet<Integer> hashSet = numbers.stream()
//                .collect(Collectors.toCollection(HashSet::new));
//        for (Integer e :
//                hashSet ) {
//            System.out.print(e + " ");
//        }

        class Phone {

            private String name;
            private String company;
            private int price;

            public Phone(String name, String comp, int price) {
                this.name = name;
                this.company = comp;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public int getPrice() {
                return price;
            }

            public String getCompany() {
                return company;
            }
        }
        Stream<Phone> phoneStream = Stream
                .of(new Phone("iPhone X", "Apple", 600),
                        new Phone("Pixel 2", "Google", 500),
                        new Phone("iPhone 8", "Apple", 450),
                        new Phone("Galaxy S9", "Samsung", 440),
                        new Phone("Galaxy S8", "Samsung", 340),
                        new Phone("Poco 12", "Xiaomi", 340));

//        Map<Integer, List<Phone>> listMap = phoneStream.collect(Collectors.groupingBy(Phone::getPrice
//        ));
//        for (Map.Entry<Integer, List<Phone>> e : listMap.entrySet()) {
//            System.out.println(e.getKey());
//            for (Phone p : e.getValue()) {
//                System.out.println(p.getName());
//            }
//            System.out.println();
//        }


//        Map<Boolean, List<Phone>> integerListMap = phoneStream.collect(Collectors.partitioningBy(p -> p.getPrice() >= 450));
//        for (Map.Entry<Boolean, List<Phone>> item:integerListMap.entrySet()){
//            System.out.println(item.getKey() + " p");
//            for (Phone phone: item.getValue()){
//                System.out.println(phone.getPrice() + " i");
//            }
//        }

//        Map<Integer, Long> listMap2 = phoneStream.collect(Collectors.groupingBy(Phone::getPrice, Collectors.counting()));
//        for (Map.Entry<Integer, Long> e : listMap2.entrySet()) {
//            System.out.println(e.getKey()+ " " + e.getValue());
//        }
//
//        Map<String, Integer> map = phoneStream.collect(Collectors.groupingBy(Phone::getCompany, Collectors.summingInt(Phone::getPrice)));
//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//           System.out.println(e.getKey()+ " " + e.getValue());
//        }
//        Map<String, Optional<Phone>> optionalMap = phoneStream.collect(Collectors
//                .groupingBy(Phone::getName, Collectors.minBy(Comparator.comparing(Phone::getPrice))));
//        for (Map.Entry<String, Optional<Phone>> e : optionalMap.entrySet()) {
//            System.out.println(e.getKey() + " -  " + e.getValue().get().getPrice());
//        }
//
//        Map<String, IntSummaryStatistics> opMap = phoneStream.collect(Collectors
//                .groupingBy(Phone::getCompany, Collectors.summarizingInt(Phone::getPrice)));
//
//        for (Map.Entry<String, IntSummaryStatistics> e : opMap.entrySet()) {
//            System.out.println(e.getKey() + " -  " + e.getValue().getMin());
//        }

//        Map<String, List<String>> phonesByCompany = phoneStream.collect(
//                Collectors.groupingBy(Phone::getCompany,
//                        Collectors.mapping(Phone::getName, Collectors.toList())));
//
//        for(Map.Entry<String, List<String>> item : phonesByCompany.entrySet()){
//
//            System.out.println(item.getKey());
//            for(String name : item.getValue()){
//                System.out.println(name);
//            }

        int[] out = new int[5];
        Arrays.parallelSetAll(out, i -> (int) (Math.random() * 100));
//        for (int s : out) {
//            System.out.println(s);
//        }
//        IntStream stream = Arrays
//                .stream(out,1, 4)
//                .limit(3)
//                .filter(f -> f < 40);
//        stream.forEach(System.out::println);
//
//        System.out.println(stream);

        Arrays.parallelPrefix(out, (d, g) ->d*g);
        for(int i: out)
            System.out.println(i);
    }

    Integer some(Integer e) {
        return e * 2;
    }
}