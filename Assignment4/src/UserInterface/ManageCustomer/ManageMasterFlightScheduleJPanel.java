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
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
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
       
        System.out.println(flightDir.getFlightlist().get(0).getFromdate());
        System.out.println(flightDir.getFlightlist().get(0).getTodate());
        System.out.println(flightDir.getFlightlist().get(0).getFromtime());
        System.out.println(flightDir.getFlightlist().get(0).getTotime());
        System.out.println(flightDir.getFlightlist().get(0).getFrom());
        System.out.println(flightDir.getFlightlist().get(0).getTo());
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
        rbtnMorning = new javax.swing.JRadioButton();
        rbtnAfternoon = new javax.swing.JRadioButton();
        rbtnEvening = new javax.swing.JRadioButton();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFlightNum = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        rbtnAfternoon1 = new javax.swing.JRadioButton();
        rbtnEvening1 = new javax.swing.JRadioButton();
        rbtnMorning1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();

        jLabel2.setText("Departure:");

        jLabel3.setText("Destination:");

        jLabel4.setText("Depart Time:");

        txtDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDEActionPerformed(evt);
            }
        });

        rbtnMorning.setText("Morning");
        rbtnMorning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMorningActionPerformed(evt);
            }
        });

        rbtnAfternoon.setText("Afternoon");
        rbtnAfternoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAfternoonActionPerformed(evt);
            }
        });

        rbtnEvening.setText("Evening");
        rbtnEvening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEveningActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Flight Number:");

        btnback.setText("back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        rbtnAfternoon1.setText("Afternoon");
        rbtnAfternoon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAfternoon1ActionPerformed(evt);
            }
        });

        rbtnEvening1.setText("Evening");
        rbtnEvening1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEvening1ActionPerformed(evt);
            }
        });

        rbtnMorning1.setText("Morning");
        rbtnMorning1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMorning1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Arrive Time");

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFlightNum)
                    .addComponent(txtDP)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnMorning1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnAfternoon1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnEvening1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnMorning)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnAfternoon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnEvening))
                            .addComponent(txtDE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnback)
                .addGap(246, 246, 246)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbtnMorning)
                    .addComponent(rbtnAfternoon)
                    .addComponent(rbtnEvening)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnMorning1)
                            .addComponent(rbtnAfternoon1)
                            .addComponent(rbtnEvening1)
                            .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btnSearch))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_DatePickerActionPerformed

    private void rbtnEveningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEveningActionPerformed
        // TODO add your handling code here:
       
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
           if(rbtnEvening1.isSelected()){
         for(Flight flight:flightDir.getFlightlist()){
               if(
                  flight.getFrom().equals(txtDP.getText())&&
                  flight.getTo().equals(txtDE.getText())&&
                 flight.getFromdate().equals(formatter.format(jXDatePicker1.getDate()))==true&&
                 flight.getTodate().equals(formatter.format(jXDatePicker2.getDate()))==true&&flight.getFromtime().isAfter(timesec3)){
if(!flightl.contains(flight)){
            flightl.add(flight);
                 
               }}}}
    }//GEN-LAST:event_rbtnEveningActionPerformed

    private void txtDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDEActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
    
      
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
           if(txtFlightNum.getText()!=null){
        for(Flight flight:flightDir.getFlightlist()){ 
           if(flight.getFlightnumber().equals(txtFlightNum.getText())){
               if(!flightl.contains(flight)){
             flightl.add(flight);
                           }
               
         FlightsfoundJPanel panel=new FlightsfoundJPanel(rightPanel,flightl,cusDir, airlinerDir,flight);
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
                  flight.getFromdate().equals(formatter.format(jXDatePicker1.getDate()))&&
                 flight.getTodate().equals(formatter.format(jXDatePicker2.getDate()))){
               
                    if(
                    rbtnMorning.isSelected()==false&&
                    rbtnMorning1.isSelected()==false
                   &&rbtnAfternoon.isSelected()==false&&rbtnAfternoon1.isSelected()==false&&rbtnEvening.isSelected()==false&&
                    rbtnEvening1.isSelected()==false){
    
               if(!flightl.contains(flight)){
                    flightl.add(flight);
                    rightPanel.add(new FlightsfoundJPanel(rightPanel,flightl,cusDir,airlinerDir,flight));
                    CardLayout layout=(CardLayout)rightPanel.getLayout();
                    layout.next(rightPanel);
               }}
                    else if(rbtnMorning.isSelected()==true||
                    rbtnMorning1.isSelected()==true||
                   rbtnAfternoon.isSelected()==true||rbtnAfternoon1.isSelected()==true||rbtnEvening.isSelected()==true||
                    rbtnEvening1.isSelected()==true){
                    rightPanel.add(new FlightsfoundJPanel(rightPanel,flightl,cusDir,airlinerDir,flight));
                    CardLayout layout=(CardLayout)rightPanel.getLayout();
                    layout.next(rightPanel);
                    }
            
           
       }
                  
              }
//&&flight.getFromdate().equals(DatePicker1.getDate())&&flight.getTodate().equals(DatePicker2.getDate())){
            // if(rbtnEvening.isSelected()){
         if(txtFlightNum.getText()==null){
             if(txtDP.getText()==null||
                 txtDE.getText()==null||jXDatePicker1.getDate()==null||
                jXDatePicker2.getDate()==null)
         {JOptionPane.showMessageDialog(null, "imcomplete insert");
         System.out.println(txtFlightNum.getText());}}
     
                
           
            
            
          
            
    /*   FlightsfoundJPanel panel=new FlightsfoundJPanel(rightPanel,flightl, cusDir);
          rightPanel.add("firstfoundJPanel", panel);
          CardLayout layout=(CardLayout)rightPanel.getLayout();
          layout.next(rightPanel);*/

           
       
          
         
        
      
       
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnbackActionPerformed

    private void rbtnEvening1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEvening1ActionPerformed
        // TODO add your handling code here:
     
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
           if(rbtnEvening.isSelected()){
         for(Flight flight:flightDir.getFlightlist()){
              
               if(
                  flight.getFrom().equals(txtDP.getText())&&
                  flight.getTo().equals(txtDE.getText())&&
                  flight.getFromdate().equals(formatter.format(jXDatePicker2.getDate()))==true&&
                  flight.getTodate().equals(formatter.format(jXDatePicker1.getDate()))==true&&flight.getTotime().isAfter(timesec3)){
if(!flightl.contains(flight)){
            flightl.add(flight);
            
}     

               }
        }}
         
    }//GEN-LAST:event_rbtnEvening1ActionPerformed

    private void rbtnAfternoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAfternoonActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
      try{
//          System.out.println(flightDir.getFlightlist().get(0).getFrom().equals(txtDP.getText())?true:false);
//          System.out.println(flightDir.getFlightlist().get(0).getFromdate().equals(formatter.format(jXDatePicker1.getDate()))?true:false);
//          System.out.println( flightDir.getFlightlist().get(0).getFromtime().isBefore(timesec2)?true:false);
          System.out.println(
                  flightDir.getFlightlist().get(0).getFrom().equals(txtDP.getText())&&
                    flightDir.getFlightlist().get(0).getTo().equals(txtDE.getText())
                    &&flightDir.getFlightlist().get(0).getFromdate().equals(formatter.format(jXDatePicker1.getDate()))&&
                    flightDir.getFlightlist().get(0).getTodate().equals(formatter.format(jXDatePicker2.getDate()))&&
                    flightDir.getFlightlist().get(0).getFromtime().isAfter(timesec2)&&
                    flightDir.getFlightlist().get(0).getFromtime().isBefore(timesec3)?true:false);
         if(rbtnAfternoon.isSelected()){
         for(Flight flight:flightDir.getFlightlist()){
             
               if(
                  flight.getFrom().equals(txtDP.getText())&&
                  flight.getTo().equals(txtDE.getText())&&
                  flight.getFromdate().equals(formatter.format(jXDatePicker1.getDate()))&&
                  flight.getTodate().equals(formatter.format( jXDatePicker2.getDate()))&&flight.getFromtime().isAfter(timesec2)&&flight.getFromtime().isBefore(timesec3)){
if(!flightl.contains(flight)&&flight!=null){
            flightl.add(flight);}

            
        }}}
      }
         
          catch(Exception e){
      System.out.println("exception");
      }
    }//GEN-LAST:event_rbtnAfternoonActionPerformed

    private void rbtnAfternoon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAfternoon1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
      try{
          System.out.println(timesec2.toString());
        if(rbtnAfternoon1.isSelected()){
         for(Flight flight:flightDir.getFlightlist()){
              
               if(
                  flight.getFrom().equals(txtDP.getText())&&
                  flight.getTo().equals(txtDE.getText())&&
                  flight.getFromdate().equals(formatter.format(jXDatePicker1.getDate()))==true&&
                  flight.getTodate().equals(formatter.format( jXDatePicker2.getDate()))==true&&flight.getTotime().isAfter(timesec2)&&flight.getTotime().isBefore(timesec3)){
            if(!flightl.contains(flight)){
                   flightl.add(flight);
        }
               }}}}
      catch(Exception e){
      System.out.println("exception");
      }
    }//GEN-LAST:event_rbtnAfternoon1ActionPerformed

    private void rbtnMorningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMorningActionPerformed
        // TODO add your handling code here:
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
      
         if(rbtnMorning.isSelected()){
                   System.out.println("selected");
         for(Flight flight:flightDir.getFlightlist()){
               if(
                 flight.getFrom().equals(txtDP.getText())&&
                  flight.getTo().equals(txtDE.getText())&&
                 flight.getFromdate().equals(formatter.format( jXDatePicker1.getDate()))==true&&
                 flight.getTodate().equals(formatter.format( jXDatePicker2.getDate()))==true&&
                       flight.getFromtime().isAfter(timesec1)&&
                       flight.getFromtime().isBefore(timesec2)){
            if(!flightl.contains(flight)){
            flightl.add(flight);
            
        }
             }}}
    }//GEN-LAST:event_rbtnMorningActionPerformed

    private void rbtnMorning1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMorning1ActionPerformed
        // TODO add your handling code here:
          
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
        if(rbtnMorning.isSelected()){
         for(Flight flight:flightDir.getFlightlist()){
              
               if(
                  flight.getFrom().equals(txtDP.getText())&&
                  flight.getTo().equals(txtDE.getText())&&
                  flight.getFromdate().equals(formatter.format( jXDatePicker1.getDate()))==true&&
                  flight.getTodate().equals(formatter.format( jXDatePicker2.getDate()))==true&&
                       flight.getTotime().isBefore(timesec2)&&
                       flight.getTotime().isAfter(timesec1)){
         if(!flightl.contains(flight)){
            flightl.add(flight);}
               }}}
    }//GEN-LAST:event_rbtnMorning1ActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
       
                       
         
         
    }//GEN-LAST:event_jXDatePicker1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JRadioButton rbtnAfternoon;
    private javax.swing.JRadioButton rbtnAfternoon1;
    private javax.swing.JRadioButton rbtnEvening;
    private javax.swing.JRadioButton rbtnEvening1;
    private javax.swing.JRadioButton rbtnMorning;
    private javax.swing.JRadioButton rbtnMorning1;
    private javax.swing.JTextField txtDE;
    private javax.swing.JTextField txtDP;
    private javax.swing.JTextField txtFlightNum;
    // End of variables declaration//GEN-END:variables
}
