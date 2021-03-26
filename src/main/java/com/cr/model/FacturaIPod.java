package com.cr.model;

public class FacturaIPod extends Factura {

    private IPod m_articulo;

    public FacturaIPod() {
    }

    public void capturar() {
        super.capturar();
        System.out.println("Ingrese Articulo");
        m_articulo = new IPod();
        m_articulo.capturar();

    }

    public void establecer(int numero, IPod articulo, double descuento) {
        super.establecer(numero, descuento);
        m_articulo = articulo;

    }

    @Override
    public void imprimir() {
        System.out.println(String.format("FacturaIPod: { idFactura:%d , aparato: %s, descuento:%.2f }",
                obtenerNumero(), m_articulo, obtenerPctDesc()));

    }

    @Override
    public String toString() {
        return String.format("FacturaIPod: { idFactura:%d , aparato: %s, descuento:%.2f }", obtenerNumero(),
                m_articulo, obtenerPctDesc());
    }
}
