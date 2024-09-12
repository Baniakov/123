package folder1;

public class zad19 {
    public static void main(String[] args) {
        int numberOfRespondents = 12467;
        double onceWeek=0.14;
        double citrus = 0.64;
        double numberOfOnceWeek = numberOfRespondents * onceWeek;
        int approximateNumberOfOnceWeek = (int)numberOfOnceWeek;
        System.out.println("Przybliżona liczba pijących choć raz w tygodniu:"+approximateNumberOfOnceWeek);
        double numberOfCitrus = numberOfRespondents * citrus;
        int approximateNumberOfCitrus = (int)numberOfCitrus;
        System.out.println("Przybliżona liczba pijących smak cytrusowy:"+approximateNumberOfCitrus);

    }
}
