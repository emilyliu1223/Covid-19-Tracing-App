/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InvestigationRole;

import userinterface.ReceptionRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.QuarantineOrganization;
import Business.Organization.ReceptionOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest_receptionInvestigation;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stacyhuang
 */
public class PatientDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionWorkAreaJPanel
     */
    private JPanel jpanel;
    private ReceptionOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private WorkRequest_receptionInvestigation thisrequest;
    public PatientDetailJPanel(JPanel jpanel, UserAccount userAccount, ReceptionOrganization organization, Enterprise enterprise, EcoSystem system) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.jpanel = jpanel;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system=system;
        setField(false);
        popTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        needquarantinelist = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        symptonarea = new javax.swing.JTextArea();
        recordbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        phonefield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        statefield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        countyfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hospitalfield = new javax.swing.JTextField();
        selectbtn = new javax.swing.JButton();

        needquarantinelist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Case Number", "ID", "Name", "Age", "Gender", "State", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(needquarantinelist);
        if (needquarantinelist.getColumnModel().getColumnCount() > 0) {
            needquarantinelist.getColumnModel().getColumn(0).setResizable(false);
            needquarantinelist.getColumnModel().getColumn(1).setResizable(false);
            needquarantinelist.getColumnModel().getColumn(2).setResizable(false);
            needquarantinelist.getColumnModel().getColumn(3).setResizable(false);
            needquarantinelist.getColumnModel().getColumn(4).setResizable(false);
            needquarantinelist.getColumnModel().getColumn(5).setResizable(false);
            needquarantinelist.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel2.setText("Syptoms");

        symptonarea.setColumns(20);
        symptonarea.setRows(5);
        jScrollPane3.setViewportView(symptonarea);

        recordbtn.setText("Record List");
        recordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("phone");

        jLabel4.setText("address");

        jLabel5.setText("state");

        jLabel6.setText("county");

        jLabel7.setText("from hospital");

        selectbtn.setText("select");
        selectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(phonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(statefield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(countyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(hospitalfield, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(recordbtn)
                                .addGap(0, 147, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectbtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(phonefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(statefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(countyfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(hospitalfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recordbtn))
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void popTable(){
        DefaultTableModel model = (DefaultTableModel) needquarantinelist.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        model.setRowCount(0);
        for(WorkRequest_receptionInvestigation request: organization.getWorkQueue_receptionInvestigation().getWorkRequestList()){
            Object row[]=new Object[7];
            row[0]=request;
            row[1]=request.getPatient().getId();
            row[2]=request.getPatient().getName();
            row[3]=request.getPatient().getAge();
            row[4]=request.getPatient().getGender();
            row[5]=request.getPatient().getState();
            row[6]=request.getStatus();
            model.addRow(row);
        }
    }
    private void setField(boolean boo){
        phonefield.setEditable(boo);
        addressfield.setEditable(boo);
        statefield.setEditable(boo);
        countyfield.setEditable(boo);
        hospitalfield.setEditable(boo);
        symptonarea.setEditable(boo);
    }
    private void recordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordbtnActionPerformed
        // TODO add your handling code here:
        thisrequest.setStatus("recorded");
        popTable();
    }//GEN-LAST:event_recordbtnActionPerformed

    private void selectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtnActionPerformed
        // TODO add your handling code here:
        int select=needquarantinelist.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null,"please select");
            return;
        }else{
            WorkRequest_receptionInvestigation request=(WorkRequest_receptionInvestigation) needquarantinelist.getValueAt(select, 0);
            symptonarea.setText(request.getSymptons());
            phonefield.setText(request.getPatient().getPhone());
            addressfield.setText(request.getPatient().getAddress());
            statefield.setText(request.getPatient().getState());
            countyfield.setText(request.getPatient().getCounty());
            hospitalfield.setText(request.getHospital().getName());
            thisrequest=request;
        }
    }//GEN-LAST:event_selectbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressfield;
    private javax.swing.JTextField countyfield;
    private javax.swing.JTextField hospitalfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable needquarantinelist;
    private javax.swing.JTextField phonefield;
    private javax.swing.JButton recordbtn;
    private javax.swing.JButton selectbtn;
    private javax.swing.JTextField statefield;
    private javax.swing.JTextArea symptonarea;
    // End of variables declaration//GEN-END:variables
}
