package exercicios2;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double celcius) {
        double fahrenheit = (celcius * 1.8)+32;
        System.out.println("O valor de Celcius para Fahrenheit é: "+fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celcius = (fahrenheit - 32)/1.8;
        System.out.println("O valor de Fahrenheit para Celcius é: "+celcius);
    }
}
