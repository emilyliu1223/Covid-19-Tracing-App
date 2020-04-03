/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DocumentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.DocumentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTest_documentDoctor;
import Business.WorkQueue.WorkRequest_documentDoctor;
import People.MedicalRecord;
import People.People;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stacyhuang
 */
public class SendPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SendPatientJPanel
     */
    private JPanel jpanel;
    private UserAccount userAccount;
    private DocumentOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private People thispeople;
    public SendPatientJPanel(JPanel jpanel, UserAccount userAccount, DocumentOrganization organization, Enterprise enterprise, EcoSystem system) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.jpanel=jpanel;
        this.userAccount=userAccount;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
        this.thispeople=null;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchfield = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        sendbtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        foundPatientTable = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();

        searchbtn.setText("search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("search patient id");

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "name", "age", "gender", "doctor", "status", "send date", "note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(0).setResizable(false);
            patientTable.getColumnModel().getColumn(1).setResizable(false);
            patientTable.getColumnModel().getColumn(2).setResizable(false);
            patientTable.getColumnModel().getColumn(3).setResizable(false);
            patientTable.getColumnModel().getColumn(4).setResizable(false);
            patientTable.getColumnModel().getColumn(4).setHeaderValue("doctor");
            patientTable.getColumnModel().getColumn(5).setHeaderValue("status");
            patientTable.getColumnModel().getColumn(6).setResizable(false);
            patientTable.getColumnModel().getColumn(6).setHeaderValue("send date");
            patientTable.getColumnModel().getColumn(7).setResizable(false);
            patientTable.getColumnModel().getColumn(7).setHeaderValue("note");
        }

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane2.setViewportView(textarea);

        sendbtn.setText("send");
        sendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnActionPerformed(evt);
            }
        });

        foundPatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "name", "age", "gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(foundPatientTable);
        if (foundPatientTable.getColumnModel().getColumnCount() > 0) {
            foundPatientTable.getColumnModel().getColumn(0).setResizable(false);
            foundPatientTable.getColumnModel().getColumn(1).setResizable(false);
            foundPatientTable.getColumnModel().getColumn(2).setResizable(false);
            foundPatientTable.getColumnModel().getColumn(3).setResizable(false);
        }

        backbtn.setBackground(new java.awt.Color(255, 255, 255));
        backbtn.setText("back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendbtn))))
                    .addComponent(backbtn))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sendbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateFoundPatient(People people){
        DefaultTableModel model = (DefaultTableModel)foundPatientTable.getModel();
        model.setRowCount(0);
        Object row[]=new Object[4];
        row[0]=people.getId();
        row[1]=people;
        row[2]=people.getAge();
        row[3]=people.getGender();
        model.addRow(row);
    }
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)patientTable.getModel();
        model.setRowCount(0);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        for(WorkRequest_documentDoctor request:organization.getWorkQueue_documentDoctor().getWorkRequestList()){
            Object row[]=new Object[8];
            row[0]=request.getPeople().getId();
            row[1]=request.getPeople().getName();
            row[2]=request.getPeople().getAge();
            row[3]=request.getPeople().getGender();
            row[4]=request.getAssignedDoctor()==null?"pending":request.getAssignedDoctor().getEmployee().getName();
            row[5]=request.getStatus();
            row[6]=formatter.format(request.getDate());
            String result=((LabTest_documentDoctor)request).getMessage();
            row[7]=result;
            model.addRow(row);
        }
    }
    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String searchId=searchfield.getText();
        thispeople=null;
        if(searchId.equals("")){
            JOptionPane.showMessageDialog(null, "please enter patient id to search");
            return;
        }else{
            for(People peopleFound:system.getPeopleDirectory().getPeoples()){
                if(peopleFound.getId().equals(searchId)){
                    thispeople=peopleFound;
                    break;
                }
            }
        }
            if(thispeople!=null){
                  populateFoundPatient(thispeople);
                }else{
                    JOptionPane.showMessageDialog(null, "cannot find this patient, please make sure the id you enter is correct");
                    searchfield.setText("");
                    return;
            }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void sendbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtnActionPerformed
        // TODO add your handling code here:
        int select=foundPatientTable.getSelectedRow();
        Date date=new Date();
        if(select<0){
            JOptionPane.showMessageDialog(null,"please select");
            return;
        }else{
            People patient=(People) foundPatientTable.getValueAt(select, 1);
            DoctorOrganization org=null;
            for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
                if(o instanceof DoctorOrganization){
                    org=(DoctorOrganization) o;
                    break;
                }
            }
            LabTest_documentDoctor request=new LabTest_documentDoctor();
            request.setDate(date);
            request.setMessage(textarea.getText());
            request.setPeople(patient);
            request.setStatus("pending");
            request.setSender(organization);
            request.setReceiver(org);
            org.getWorkQueue_documentDoctor().getWorkRequestList().add(request);
            organization.getWorkQueue_documentDoctor().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "send to doctor success");
            populateTable();
            textarea.setText("");
        }
    }//GEN-LAST:event_sendbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        jpanel.remove(this);
        CardLayout layout = (CardLayout) jpanel.getLayout();
        layout.previous(jpanel);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTable foundPatientTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchfield;
    private javax.swing.JButton sendbtn;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}
