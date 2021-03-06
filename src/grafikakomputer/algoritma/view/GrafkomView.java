package grafikakomputer.algoritma.view;

import grafikakomputer.algoritma.controller.GrafkomController;
import grafikakomputer.algoritma.listener.GrafkomListener;
import grafikakomputer.algoritma.model.BressenhamModel;
import grafikakomputer.algoritma.model.GrafkomModel;
import grafikakomputer.algoritma.model.IterationModel;
import grafikakomputer.algoritma.model.Koordinat;
import grafikakomputer.algoritma.model.ListResultModel;
import grafikakomputer.algoritma.model.TableIteration;
import grafikakomputer.widget.ui.OvalTextField;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GrafkomView.java
 *
 * Created on Apr 24, 2012, 10:02:23 AM
 */
/**
 *
 * @author hendri
 */
public class GrafkomView extends javax.swing.JPanel implements GrafkomListener {
    
    private GrafkomModel model;
    private GrafkomController controller;
    private TableIteration tableModel;
    private List<IterationModel> iteratioResult;
    private ListResultModel listModel;
    private List<String> resultString;

    /** Creates new form GrafkomView */
    public GrafkomView() {
        initComponents();
        
        iteratioResult = new ArrayList<IterationModel>();
        
        model = new GrafkomModel();
        model.setListener(this);
        controller = new GrafkomController(this);
        controller.setModel(model);
        tableModel = new TableIteration();
        IterationModel sample = new IterationModel();
        sample.setItterationK(2);
        sample.setParameterPx(3);
        Koordinat point = new Koordinat();
        point.setX(2);
        point.setY(4);
        sample.setPoint(point);
        iteratioResult.add(sample);
        tableModel.setListResult(iteratioResult);
        
        table1.setModel(tableModel);
        resultString = new ArrayList<String>();
        
        listModel = new ListResultModel();
        listModel.setResult(resultString);
        listGlass1.getList().setModel(listModel);
        
    }
    
    public OvalTextField getTextEndX() {
        return textEndX;
    }
    
    public OvalTextField getTextEndY() {
        return textEndY;
    }
    
    public OvalTextField getTextStartX() {
        return textStartX;
    }
    
