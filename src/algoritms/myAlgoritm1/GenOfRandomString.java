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
    String[] firstHalfOfstr = new String[rawSize/2];
    String[] secondHalfOfstr = new String[rawSize/2];
    String [] mixOfRandom = new String[rawSize];

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
        for (int i = 0; i < firstHalfOfstr.length; i++) {//первая половина строки в массив mixOfRandom
            firstHalfOfstr[i] = String.valueOf(buffer.charAt(i));
        }
        for (int i =buffer.length()/2; i< buffer.length(); i++) {//вторая половина строки в массив reversMixOfRandom
            secondHalfOfstr[k++] = String.valueOf(buffer.charAt(i));
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
    }
}