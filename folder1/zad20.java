package folder1;
import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int commonNumberOfCookies = 48;
        double sugarPerCookie = 1.5/commonNumberOfCookies;
        double butterPerCookie = 1.0/commonNumberOfCookies;
        double flourPerCookie = 2.75/commonNumberOfCookies;

        System.out.println("Podaj liczbę ciastek do upieczenia:");
        int numberOfCookies = key.nextInt();
        key.nextLine();
        double neededSugar = sugarPerCookie*numberOfCookies;
        double neededButter = butterPerCookie*numberOfCookies;
        double neededFlour = flourPerCookie*numberOfCookies;
        System.out.println("Do uzyskania "+numberOfCookies+
                " ciastek potrzebujesz:\n"+neededSugar +
                " szklanek cukru,\n"+neededButter+
                " szklanek masła,\n"+neededFlour+
                " szklanek mąki.");
    }
}
