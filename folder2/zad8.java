package folder2;

import java.util.Scanner;
public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę zakupionych pakietów: ");
        double liczba = scanner.nextDouble();
        double cena=99;
        double rabat = 0;

        if(liczba >=10 && liczba<= 19){
            rabat=0.2;
        }
        else if(liczba >=20 && liczba<= 49){
            rabat=0.3;
        }
        else if(liczba >=50 && liczba<= 99){
            rabat=0.4;
        }
        else if(liczba >=100){
            rabat=0.5;
        }
        double kwota=(liczba*cena)-((liczba*cena)*rabat);
        System.out.println("Rabat: " + rabat + " kwota cała: " + kwota);
        scanner.close();
    }
}