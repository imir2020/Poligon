package algoritms.myAlgoritm1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
For filling random symbols for file.txt
 */
public class GenOfRandomString {
    int rawSize = 32;
    String buffer = "";
    String[] mixOfRandom = new String[rawSize];
    String[] mixOfRandom2 = new String[rawSize];

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
        int k = 1;

        System.out.println(buffer.length());
        for (int i = 0; i < rawSize/2; i++) {
            if (i % 2 == 0) {
                mixOfRandom[i++] = String.valueOf(buffer.charAt(i));
            }
//            if (i%2 !=0){
//                mixOfRandom[i] = String.valueOf(buffer.charAt(i));
//            }
        }

//Это асимметричная задача!!!!!!!!!!!!
        System.out.println();
        for (int j = rawSize - 1; j >= ((rawSize - 1)/2)&&k<rawSize; j--,k++) {

                mixOfRandom[k++] = String.valueOf(buffer.charAt(j));

            System.out.print(mixOfRandom[j] + " " + j + " нчя ");


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
        for (int i = 0; i < one.mixOfRandom.length; i++) {
            System.out.print(one.mixOfRandom[i] + " ");
        }
    }
}