public class Poligonos implements CalcularArea{

    int base;
    int altura;
    float area;

    public Poligonos(int base,int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void triangulo() {

        area = base*altura/2;

        System.out.println(area);


    }

    @Override
    public void rectangulo() {
        area = base*altura;

        System.out.println(area);

    }
}
