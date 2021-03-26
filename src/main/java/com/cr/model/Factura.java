package com.cr.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factura implements IImprimir {
    private int m_numero;
    private double m_pctDescuento;

    public Factura() {

    }

    public void capturar() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese Numero");
            m_numero = Integer.parseInt(br.readLine());
            System.out.println("Ingrese Descuento");
            m_pctDescuento = Double.parseDouble(br.readLine());

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void establecer(int numero, double descuento) {
        if (numero < 0) {
            numero = 0;
        }
        if (descuento < 0.0) {
            descuento = 0.0;
        }

        m_pctDescuento = descuento;
        m_numero = numero;
    }

    public void establecerNumero(int numero) {
        m_numero = numero;
    }

    public int obtenerNumero() {
        return m_numero;
    }

    public void establecerPctDesc(double descuento) {
        m_pctDescuento = descuento;
    }

    public double obtenerPctDesc() {
        return m_numero;
    }

    @Override
    public void imprimir() {
        System.out.println(String.format("Factura: { idFactura:%d , descuento:%.2f }", m_numero, m_pctDescuento));
    }

    @Override
    public String toString() {
        return String.format("Factura: { idFactura:%d , descuento:%.2f}", m_numero, m_pctDescuento);
    }
}
