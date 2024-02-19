public class CalculateSerie {

    public CalculateSerie(int number) {

        calcularFibonacci(number);

    }

    public void calcularFibonacci(int number){

        int first = 0;
        int second = 1;
        int suma = 0;

        while (suma <=number){



            suma = second + first;

            first = second;

            second = suma;

            System.out.println(suma);



        }
    }

}
