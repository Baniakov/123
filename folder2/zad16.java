package folder2;

import java.util.Scanner;
public class zad16 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę zakupionych książek w tym miesiącu");
        Scanner key = new Scanner(System.in);
        int books = key.nextInt();
        key.nextLine();
        int points = 0;
        if(books==0){

        }
        else if(books==1){
            points=points+5;
        }
        else if(books==2){
            points=points+15;
        }
        else if(books==3){
            points=points+30;
        }
        else if(books>=4){
            points = points+60;
        }
        System.out.println("Woje punkty to:"+points);
    }
}
