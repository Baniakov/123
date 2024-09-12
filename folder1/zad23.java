package folder1;

import java.util.Scanner;
public class zad23 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);


        System.out.println("Podaj długość rzędu w metrach");
        double rowLength = key.nextDouble();
        key.nextLine();
        System.out.println("Podaj ilość miejsca zajmowanego przez okratowanie w metrach");
        double grating = key.nextDouble();
        key.nextLine();
        System.out.println("Podaj odległości między sadzonkami w metrach");
        double distanceBetween = key.nextDouble();
        key.nextLine();
        double preNumber = (rowLength-2*grating)/distanceBetween;
        int numberOfSeedlings = (int)preNumber;
        System.out.println("Liczba sadzonek w rzędzie: "+numberOfSeedlings);


    }
}
