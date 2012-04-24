/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.algoritma.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hendri
 */
public class TableIteration extends AbstractTableModel {

    private List<IterationModel> listResult;

    public void setListResult(List<IterationModel> listResult) {
        this.listResult = listResult;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listResult.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object object = null;
        switch (columnIndex) {

            case 0:
                return listResult.get(rowIndex).getItterationK();
            case 1:
                return listResult.get(rowIndex).getParameterPx();
            case 2:
                return listResult.get(rowIndex).getPointX();
            case 3:
                return listResult.get(rowIndex).getPointY();

            default:
                return null;

        }


    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "K";
            case 1:
                return "Px";
            case 2:
                return "Point X";
            case 3:
                return "Point Y";
            default:
                return null;
        }
    }
}
