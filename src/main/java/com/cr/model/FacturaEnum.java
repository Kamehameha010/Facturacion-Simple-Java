package com.cr.model;

public enum FacturaEnum {
    Equipo(1), IPod(2), TV(3);

    private int valor;

    private FacturaEnum(int valor) {
        this.valor = valor;
    }
}
