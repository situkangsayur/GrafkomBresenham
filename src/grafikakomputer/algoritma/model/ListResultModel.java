/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.algoritma.model;

import java.util.Collection;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author hendri
 */
public class ListResultModel extends AbstractListModel {

    private List<String> result;

    public void setResult(List<String> result) {
        this.result = result;

    }

    public void removeAll() {
        result.clear();
    }
    
    

    @Override
    public int getSize() {
        return result.size();
    }

    public int getColumnCount() {
        return 8;

    }

    @Override
    public Object getElementAt(int index) {
        return result.get(index);
    }

    public boolean add(String e) {
        try {
            return result.add(e);

        } finally {
            fireIntervalAdded(result, getSize() - 1, getSize() - 1);
        }
    }
}
