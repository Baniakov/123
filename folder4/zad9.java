package folder4;

import java.io.IOException;
import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) throws IOException {

        Scanner key = new Scanner(System.in);

        int numberAtStart = 0;
        double incrasePerYear =0;
        int numberOfDays = 0;
        long populationForecast=0;

        System.out.println("Podaj liczbę osobników:");
        numberAtStart = key.nextInt();
        key.nextLine();
        while(numberAtStart<1){
            System.out.println("Do rozmnożenia potrzeba conajmniej dwóch osobników. Podaj prawidłową wartość: ");
            numberAtStart = key.nextInt();
            key.nextLine();
        }

        System.out.println("Podaj procentowy przyrost populacji (w formacie 0,xx)");
        incrasePerYear = key.nextDouble();
        key.nextLine();
        while(incrasePerYear<0){
            System.out.println("Osobniki nie mogą rozmnażac się ujemnie. Podaj prawidłową wartość: ");
            incrasePerYear = key.nextDouble();
            key.nextLine();
        }

        System.out.println("Podaj liczbę dni w których dojdzie do rozmnażania");
        numberOfDays = key.nextInt();
        key.nextLine();
        while(numberOfDays<1){
            System.out.println("zakrzywiasz czasoprzestrzeń! Potrzeba conajmniej jednego dnia. Podaj prawidłową wartość: ");
            numberOfDays = key.nextInt();
            key.nextLine();
        }

        for(int i =0; i <numberOfDays+1; i++){
        double prePopulationForecast =+ (populationForecast*i*incrasePerYear)+numberAtStart ;
        populationForecast = (long)prePopulationForecast;
        System.out.println("Przewidywana populacja w dniu "+i+" wynosi: " + populationForecast );}
    }
}
