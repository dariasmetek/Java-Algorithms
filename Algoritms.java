package Z1;



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

    }