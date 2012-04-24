/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.algoritma.listener;

import grafikakomputer.algoritma.model.BressenhamModel;
import grafikakomputer.algoritma.model.IterationModel;
import java.util.List;

/**
 *
 * @author hendri
 */
public interface GrafkomListener {
    
    public void hitungAlgoritma(BressenhamModel hitung, List<IterationModel> result);
    
}
