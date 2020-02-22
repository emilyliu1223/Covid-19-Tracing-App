/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomer;

import Business.AirlinerDirectory;
import Business.CustomerDirectory;
import Business.Flight;
import Business.FlightDirectory;
import UserInterface.ManageAirliner.ManageAirlinersJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ManageMasterFlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMasterFlightScheduleJPanel
     */
    private JPanel rightPanel;
    private FlightDirectory flightDir;
    private LocalTime timesec1;
     private LocalTime timesec2;
      private LocalTime timesec3;
      private List<Flight>flightl;
   private CustomerDirectory cusDir;
   private AirlinerDirectory airlinerDir;
   private SimpleDateFormat formatter;
   
    public ManageMasterFlightScheduleJPanel(JPanel rightPanel, FlightDirectory flightDir,CustomerDirectory cusDir, AirlinerDirectory airlinerDir) {
        //To change body of generated methods, choose Tools | Templates.
        initComponents();
        flightl=new ArrayList<Flight>();
        this.airlinerDir=airlinerDir;
        this.flightDir=flightDir;
        this.rightPanel=rightPanel;
        this.cusDir=cusDir;
         timesec1=LocalTime.of(06, 0, 0);
        timesec2=LocalTime.of(12, 0, 0);
        timesec3=LocalTime.of(18, 0, 0);
        
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDP = new javax.swing.JTextField();
        txtDE = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFlightNum = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel2.setText("Departure:");

        jLabel3.setText("Destination:");

        jLabel4.setText("Depart Time:");

        txtDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDEActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Flight Number:");

        btnback.setText("<<back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFlightNum, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(312, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnback)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addComponent(btnSearch)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_DatePickerActionPerformed

    private void txtDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDEActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
    try{
    if(txtFlightNum.getText().equals("")){
             if(txtDP.getText().equals("")||
                 txtDE.getText().equals("")||
                 jDateChooser1.getDate()==null
                )
         {
             JOptionPane.showMessageDialog(null, "imcomplete insert");
             return;
        
         }}}catch(Exception e){
             JOptionPane.showMessageDialog(null, "please insert destination, departure and date");
             return;
         }
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
           if(!txtFlightNum.getText().equals("")){
        for(Flight flight:flightDir.getFlightlist()){ 
           if(flight.getFlightnumber().equals(txtFlightNum.getText())){
               if(!flightl.contains(flight)){
             flightl.add(flight);
                           }
                FlightsfoundJPanel panel;              
                   panel = new FlightsfoundJPanel(rightPanel,flightDir,flightl,cusDir, airlinerDir);
                   rightPanel.add("firstfoundJPanel", panel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
           }
           }
       
           }
         
                 for(Flight flight:flightDir.getFlightlist()){     
              
            if(
                flight.getFrom().equals(txtDP.getText())&&
                  flight.getTo().equals(txtDE.getText())&&
                  flight.getFromdate().equals(formatter.format(jDateChooser1.getDate()))&&
               !flightl.contains(flight)){
                    flightl.add(flight);
               }}

            
                 
                  if(!flightl.isEmpty()){
                         FlightsfoundJPanel panel;
                       panel = new FlightsfoundJPanel(rightPanel,flightDir,flightl,cusDir, airlinerDir);
                        rightPanel.add("firstfoundJPanel", panel);
                 CardLayout layout=(CardLayout)rightPanel.getLayout();
                 layout.next(rightPanel);  
                  
                   } 
                  else{
                  JOptionPane.showMessageDialog(null, "no flight found");
                  return ;
                  }
                   
 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        rightPanel.removeAll();
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnbackActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
       
                       
         
         
    }//GEN-LAST:event_jXDatePicker1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnback;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDE;
    private javax.swing.JTextField txtDP;
    private javax.swing.JTextField txtFlightNum;
    // End of variables declaration//GEN-END:variables
}
