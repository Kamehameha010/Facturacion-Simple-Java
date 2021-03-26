package com.cr.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPod extends Aparato {
    private double m_capacidad;

    public IPod() {
        super();
    }

    public void capturar() {
        super.capturar();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese capacidad");
            m_capacidad = Double.parseDouble(br.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void imprimir() {
        System.out.println(String.format("Ipod: { precio:%.2f , voltaje: %d, capacidad:%.2f}", obtenerPrecio(),
                obtenerVoltaje(), m_capacidad));
    }

    public void establecerCapacidad(double capacidad) {
        m_capacidad = capacidad;
    }

    public double obtenerCapacidad() {
        return m_capacidad;
    }

    @Override
    public String toString() {
        return String.format("Ipod: { precio:%.2f , voltaje: %d, capacidad:%.2f}", obtenerPrecio(), obtenerVoltaje(),
                m_capacidad);
    }
}
