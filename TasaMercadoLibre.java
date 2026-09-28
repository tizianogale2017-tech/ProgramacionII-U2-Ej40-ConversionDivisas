package Ejercicio40_conversionDivisas;

public class TasaMercadoLibre extends ProveedorTasaCambio {
    @Override
    public double obtenerTasa(String monedaOrigen, String monedaDestino) {
        if (monedaOrigen.equals("USD") && monedaDestino.equals("ARS")) {
            return 1250.0;
        }
        if (monedaOrigen.equals("EUR") && monedaDestino.equals("ARS")) {
            return 1350.0;
        }
        if (monedaOrigen.equals("ARS") && monedaDestino.equals("USD")) {
            return 1 / 1250.0;
        }
        throw new IllegalArgumentException("Par no soportado por el mercado: " + monedaOrigen + "/" + monedaDestino);
    }
}
