package folder3;

public class zad14 {
    public static void main(String[] args) {
        String[][] tablica = new String[6][7];
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                if(i==j-1||j==0){
                    tablica[i][j]="#";
                }
                else{
                    tablica[i][j]=" ";
                }
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                System.out.print(tablica[i][j]);
            }
            System.out.println();
        }
    }


}
