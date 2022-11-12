package algoritms.myAlgoritm1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
For filling random symbols for file.txt
 */
public class GenOfRandomString {
    int rawSize = 32;
    String buffer = "";
    String[] firstHalfOfstr = new String[rawSize / 2];
    String[] secondHalfOfstr = new String[rawSize / 2];
    String[] mixOfRandom = new String[rawSize];

    public void readFromFile() {
        List<String> listForFile;// = new ArrayList<>();
        try {
            Stream<String> stream = Files.lines(Path.of("src/algoritms/myAlgoritm1/InfoOfCompress.txt"));
            listForFile = stream.collect(Collectors.toList());
            for (int i = 0; i < listForFile.size(); i++) {
                //System.out.println(listForFile.get(i));
                buffer += listForFile.get(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Подумать над этим методом, и лучше на бумаге
    public void mixGivingData() {
        if (rawSize == 0) return;
        int k = 0;

        System.out.println(buffer.length());
        for (int i = 0; i < firstHalfOfstr.length; i++) {//первая половина строки в массив firstHalfOfstr
            firstHalfOfstr[i] = String.valueOf(buffer.charAt(i));
        }
        for (int i = buffer.length() / 2; i < buffer.length(); i++) {//вторая половина строки в массив secondHalfOfstr
            secondHalfOfstr[k++] = String.valueOf(buffer.charAt(i));
        }
        //реверс массива secondHalfOfstr

        for (int i = 0; i < secondHalfOfstr.length / 2; i++) {
            String temp = secondHalfOfstr[i];

            secondHalfOfstr[i] = secondHalfOfstr[secondHalfOfstr.length - 1 - i];
            secondHalfOfstr[secondHalfOfstr.length - 1 - i] = temp;
        }


        for (int i = 0; i < firstHalfOfstr.length; i++) {
            if (i == 0)
                mixOfRandom[i] = firstHalfOfstr[i];
            else if (i != 0) mixOfRandom[i * 2] = firstHalfOfstr[i];

        }
        //int i = 1;
//        while (i<secondHalfOfstr.length){
//            if (mixOfRandom[i]!= null){
//                mixOfRandom[i] = secondHalfOfstr[i];
//            }
//        }
        for (int i = 0; i < secondHalfOfstr.length; i++) {
            if (i == 0) {
                int buff = i + 1;
                mixOfRandom[buff] = secondHalfOfstr[i];
            } else {
                mixOfRandom[(i * 2) + 1] = secondHalfOfstr[i];
            }

        }

        System.out.println(buffer);
    }

    public static void main(String[] args) {
        GenOfRandomString one = new GenOfRandomString();
        one.readFromFile();
        for (int i = 0; i < one.buffer.length(); i++) {
            System.out.print(one.buffer.charAt(i));
        }
        System.out.println();
        System.out.println("----------------------");

        one.mixGivingData();
        for (int i = 0; i < one.firstHalfOfstr.length; i++) {
            System.out.print(one.firstHalfOfstr[i] + " ");


        }
        System.out.println();
        for (int i = 0; i < one.firstHalfOfstr.length; i++) {
            System.out.print(one.secondHalfOfstr[i] + " ");

        }

        System.out.println();
        for (int i = 0; i < one.mixOfRandom.length; i++) {
            System.out.print(one.mixOfRandom[i] + " ");

        }
    }
}