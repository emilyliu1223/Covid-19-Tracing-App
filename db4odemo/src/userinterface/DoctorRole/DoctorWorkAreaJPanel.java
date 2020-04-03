/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.LabTest_documentDoctor;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequest_documentDoctor;
import People.People;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
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
        operationfield.setEditable(false);
        pastfield.setEditable(false);
        familyfield.setEditable(false);
        chronicfield.setEditable(false);
        allergyfield.setEditable(false);
        notefield.setEditable(false);
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

    public void popDiagonsisTable(ArrayList<String> arr){
        DefaultTableModel model = (DefaultTableModel) diagnosistable.getModel();
        model.setRowCount(0);
        for(String str:arr){
            Object[] row = new Object[3];
            row[0]=str.split("@")[0];
            row[1]=str.split("@")[1];
            row[2]=str.split("@")[2];
            System.out.println("in table:"+row[0]+row[1]+row[2]);
            model.addRow(row);
        }
    }
    public void populatePatientMedicalRecord(People people,WorkRequest_documentDoctor request){
        operationfield.setText(convertArrayToString(people.getMedicalRecord().getOperation_history()));
        pastfield.setText(convertArrayToString(people.getMedicalRecord().getPast_history()));
        familyfield.setText(convertArrayToString(people.getMedicalRecord().getFamily_history()));
        chronicfield.setText(convertArrayToString(people.getMedicalRecord().getChronicDisease()));
        allergyfield.setText(convertArrayToString(people.getMedicalRecord().getMedicineAllergy()));
        notefield.setText(((LabTest_documentDoctor)request).getMessage());
        popDiagonsisTable(request.getPeople().getMedicalRecord().getDoctorNote());
        //System.out.println(request.getPeople().getMedicalRecord().getDoctorNote());
        
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
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        assignbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        operationfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pastfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        familyfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        chronicfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        allergyfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        notefield = new javax.swing.JTextField();
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
        jScrollPane6 = new javax.swing.JScrollPane();
        diagnosistable = new javax.swing.JTable();
        detailbtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "patient", "gender", "age", "status", "request date", "doctor", "note"
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

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Doctor");

        valueLabel.setText("<value>");

        assignbtn.setText("assign to me");
        assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("operation history");

        jLabel2.setText("past history");

        jLabel3.setText("family history");

        jLabel4.setText("chronic disease");

        jLabel5.setText("msdicine allergy");

        jLabel6.setText("note");

        diagnosisArea.setColumns(20);
        diagnosisArea.setRows(5);
        jScrollPane2.setViewportView(diagnosisArea);

        jLabel7.setText("diagnosis");

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

        jLabel8.setText("type");

        jLabel10.setText("amount");

        addmedicinebtn.setText("add");
        addmedicinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmedicinebtnActionPerformed(evt);
            }
        });

        finishbtn.setText("finish");
        finishbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishbtnActionPerformed(evt);
            }
        });

        diagnosistable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "date", "diagnosis", "medicine"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(diagnosistable);
        if (diagnosistable.getColumnModel().getColumnCount() > 0) {
            diagnosistable.getColumnModel().getColumn(0).setResizable(false);
            diagnosistable.getColumnModel().getColumn(1).setResizable(false);
            diagnosistable.getColumnModel().getColumn(2).setResizable(false);
        }

        detailbtn.setText("detail");
        detailbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(requestTestJButton)))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(assignbtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(detailbtn)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(63, 63, 63)
                                        .addComponent(pastfield, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(63, 63, 63)
                                        .addComponent(operationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(63, 63, 63)
                                        .addComponent(familyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(allergyfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chronicfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(notefield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(388, 388, 388)
                                .addComponent(finishbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(225, 225, 225)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(46, 46, 46)
                                                .addComponent(amountfield, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(46, 46, 46)
                                                .addComponent(typefield, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addmedicinebtn))))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshTestJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(requestTestJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignbtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(operationfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pastfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(familyfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chronicfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allergyfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(notefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(typefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(amountfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addmedicinebtn))))
                .addGap(18, 18, 18)
                .addComponent(finishbtn)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        CardLayout layout = (CardLayout) jpanel.getLayout();
        jpanel.add("RequestLabTestJPanel", new RequestLabTestJPanel(jpanel, userAccount, enterprise));
        layout.next(jpanel);
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

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
                
                populatePatientMedicalRecord(thispeople,request);
                populateRequestTable();
                popMedicineTable();
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

    private void detailbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailbtnActionPerformed
        // TODO add your handling code here:
        int select=diagnosistable.getSelectedRow();
        if(select<0){
            JOptionPane.showConfirmDialog(null, "please select");
            return;
        }else{
            String date=(String)diagnosistable.getValueAt(select, 0);
            String detail=(String)diagnosistable.getValueAt(select, 1);
            String medicine=(String)diagnosistable.getValueAt(select, 2);
            //System.out.println(detail+",medicine:"+medicine);
            CardLayout layout=(CardLayout)jpanel.getLayout();
            jpanel.add("patient detail",new PatientDetailJPanel(jpanel,date,detail,medicine));
            layout.next(jpanel);
        }
    }//GEN-LAST:event_detailbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmedicinebtn;
    private javax.swing.JTextField allergyfield;
    private javax.swing.JTextField amountfield;
    private javax.swing.JButton assignbtn;
    private javax.swing.JTextField chronicfield;
    private javax.swing.JButton detailbtn;
    private javax.swing.JTextArea diagnosisArea;
    private javax.swing.JTable diagnosistable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTextField familyfield;
    private javax.swing.JButton finishbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable medicineTable;
    private javax.swing.JTextField notefield;
    private javax.swing.JTextField operationfield;
    private javax.swing.JTextField pastfield;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField typefield;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
