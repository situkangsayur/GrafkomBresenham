/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.algoritma.controller;

import grafikakomputer.algoritma.model.GrafkomModel;
import grafikakomputer.algoritma.model.Koordinat;
import grafikakomputer.algoritma.view.GrafkomView;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author hendri
 */
public class GrafkomController {

    private GrafkomView view;
    private GrafkomModel model;
    private Koordinat startPoint;
    private Koordinat endPoint;

    public GrafkomController(GrafkomView view) {
        this.view = view;
    }

    public void setModel(GrafkomModel model) {
        this.model = model;
    }

    public void getResult() {
        if (startPoint == null) {
            startPoint = new Koordinat();
        }
        if (endPoint == null) {
            endPoint = new Koordinat();
        }

        if (view.getTextStartX().getText().equals("") || view.getTextStartY().getText().equals("")) {
            JOptionPane.showMessageDialog(view, "masukan koordinat awal dengan benar..");
        }

        if (view.getTextEndX().getText().equals("") || view.getTextEndY().getText().equals("")) {
            JOptionPane.showMessageDialog(view, "masukan koordinat akhir dengan benar..");
        }

        startPoint.setX(new Integer(view.getTextStartX().getText().trim()));
        startPoint.setY(new Integer(view.getTextStartY().getText().trim()));

        endPoint.setX(new Integer(view.getTextEndX().getText().trim()));
        endPoint.setY(new Integer(view.getTextEndY().getText().trim()));

        model.setStartPoint(startPoint);
        model.setEndPoint(endPoint);

        model.searchResult();
    }
}
