package folder5;

import java.util.Random;
import java.util.Scanner;

public class zad16 {
    static void start(){
        System.out.println("Witaj w grze kamień papier nożyce!");
    }
    static void compRand(){
        Random random = new Random();
        int value = random.nextInt(2)+1;

    }
    static void userChoice(){
        System.out.println("Wpisz, co chesz wybrać.");
        Scanner key = new Scanner(System.in);
        String choice = key.nextLine();
        int valueOfUser;

        while(!(choice.equalsIgnoreCase("kamień")||choice.equalsIgnoreCase("papier")||choice.equalsIgnoreCase("nożyce"))){
            System.out.println("Źle podany wybór, spróbuj ponownie:");
            choice = key.nextLine();
        }
        if(choice.equalsIgnoreCase("kamień")){
            valueOfUser=1;
        } else if (choice.equalsIgnoreCase("papier")) {
            valueOfUser=2;
        } else if (choice.equalsIgnoreCase("nożyce")) {
            valueOfUser=3;
        }
    }
    public static void main(String[] args) {
        compRand();

    }
}
