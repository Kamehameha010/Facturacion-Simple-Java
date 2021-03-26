package com.cr.model;

public class FacturaEquipo extends Factura {

    private Equipo m_articulo;

    public FacturaEquipo() {
    }

    public void capturar() {
        super.capturar();
        System.out.println("Ingrese Articulo");
        m_articulo = new Equipo();
        m_articulo.capturarDesc(obtenerPctDesc());
        m_articulo.capturar();

    }

    public void establecer(int numero, Equipo articulo, double descuento) {
        super.establecer(numero, descuento);
        m_articulo = articulo;

    }

    @Override
    public void imprimir() {
        System.out.println(String.format("FacturaEquipo: { idFactura:%d , aparato: %s, descuento:%.2f }",
                obtenerNumero(), m_articulo.toString(), obtenerPctDesc()));
    }

    @Override
    public String toString() {
        return String.format("FacturaEquipo: { idFactura:%d , aparato: %s, descuento:%.2f }", obtenerNumero(),
                m_articulo.toString(), obtenerPctDesc());
    }
}
