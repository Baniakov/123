package folder4;

import java.util.Random;
import java.util.Scanner;

public class zad18 {
    public static void main(String[] args) {
        int randomNumber;

        Scanner key = new Scanner(System.in);

        Random randomizer = new Random();
        randomNumber = randomizer.nextInt(1000)+1;

        System.out.println("Zgadnij liczbę którą wylosowałem!");

        int number = 0;
        int counter=1;
        while (number!=randomNumber){
            number= key.nextInt();
            if(number<randomNumber){
                System.out.println("Spróbuj większej liczby");
                counter++;
            }
            else if(number>randomNumber){
                System.out.println("Spróbuj mniejszej liczby");
                counter++;
            }
            else{
                System.out.println("Brawo! Liczba "+ number + " jest prawidłowa.");
                System.out.println("Liczba prób wynosi: "+counter);
            }

        }
    }
}
