/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.QuarantineOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.LabTest_doctorQuarantine;
import Business.WorkQueue.LabTest_documentDoctor;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequest_doctorQuarantine;
import Business.WorkQueue.WorkRequest_documentDoctor;
import People.People;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AdministrativeRole.ManageOrganizationJPanel;
import userinterface.DocumentRole.SendPatientJPanel;

/**
 *
 * @author raunak
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jpanel;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private People thispeople;
    private ArrayList<String> medicineArr;
    private WorkRequest_documentDoctor thisrequest;
    private int quarantine_id=0;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, DoctorOrganization organization, Enterprise enterprise,EcoSystem system) {
        initComponents();
        
        this.jpanel = jpanel;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system=system;
        this.thispeople=null;
        this.thisrequest=null;
        valueLabel.setText(userAccount.getUsername());
        finishbtn.setEnabled(false);
        populateRequestTable();
    }
    
    private String convertArrayToString(ArrayList<String> arr){
        String toReturn="";
        if(arr.size()!=0){
            toReturn=arr.get(0);
            for(int i=1;i<arr.size(); i++){
                toReturn=toReturn+","+arr.get(i);
            }
        }else{
            toReturn="";
        }
        
        return toReturn;
    }
        
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        model.setRowCount(0);
        for (WorkRequest_documentDoctor request : organization.getWorkQueue_documentDoctor().getWorkRequestList()){
            Object[] row = new Object[7];
            row[0]=request;
            row[1]=request.getPeople().getGender();
            row[2]=request.getPeople().getAge();
            row[3]=request.getStatus();
            row[4]=formatter.format(request.getDate());
            row[5]=request.getAssignedDoctor()==null?"pending":request.getAssignedDoctor().getEmployee().getName();
            row[6]=((LabTest_documentDoctor)request).getMessage();
            
            model.addRow(row);
        }
    }

    
    public void popTestTable(People p){
        DefaultTableModel model = (DefaultTableModel) testTable.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        model.setRowCount(0);
        for(WorkRequest_doctorQuarantine quarantine:p.getQuarantineTesting().getWorkRequestList()){
            Object row[]=new Object[4];
            row[0]=quarantine.getTestType();
            row[1]=quarantine.getResult();
            
            row[2]=formatter.format(quarantine.getDate());
            row[3]=quarantine.getStatus();
            model.addRow(row);
        }
    }
    private void popMedicineTable(){
        DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();
        model.setRowCount(0);
        for (String str:medicineArr){
            Object[] row = new Object[2];
            row[0]=str.split(",")[0];
            row[1]=str.split(",")[1];
            model.addRow(row);
        }
    }
        
    private boolean checkDoctor(){
        boolean boo=true;
        for (WorkRequest_documentDoctor request : organization.getWorkQueue_documentDoctor().getWorkRequestList()){
            if(request.getAssignedDoctor()!=null){
                if(request.getAssignedDoctor().getEmployee().getName().equals(userAccount.getEmployee().getName())){
                    if(request.getStatus().equals("checking")){
                        boo=false;
                    }
                }
            }
        }
        return boo;
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
        workRequestJTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        assignbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        diagnosisArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        medicineTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        typefield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        amountfield = new javax.swing.JTextField();
        addmedicinebtn = new javax.swing.JButton();
        finishbtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        testTable = new javax.swing.JTable();
        sendbtn = new javax.swing.JButton();
        testingfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        patientbtn = new javax.swing.JButton();
        completebtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "patient", "gender", "age", "status", "date", "doctor", "note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1233, 144));

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Doctor");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 27, 73, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 31, 158, 26));

        assignbtn.setText("assign to me");
        assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbtnActionPerformed(evt);
            }
        });
        add(assignbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        diagnosisArea.setColumns(20);
        diagnosisArea.setRows(5);
        jScrollPane2.setViewportView(diagnosisArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 250, 130));

        jLabel7.setText("diagnosis");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, 20));

        medicineTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(medicineTable);
        if (medicineTable.getColumnModel().getColumnCount() > 0) {
            medicineTable.getColumnModel().getColumn(0).setResizable(false);
            medicineTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, 129));

        jLabel8.setText("type");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, -1, 20));
        add(typefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 214, -1));

        jLabel10.setText("amount");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 650, -1, 20));
        add(amountfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 650, 214, -1));

        addmedicinebtn.setText("add");
        addmedicinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmedicinebtnActionPerformed(evt);
            }
        });
        add(addmedicinebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 650, -1, -1));

        finishbtn.setText("finish");
        finishbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishbtnActionPerformed(evt);
            }
        });
        add(finishbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 690, 155, 50));

        testTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "testing type", "result", "date", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(testTable);
        if (testTable.getColumnModel().getColumnCount() > 0) {
            testTable.getColumnModel().getColumn(0).setResizable(false);
            testTable.getColumnModel().getColumn(1).setResizable(false);
            testTable.getColumnModel().getColumn(2).setResizable(false);
            testTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 516, 140));

        sendbtn.setText("send to quarantine organization");
        sendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnActionPerformed(evt);
            }
        });
        add(sendbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 310, -1));
        add(testingfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 207, -1));

        jLabel9.setText("testing type");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, 20));

        patientbtn.setText("patient detail");
        patientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientbtnActionPerformed(evt);
            }
        });
        add(patientbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        completebtn.setText("complete");
        completebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completebtnActionPerformed(evt);
            }
        });
        add(completebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void assignbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignbtnActionPerformed
        // TODO add your handling code here:
      if(checkDoctor()==false){
          JOptionPane.showMessageDialog(null, "you have one patient ot hand, please complete it");
          return;
      }
        int select=workRequestJTable.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "please select");
            return;
        }else{
            WorkRequest_documentDoctor request=(WorkRequest_documentDoctor) workRequestJTable.getValueAt(select, 0);
            if(request.getAssignedDoctor()==null){
                this.medicineArr=new ArrayList();
                finishbtn.setEnabled(true);
                request.setAssignedDoctor(userAccount);
                request.setStatus("checking");
                thispeople=request.getPeople();
                thisrequest=request;
                //populatePatientMedicalRecord(thispeople,thisrequest);
                populateRequestTable();
                popMedicineTable();
                popTestTable(thispeople);
                diagnosisArea.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "not allowed to see this patient");
                return;
            }
                    
        }
    
    }//GEN-LAST:event_assignbtnActionPerformed

    private void addmedicinebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmedicinebtnActionPerformed
        // TODO add your handling code here:
        String add="";
        String type=typefield.getText();
        String amount=amountfield.getText();
        if(type.equals("")||amount.equals("")){
            JOptionPane.showMessageDialog(null, "type or amount cannot be null");
            return;
        }
        add=add+type;
        add=add+","+amount;
        medicineArr.add(add);
        popMedicineTable();
        typefield.setText("");
        amountfield.setText("");
        
    }//GEN-LAST:event_addmedicinebtnActionPerformed

    private void finishbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishbtnActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        
        thisrequest.setStatus("finish");
        thisrequest.setDate(date);
        //add diagnosis, medicine record
        String doctorNote=diagnosisArea.getText();
        String medicine="";
        if(medicineArr.size()!=0){
            for(String str:medicineArr){
                medicine=medicine+" "+str;
            }
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String d=formatter.format(date);
        String doctorDiagnosis=d+"@"+doctorNote+"@"+medicine.trim();
        thispeople.getMedicalRecord().getDoctorNote().add(doctorDiagnosis);
        //System.out.println(doctorDiagnosis);
        populateRequestTable();
        medicineArr=new ArrayList();
        popMedicineTable();
        diagnosisArea.setText("");
        finishbtn.setEnabled(false);
    }//GEN-LAST:event_finishbtnActionPerformed

    private void sendbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtnActionPerformed
        // TODO add your handling code here:
        //send to Quarantine or;
//        this.quarantine_id++;
        Date date=new Date();
        String type=testingfield.getText();
        if(type.equals("")){
            JOptionPane.showMessageDialog(null, "please enter testing type");
            return;
        }else{
            WorkRequest_doctorQuarantine toQuarantine =new WorkRequest_doctorQuarantine();
            toQuarantine.setDate(date);
            toQuarantine.setDoctor(userAccount);
            toQuarantine.setStatus("pending");
            toQuarantine.setTestType(type);
            toQuarantine.setPatient(thispeople);
            toQuarantine.setId(++this.quarantine_id);
            QuarantineOrganization org=null;
            for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
                if(o instanceof QuarantineOrganization){
                    org=(QuarantineOrganization) o;
                    break;
                }
            }
            org.getWorkQueue_doctorQuarantine().getWorkRequestList().add(toQuarantine);
            thispeople.getQuarantineTesting().getWorkRequestList().add(toQuarantine);
            testingfield.setText("");
            popTestTable(thispeople);
            JOptionPane.showMessageDialog(null, "success");
        }
        
    }//GEN-LAST:event_sendbtnActionPerformed

    private void patientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientbtnActionPerformed
        // TODO add your handling code here:
        int select=workRequestJTable.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "please select");
            return;
        }else{
            WorkRequest_documentDoctor request=(WorkRequest_documentDoctor) workRequestJTable.getValueAt(select, 0);
            thispeople=request.getPeople();
            jpanel.add("about patient JPanel", new AboutPatientJPanel(jpanel,thispeople));
            System.out.println(thispeople.getMedicalRecord().getDoctorNote());
            CardLayout layout = (CardLayout) jpanel.getLayout();
            layout.next(jpanel);
        }
    }//GEN-LAST:event_patientbtnActionPerformed

    private void completebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completebtnActionPerformed
        // TODO add your handling code here:
        int select=workRequestJTable.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "please select");
            return;
        }else{
            WorkRequest_documentDoctor request=(WorkRequest_documentDoctor) workRequestJTable.getValueAt(select, 0);
            if(request.getAssignedDoctor().equals(userAccount)&&!request.getStatus().equals("finish")){
                this.medicineArr=new ArrayList();
                finishbtn.setEnabled(true);
                request.setAssignedDoctor(userAccount);
                request.setStatus("checking");
                thispeople=request.getPeople();
                thisrequest=request;
                //populateRequestTable();
                popMedicineTable();
                popTestTable(thispeople);
                diagnosisArea.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "cannot process to see this patient");
                return;
            }
        }
    }//GEN-LAST:event_completebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmedicinebtn;
    private javax.swing.JTextField amountfield;
    private javax.swing.JButton assignbtn;
    private javax.swing.JButton completebtn;
    private javax.swing.JTextArea diagnosisArea;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton finishbtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable medicineTable;
    private javax.swing.JButton patientbtn;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton sendbtn;
    private javax.swing.JTable testTable;
    private javax.swing.JTextField testingfield;
    private javax.swing.JTextField typefield;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
