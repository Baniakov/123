package folder1;

public class zad18 {
    public static void main(String[] args) {
        int numberOfAction = 600;
        double valueOfAction = 21.77;
        double brockerProvision = 0.02;

        double valueOfAll = 21.77*600;
        double valueOfProvision  = valueOfAll*0.02;
        double valueWithProvision = valueOfProvision+valueOfAll;

        System.out.println("Kwota zapłacona za same akcje: "+ valueOfAll +"zł");
        System.out.println("Wysokość prowizji: " + valueOfProvision +"zł");
        System.out.println("Łączna zapłacona kwota: " +valueWithProvision +"zł");

    }
}
