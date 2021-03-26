package com.cr.factory;

import com.cr.model.Equipo;
import com.cr.model.Factura;
import com.cr.model.FacturaEquipo;
import com.cr.model.FacturaIPod;
import com.cr.model.FacturaTV;

public class FacturaFactory {

    public Factura crearFactura(int tipo) {
        switch (tipo) {
        case 0:
            return new FacturaEquipo();
        case 1:
            return new FacturaIPod();
        case 2:
            return new FacturaTV();
        default:
            return null;
        }
    }
}