    public OvalTextField getTextStartY() {
        return textStartY;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        darkGrayPanel1 = new grafikakomputer.widget.panel.DarkGrayPanel();
        panelOval1 = new grafikakomputer.widget.panel.PanelOval();
        panelWhiteBorder1 = new grafikakomputer.widget.panel.PanelWhiteBorder();
        panelWhiteBorder3 = new grafikakomputer.widget.panel.PanelWhiteBorder();
        panelOval2 = new grafikakomputer.widget.panel.PanelOval();
        textStartX = new grafikakomputer.widget.ui.OvalTextField();
        textStartY = new grafikakomputer.widget.ui.OvalTextField();
        textEndX = new grafikakomputer.widget.ui.OvalTextField();
        textEndY = new grafikakomputer.widget.ui.OvalTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttoHitung = new grafikakomputer.widget.ui.ButtonGlass();
        jLabel7 = new javax.swing.JLabel();
        panelOval3 = new grafikakomputer.widget.panel.PanelOval();
        listGlass1 = new grafikakomputer.widget.ui.ListGlass();
        tableGlass1 = new grafikakomputer.widget.ui.TableGlass();
        table1 = new grafikakomputer.widget.ui.Table();

        setLayout(new java.awt.BorderLayout());

        darkGrayPanel1.setLayout(new java.awt.BorderLayout());

        panelOval1.setLayout(new java.awt.BorderLayout());

        panelWhiteBorder1.setLayout(new java.awt.BorderLayout());

        panelWhiteBorder3.setPreferredSize(new java.awt.Dimension(610, 300));
        panelWhiteBorder3.setLayout(new javax.swing.BoxLayout(panelWhiteBorder3, javax.swing.BoxLayout.LINE_AXIS));

        panelOval2.setPreferredSize(new java.awt.Dimension(250, 300));

        textStartX.setForeground(new java.awt.Color(1, 1, 1));
        textStartX.setText("\n");

        textStartY.setForeground(new java.awt.Color(1, 1, 1));
        textStartY.setText("\n");

        textEndX.setForeground(new java.awt.Color(1, 1, 1));
        textEndX.setText("\n");

        textEndY.setForeground(new java.awt.Color(1, 1, 1));
        textEndY.setText("\n");

        jLabel1.setForeground(new java.awt.Color(253, 251, 251));
        jLabel1.setText("Bresenham");

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Start Point");

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("X = ");

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Y =");

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Y =");

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("X = ");

        buttoHitung.setText("Get Result");
        buttoHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoHitungActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("End Point");

        javax.swing.GroupLayout panelOval2Layout = new javax.swing.GroupLayout(panelOval2);
        panelOval2.setLayout(panelOval2Layout);
        panelOval2Layout.setHorizontalGroup(
            panelOval2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOval2Layout.createSequentialGroup()
                .addGroup(panelOval2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOval2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOval2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelOval2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOval2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelOval2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(panelOval2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textStartY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textEndX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textEndY, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(textStartX, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(buttoHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)))
                    .addGroup(panelOval2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelOval2Layout.setVerticalGroup(
            panelOval2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOval2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOval2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textStartX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOval2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(textStartY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addGroup(panelOval2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOval2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addGroup(panelOval2Layout.createSequentialGroup()
                        .addGroup(panelOval2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textEndX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textEndY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(buttoHitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelWhiteBorder3.add(panelOval2);

        panelOval3.setLayout(new java.awt.BorderLayout());
        panelOval3.add(listGlass1, java.awt.BorderLayout.CENTER);

        panelWhiteBorder3.add(panelOval3);

        panelWhiteBorder1.add(panelWhiteBorder3, java.awt.BorderLayout.PAGE_START);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableGlass1.setViewportView(table1);

        panelWhiteBorder1.add(tableGlass1, java.awt.BorderLayout.CENTER);

        panelOval1.add(panelWhiteBorder1, java.awt.BorderLayout.CENTER);

        darkGrayPanel1.add(panelOval1, java.awt.BorderLayout.CENTER);

        add(darkGrayPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

private void buttoHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoHitungActionPerformed
// TODO add your handling code here:
    controller.getResult();
}//GEN-LAST:event_buttoHitungActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private grafikakomputer.widget.ui.ButtonGlass buttoHitung;
    private grafikakomputer.widget.panel.DarkGrayPanel darkGrayPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private grafikakomputer.widget.ui.ListGlass listGlass1;
    private grafikakomputer.widget.panel.PanelOval panelOval1;
    private grafikakomputer.widget.panel.PanelOval panelOval2;
    private grafikakomputer.widget.panel.PanelOval panelOval3;
    private grafikakomputer.widget.panel.PanelWhiteBorder panelWhiteBorder1;
    private grafikakomputer.widget.panel.PanelWhiteBorder panelWhiteBorder3;
    private grafikakomputer.widget.ui.Table table1;
    private grafikakomputer.widget.ui.TableGlass tableGlass1;
    private grafikakomputer.widget.ui.OvalTextField textEndX;
    private grafikakomputer.widget.ui.OvalTextField textEndY;
    private grafikakomputer.widget.ui.OvalTextField textStartX;
    private grafikakomputer.widget.ui.OvalTextField textStartY;
    // End of variables declaration//GEN-END:variables

    @Override
    public void hitungAlgoritma(BressenhamModel hitung, List<IterationModel> result) {
        tableModel.setListResult(result);
        table1.removeAll();
        table1.setModel(tableModel);
        listModel.removeAll();
        listModel.add("Start Point (X,Y) = " + hitung.getStartPoint().getX() + "," + hitung.getStartPoint().getY());
        listModel.add("End Point (X,Y) = " + hitung.getEndPoint().getX() + "," + hitung.getEndPoint().getY());
        listModel.add("Delta X = " + hitung.getDelta().getX());
        listModel.add("Delta Y = " + hitung.getDelta().getY());
        listModel.add("2*Delta X = " + hitung.getDuaDeltaX());
        listModel.add("2*Delta Y = " + hitung.getDuaDeltaY());
        listModel.add("(2*Delta Y) - (2*Delta X) = " + hitung.getDuaDeltaYMinDuaDeltaY());
        listModel.add("P(0) = (2*Delta Y) - Delta X  = " + hitung.getParameterKeNol());
        
        
        
        System.out.println("opened");
    }
}
