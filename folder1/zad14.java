package folder1;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double ocena, wynik=0;
        double avg;

        for(int i =0; i<3;i++){
            System.out.println("Podaj ostatnie wyniki testów w skali 1-6:");
            ocena =key.nextInt();
            key.nextLine();
            wynik=wynik+ocena;
        }
        avg=(wynik/3);
        System.out.println("Twoja średnia to " + avg);
    }
}
