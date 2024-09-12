package folder3;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Podawaj warotści, które po przemnożeniu przez 10 będą mniejsze od 100.");
        double product=0;
        double number;
        while(product<100){
            number = key.nextDouble();
            key.nextLine();
            product = number*10;
            System.out.println("Wynikiem jest liczba "+ product);
        }
        System.out.println("CO OSZUKUJESZ GAŁGANIE. JA SIĘ Z TOBA NIE BAWIĘ!!!");
    }
}
