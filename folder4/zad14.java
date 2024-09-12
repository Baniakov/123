package folder4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) throws IOException {
        Scanner key = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytania");
        String name = key.nextLine();

        File myPlik  =  new File(name);

        if(!myPlik.exists()){
            System.out.println("Plik nie istnieje");
            System.exit(0);
        }
        Scanner fileSniffer = new Scanner(myPlik);
        int number = 0;
        while (fileSniffer.hasNext()){
            number++;
            String line = ""+ number +". "+ fileSniffer.nextLine();
            System.out.println(line);
        }

        fileSniffer.close();
    }
}
