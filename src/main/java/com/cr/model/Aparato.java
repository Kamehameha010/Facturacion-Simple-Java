package com.cr.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aparato implements IImprimir {

    private double m_precio;
    private int m_voltaje;

    public Aparato() {
    }

    public void capturar() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese Precio");
            m_precio = Double.parseDouble(br.readLine());
            System.out.println("Ingrese Voltaje");
            m_voltaje = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void establecer(int voltaje, double precio) {

        if (precio < 0.0) {
            precio = 0.0;
        }
        if (voltaje < 0) {
            voltaje = 0;
        }

        m_voltaje = voltaje;
        m_precio = precio;
    }

    public void establecerPrecio(double precio) {
        m_precio = precio;
    }

    public double obtenerPrecio() {
        return m_precio;
    }

    public void establecerVoltaje(int voltaje) {
        m_voltaje = voltaje;
    }

    public int obtenerVoltaje() {
        return m_voltaje;
    }

    public double capturarDesc(double descuento) {
        return m_precio * descuento;
    }

    @Override
    public void imprimir() {
        System.out.println(String.format("Aparato: { precio:%.2f , voltaje: %d }", m_precio, m_voltaje));
    }

    @Override
    public String toString() {
        return String.format("Aparato: { precio:%.2 , voltaje: %d }", m_precio, m_voltaje);
    }

}
