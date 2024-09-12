package folder2;

import java.util.Scanner;
public class zad7 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Podaj 3 imiona:");
        String firstName = key.nextLine();
        String secondName = key.nextLine();
        String thirdName  =key.nextLine();

        if (firstName.compareToIgnoreCase(secondName)<0) {
            if(firstName.compareToIgnoreCase(thirdName)<0){
                if(secondName.compareToIgnoreCase(thirdName)<0){
                    System.out.println(firstName);
                    System.out.println(secondName);
                    System.out.println(thirdName);
                }
                else{
                    System.out.println(firstName);
                    System.out.println(thirdName);
                    System.out.println(secondName);
                }
            }
            else{
                if(secondName.compareToIgnoreCase(thirdName)<0){
                    System.out.println(thirdName);
                    System.out.println(firstName);
                    System.out.println(secondName);
                }
                else{
                    System.out.println(firstName);
                    System.out.println(thirdName);
                    System.out.println(secondName);
                }
            }


        }
        else if(firstName.compareToIgnoreCase(secondName)==0){
            if(firstName.compareToIgnoreCase(thirdName)<0){
                System.out.println(thirdName);
                System.out.println(firstName);
                System.out.println(secondName);
            }
            else{
                System.out.println(firstName);
                System.out.println(secondName);
                System.out.println(thirdName);
            }

        }
        else if(firstName.compareToIgnoreCase(secondName)>0){
            if(firstName.compareToIgnoreCase(thirdName)>0){
                if(secondName.compareToIgnoreCase(thirdName)<0){
                    System.out.println(secondName);
                    System.out.println(firstName);
                    System.out.println(thirdName);
                }
                else{
                    System.out.println(secondName);
                    System.out.println(thirdName);
                    System.out.println(firstName);
                }
            }
            else{
                if(secondName.compareToIgnoreCase(thirdName)<0){
                    System.out.println(secondName);
                    System.out.println(thirdName);
                    System.out.println(firstName);
                }
                else{
                    System.out.println(thirdName);
                    System.out.println(secondName);
                    System.out.println(firstName);
                }
            }

        }
    }
}