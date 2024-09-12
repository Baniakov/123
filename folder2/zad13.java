package folder2;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner key  = new Scanner(System.in);
        String pakiet;
        int minutes;
        double toPay=0;

        System.out.println("Wybierz swój pakiet:");
        pakiet = key.nextLine();


        if(pakiet.equalsIgnoreCase("a")){
            System.out.println("podaj liczbę minut:");
            minutes = key.nextInt();
            if(minutes<=450) {
                toPay = 39.99;
            }
            else{
                toPay= 39.99 + (0.45*(minutes-450));
            }
        }
        else if(pakiet.equalsIgnoreCase("b")){
            System.out.println("podaj liczbę minut:");
            minutes = key.nextInt();
            if(minutes<=900) {
                toPay = 59.99;
            }
            else{
                toPay= 59.99 + (0.4*(minutes-900));
            }
        }
        else if(pakiet.equalsIgnoreCase("c")){
            System.out.println("podaj liczbę minut:");
            minutes = key.nextInt();
                toPay=69.99;
        }
        else{
            System.out.println("Podany pakiet nie istnieje.");
            System.exit(0);
        }



    }
}
