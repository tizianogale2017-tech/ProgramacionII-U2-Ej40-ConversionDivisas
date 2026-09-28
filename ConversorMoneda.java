package Ejercicio40_conversionDivisas;

public class ConversorMoneda {
    private ProveedorTasaCambio proveedor;

    public ConversorMoneda(ProveedorTasaCambio proveedor) {
        this.proveedor = proveedor;
    }

    public double convertir(double monto, String monedaOrigen, String monedaDestino) {
        if (monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo.");
        }
        return monto * proveedor.obtenerTasa(monedaOrigen, monedaDestino);
    }
}
