/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInferface;

import MainModel.ProfessorHistory;
import javax.swing.JPanel;

/**
 *
 * @author dipenpatel
 */
public class ProfessorAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorAdminJPanel
     */
//    public ProfessorAdminJPanel() {
//        initComponents();
//    }
    private JPanel WorkArea;
    private ProfessorHistory ProfessorHistory;
    ProfessorAdminJPanel(JPanel WorkArea, ProfessorHistory ProfessorHistory) {
        initComponents();
        this.WorkArea=WorkArea;
        this.ProfessorHistory=ProfessorHistory;    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}