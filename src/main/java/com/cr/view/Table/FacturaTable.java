/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cr.view.Table;

import com.cr.model.Factura;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class FacturaTable  extends AbstractTableModel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String m_colNames[] = { "Factura", "Descuento", "Aparato" };
    private List<Factura> m_facturas;

    public FacturaTable(List<Factura> facturas) {
        m_facturas = facturas;
    }

    @Override
    public String getColumnName(int column) {
        return m_colNames[column];
    }

    @Override
    public int getRowCount() {
        return m_facturas.size();
    }

    @Override
    public int getColumnCount() {

        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
        case 0 -> m_facturas.get(rowIndex).obtenerNumero();
        case 1 -> m_facturas.get(rowIndex).obtenerPctDesc();
        }
        return null;
    }

    public Factura getRowTask(int row) {
        return m_facturas.get(row);
    }

}
