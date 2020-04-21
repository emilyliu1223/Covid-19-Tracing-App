/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.WorkQueue.WorkRequest_documentDoctor;
import People.Diagnosis;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stacyhuang
 */
public class PatientDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientDetailJPanel
     */
    private JPanel jpanel;
//    private String detail;
//    private String medicine;
    private Diagnosis diagnosis;
    public PatientDetailJPanel(JPanel jpanel, Diagnosis diagnosis) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.jpanel=jpanel;
        this.diagnosis=diagnosis;
        dateLabel.setText("Date: "+this.diagnosis.getDate());
        popMedicine();
        diagnosisfield.setEditable(false);
        symptomsarea.setEditable(false);
        diagnosisfield.setText(diagnosis.getDiagnosis());
        setSymptoms(diagnosis);
     
    }

    private void setSymptoms(Diagnosis dia){
        String symptoms="";
        if(dia.getSymptoms()==null){
        
            symptoms="";
        }else{
            for(String str:dia.getSymptoms()){
                symptoms+=str+"";
            }
        
    }symptomsarea.setText(symptoms);}
    private void popMedicine(){
       DefaultTableModel model = (DefaultTableModel) medicinetable.getModel();
        model.setRowCount(0);
        if(diagnosis.getMedicine()==null){ Object[] row = new Object[2];
            row[0]="";
            row[1]="";
         model.addRow(row);}else{
        for (String str:diagnosis.getMedicine()){
            String a=str;
            Object[] row = new Object[2];
            row[0]=a.split(":")[0];
            row[1]=a.split(":")[1];
//              row[0]=a;
//              row[1]=a;
            model.addRow(row);
        }
    }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosisfield = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicinetable = new javax.swing.JTable();
        backbtn1 = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        symptomsarea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 102, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diagnosisfield.setColumns(20);
        diagnosisfield.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        diagnosisfield.setForeground(new java.awt.Color(0, 153, 204));
        diagnosisfield.setRows(5);
        jScrollPane1.setViewportView(diagnosisfield);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 132, 540, 150));

        medicinetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "type", "amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(medicinetable);
        if (medicinetable.getColumnModel().getColumnCount() > 0) {
            medicinetable.getColumnModel().getColumn(0).setResizable(false);
            medicinetable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 445, 380));

        backbtn1.setBackground(new java.awt.Color(204, 204, 204));
        backbtn1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        backbtn1.setForeground(new java.awt.Color(255, 153, 51));
        backbtn1.setText("back");
        backbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn1ActionPerformed(evt);
            }
        });
        add(backbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 210, 70));
        add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 72, 169, 36));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("diagnosis detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("medicine list");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 192, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("symptoms");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        symptomsarea.setColumns(20);
        symptomsarea.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        symptomsarea.setForeground(new java.awt.Color(0, 153, 204));
        symptomsarea.setRows(5);
        jScrollPane3.setViewportView(symptomsarea);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 540, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn1ActionPerformed
        // TODO add your handling code here:
        jpanel.remove(this);
        CardLayout layout = (CardLayout) jpanel.getLayout();
        layout.previous(jpanel);
    }//GEN-LAST:event_backbtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn1;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextArea diagnosisfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable medicinetable;
    private javax.swing.JTextArea symptomsarea;
    // End of variables declaration//GEN-END:variables
}
