package com.cr.factory;

import com.cr.model.Aparato;
import com.cr.model.Equipo;
import com.cr.model.IPod;
import com.cr.model.Televisor;

public class AparatoFactory {
    public Aparato crearAparato(int tipo) {
        switch (tipo) {
        case 0:
            return new Equipo();
        case 1:
            return new IPod();
        case 2:
            return new Televisor();
        default:
            return null;
        }
    }
}
