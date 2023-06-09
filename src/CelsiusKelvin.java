public class CelsiusKelvin extends CalculadoraBasica implements Calculadora{
    @Override
    public double calcular(double a) {
        return a + 273.15;
    }
}
