public class CelsiusFahrenheit extends CalculadoraBasica implements Calculadora {

    @Override
    public double calcular(double a) {;
        return (a * 1.8) +32;
    }
}
