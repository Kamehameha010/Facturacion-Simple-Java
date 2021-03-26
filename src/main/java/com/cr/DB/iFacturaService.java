package com.cr.DB;

import java.util.List;

import com.cr.model.Factura;

public interface iFacturaService {

    void agregar(Factura model);

    void editar(Factura model);

    void eliminar(int factura);

    List<Factura> listar();
}
