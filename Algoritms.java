package Z1;


import java.time.Duration;
import java.time.LocalTime;

public class Algoritms{
        //algorytm potegowania
        public int power(int x, int y){

         //2
            int result = 1;
         //3
            for(int i = 1; i <=y; i++ ) {
                result = result * x;
            }
            return result;


        }
        //algorytm silnia z n
        public int factorial(int n){
            //2
            int result = 1;
            //3
            for(int i = n; i > 1; i--){
                result = result * i;
            }
            return result;
        }
        //algorytm ciagu geometrycznego
        public int geoSequence(int a0, int q, int n){
            int sum = 0;
            for (int i = 0; i <= n-1; i++){
                sum = sum + (a0 * power(q, i));

            }
            return sum;
        }
        //algorytm ciagu arytmetycznego
        public int algSequence(int a0, int r, int n){
            int sum = 0;
            for(int i = 0; i < n-1; i++){
                sum = sum + (a0 + i*r);
            }
            return sum;
        }
        public boolean perfectNum(int num){
            int sum = 0;
            for (int i = 1; i < num; i++){
                if (num % i == 0){
                    sum = sum + i;

                }
            }
            return num == sum ? true : false;
        }
        public int getNWD(int x, int y){
            //1. sprawdzenie wiekszej i mniejszej
            int less = x;
            int greather = y;
            if(x > y){
                less = y;
                greather = x;
            }
            //2. iterujemy w petli i psrawdzamy czy dzielnik less jest tez dzielnikiem greather
            for(int i = less; less>= 1; i--){
                if(less % i == 0 && greather % i == 0){
                    return i;
                }
            }
            return 1;
        }
        public String decimaltoBinary(int decimal){
            String binary = "";
            while (decimal >= 1){
                binary = binary.concat(String.valueOf(decimal % 2));
                decimal = decimal / 2;

            }
            //odwrocenie liczby
            StringBuffer sb = new StringBuffer(binary);
            return sb.reverse().toString();

        }
        public int binarytoDecimal(String binary){
            int decimal = 0;
            for (int i = 0; i <binary.length(); i++){
                decimal = decimal + (((int)binary.charAt(i)-48) * power(2, (binary.length()-1) - i));
            }
            return decimal;
        }
        public boolean isPrimary(int number){
            //1. Inicjalizacja licznika podzielnikow
            int counter = 0;
            //2. W petli for zliczamy wszytskie liczby naturalne do liczby number
            //Kazdorazowo sprawdzajac w instrukcji if czy te liczby sa dzielnikami number
            //TAK- licznik ++
            //Nie- nic
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    counter++;
                }
            }
            //3. zwracamy true jesli licznik == 0: false jesli licznik > 0
            return counter == 0 ? true : false;
        }
        public void getPrimaryNumbers(int n){
            LocalTime lt_start = LocalTime.now();
            //1. Inicjalizacja licznika zliczen
            int primaryNumberscounter = 0;
            int i = 2;
            //2. W petli while iterujemy po liczbach naturalnych od 0
            while(primaryNumberscounter <n){
                if (isPrimary(i)){
                    primaryNumberscounter++;
                    System.out.println(i + " ");
                }
                i++;
            }
            //3. W instrukcji if sprawdzamy czy aktualna liczba jest pierwsza
            //-> jezeli tak - wypisujemy i zwiekszamy licznik
            LocalTime lt_stop = LocalTime.now();
            Duration time_interval = Duration.between(lt_start,lt_stop);
            System.out.println("\nCzas wykonywania: " + time_interval);
        }

    }