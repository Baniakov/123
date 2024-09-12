package folder3;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double number, sum=0;

        for(int i = 0; i<10; i++){
            System.out.println("podaj liczbę:");
            number = key.nextInt();
            sum+=number;
            System.out.println("Suma wynosi:"+sum);
        }
        System.out.println("SUMA OSTATECZNA:"+sum);
    }
}
