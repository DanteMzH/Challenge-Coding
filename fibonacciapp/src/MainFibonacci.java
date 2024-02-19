import java.util.Scanner;

public class MainFibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese Numero maximo : ");

        int number = scan.nextInt();


        CalculateSerie test = new CalculateSerie(number);
    }
}
