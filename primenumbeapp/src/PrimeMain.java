public class PrimeMain {
    public static void main(String[] args) {

        int number = 50;


        for ( int i = 3 ; i< number; i++){

            int j=2;
            while (i % j !=0 && j<=i ){
                j++;
                if (i==j && i % j ==0){
                    System.out.println( i + " Es un numero primo");
                }
            }
        }
    }
}
