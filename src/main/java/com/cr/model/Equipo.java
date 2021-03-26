package com.cr.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Equipo extends Aparato {
    private int m_cantidadCDs;

    public Equipo() {
        super();
    }

    public void capturar() {
        super.capturar();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese CantidadCds");
            m_cantidadCDs = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void imprimir() {
        System.out.println(String.format("Equipo: { precio:%.2f , voltaje: %d, cantidadCds:%d}", obtenerPrecio(),
                obtenerVoltaje(), m_cantidadCDs));
    }

    public void establecerCantidadCDs(int cantidadCDs) {
        m_cantidadCDs = cantidadCDs;
    }

    public int obtenerCantidadCDs() {
        return m_cantidadCDs;
    }

    @Override
    public String toString() {
        return String.format("Equipo: { precio:%.2f , voltaje: %d, cantidadCds:%d}", obtenerPrecio(), obtenerVoltaje(),
                m_cantidadCDs);
    }
}
