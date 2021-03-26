package com.cr.controller;

import java.util.List;

import com.cr.DB.FacturaService;
import com.cr.DB.iFacturaService;
import com.cr.model.Factura;

public class FacturaController {

    iFacturaService service;

    public FacturaController() {
        service = new FacturaService();
    }

    public void agregar(Factura model) {

        service.agregar(model);

    }

    public void editar(Factura model) {
        service.editar(model);
    }

    public void eliminar(int factura) {
        service.eliminar(factura);
    }

    public List<Factura> Listar() {
        return service.listar();
    }

}
