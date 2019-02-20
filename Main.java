package Z1;

public class Main {
    public static void main(String[] args) {
        Algoritms a = new Algoritms();
        System.out.println("Wynik potegowania: " + a.power(3, 4));
        System.out.println("Wynik silni: " + a.factorial(4));
        System.out.println("Suma cg: " + a.geoSequence(2,2,3));
        System.out.println("Suma ca: " + a.algSequence(2,2,4));
        System.out.println("Czy doskonala: " + a.perfectNum(11));
        System.out.println("Czy doskonala: " + a.perfectNum(28));
        System.out.println("NWD: " + a.getNWD(12, 9));
        System.out.println("NWD: " + a.getNWD(11, 13));
        System.out.println("NWD: " + a.getNWD(6, 12));
        System.out.println("DtB: " + a.decimaltoBinary(12));
        System.out.println("DtB: " + a.decimaltoBinary(17));
        System.out.println("BtD: " + a.binarytoDecimal("1100"));
    }
}
