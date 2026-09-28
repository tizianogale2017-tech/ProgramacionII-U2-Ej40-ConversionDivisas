package Ejercicio40_conversionDivisas;

public class TasaBancoCentral extends ProveedorTasaCambio {
    @Override
    public double obtenerTasa(String monedaOrigen, String monedaDestino) {
        if (monedaOrigen.equals("USD") && monedaDestino.equals("ARS")) {
            return 1000.0;
        }
        if (monedaOrigen.equals("EUR") && monedaDestino.equals("ARS")) {
            return 1100.0;
        }
        if (monedaOrigen.equals("ARS") && monedaDestino.equals("USD")) {
            return 1 / 1000.0;
        }
        throw new IllegalArgumentException("Par no soportado por el Banco Central: " + monedaOrigen + "/" + monedaDestino);
    }
}
