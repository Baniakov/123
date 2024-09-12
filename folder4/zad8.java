package folder4;

import java.io.IOException;
import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) throws IOException {
        double [] year = new double[12];
        Scanner key = new Scanner(System.in);
        System.out.println("Podaj liczbę lat:");
        int years = key.nextInt();
        while(years<1) {
            System.out.println("Musisz uwzględnić przynajmniej jeden rok.");
            years = key.nextInt();
        }

        for (int i = 0; i < years; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.println("Miesiąc nr."+(j+1));
                System.out.println("Ile cm:");
                int cm = key.nextInt();
                key.nextLine();
                while(cm<0){
                    System.out.println("Opady nie mogą być ujemne, podaj wartość ponownie");
                    cm = key.nextInt();
                    key.nextLine();
                }

                year[j]+=cm;

            }
        }

        double summCm=0;
        for(int i =0;i<12 ;i++){
            summCm = summCm + year[i];
        }

        System.out.println("Łączna liczba miesięcy w ciągu badania:"+years*12);
        System.out.println("Łączne opady w ciągu badania:"+ summCm);
        System.out.println("Średnie opady w danych miesiącach:");
        for(int i =0;i<12 ;i++){
            System.out.println((i+1)+"\t|\t"+year[i]/years);
        }

    }
}