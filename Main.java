package Z1;

public class Main {
    public static void main(String[] args) {
        Algoritms a = new Algoritms();
        System.out.println("Wynik potegowania: " + a.power(3, 4));
        System.out.println("Wynik silni: " + a.factorial(4));
        System.out.println("Suma cg: " + a.geoSequence(2,2,3));
        System.out.println("Suma ca: " + a.algSequence(2,2,4));
    }
}
