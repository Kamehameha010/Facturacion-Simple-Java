package com.cr.DB;

import java.util.ArrayList;
import java.util.List;

import com.cr.model.Factura;

public class FacturaService implements iFacturaService {

    private static List<Factura> facturas;

    public FacturaService(){
        facturas = new ArrayList<Factura>();
    }
    @Override
    public void agregar(Factura model) {
        facturas.add(model);
    }

    @Override
    public void editar(Factura model) {
        for (Factura factura : facturas) {
            if(factura.obtenerNumero()== model.obtenerNumero()){
                facturas.remove(factura);
                facturas.add(model);
                return;
            }
        }
    }

    @Override
    public void eliminar(int numero) {
        for (Factura factura : facturas) {
            if(factura.obtenerNumero()== numero){
                facturas.remove(factura);
                return;
            }
        } 
    }

    @Override
    public List<Factura> listar() {
        
        return facturas;
    }
    
}
