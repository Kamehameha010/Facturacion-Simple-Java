package com.cr.model;

public class FacturaTV extends Factura {
    private Televisor m_articulo;

    public FacturaTV() {
    }

    public void capturar() {
        super.capturar();
        System.out.println("Ingrese Articulo");
        m_articulo = new Televisor();
        m_articulo.capturar();

    }

    public void establecer(int numero, Televisor articulo, double descuento) {
        super.establecer(numero, descuento);
        m_articulo = articulo;

    }

    @Override
    public void imprimir() {
        System.out.println(String.format("FacturaTV: { idFactura:%d , aparato: %s, descuento:%.2f }",
                obtenerNumero(), m_articulo, obtenerPctDesc()));
    }

    @Override
    public String toString() {
        return String.format("FacturaTV: { idFactura:%d , aparato: %s, descuento:%.2f }", obtenerNumero(),
                m_articulo, obtenerPctDesc());
    }
}
