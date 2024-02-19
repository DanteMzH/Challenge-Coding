import java.util.Scanner;

public class PoligonoApp {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("--->INGRESE ALTURA");
        int medidaBase = scan1.nextInt();
        System.out.println("--->INGRESE BASE");
        int medidaAltura = scan2.nextInt();


        Poligonos poligono = new Poligonos(medidaBase,medidaAltura);


        poligono.triangulo();
        poligono.rectangulo();
    }
}
