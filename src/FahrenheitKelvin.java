public class FahrenheitKelvin extends CalculadoraBasica implements Calculadora{
    @Override
    public double calcular(double a) {
        return 5/9 * (a - 32) + 273.15;
    }
}
