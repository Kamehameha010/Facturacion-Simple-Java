package com.cr.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Televisor extends Aparato {

    private double m_tamanio;

    public Televisor() {

    }

    public void capturar() {
        super.capturar();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese tamanio:");
            m_tamanio = Double.parseDouble(br.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void imprimir() {
        System.out.println(String.format("TV: { precio:%.2f , voltaje: %d, tamanio:%.2f}", obtenerPrecio(),
                obtenerVoltaje(), m_tamanio));
    }

    public void establecerTamanio(double tamanio) {
        m_tamanio = tamanio;
    }

    public double obtenerTamanio() {
        return m_tamanio;
    }

    @Override
    public String toString() {
        return String.format("TV: { precio:%.2f , voltaje: %d, tamanio:%.2f}", obtenerPrecio(), obtenerVoltaje(),
                m_tamanio);
    }
}
