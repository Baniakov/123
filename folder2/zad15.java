package folder2;

import java.util.Scanner;
public class zad15 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę czeków");
        Scanner key  =new Scanner(System.in);
        int numberOfChecks = key.nextInt();
        key.nextLine();
        double checksToPay=0;
        if(numberOfChecks<20){
            checksToPay=numberOfChecks*0.10;
        }
        else if(40>numberOfChecks&&numberOfChecks>+20){
            checksToPay=numberOfChecks*0.08;
        }
        else if(numberOfChecks>=40&&numberOfChecks>60){
            checksToPay=numberOfChecks*0.06;
        } else if (numberOfChecks>60) {
            checksToPay=numberOfChecks*0.04;
        }
        double oplata = 10+checksToPay;
        System.out.println("Połata pobrana przez bank wynosi:"+oplata);

    }
}
