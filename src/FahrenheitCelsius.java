public class FahrenheitCelsius extends CalculadoraBasica implements Calculadora{
    @Override
    public double calcular(double a) {
        return 5 / 9 * (a - 32);
    }
}
