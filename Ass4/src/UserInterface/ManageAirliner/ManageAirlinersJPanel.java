/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliner;

import Business.AirlinerDirectory;
import Business.Flight;
import Business.FlightDirectory;
import Business.User.Airliner;
import UserInterface.ManageFlight.ManageAirlinerFlightScheduleJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ManageAirlinersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersJPanel
     */
    public AirlinerDirectory airlinerDir;
    private JPanel rightPanel;
    private Flight flight;
    private FlightDirectory flightDir;
    private String searchAirliner;
    private Airliner airliner;
    //private FlightDirectory flightDirectory;
    public ManageAirlinersJPanel(JPanel rightPanel,AirlinerDirectory airlinerDir,FlightDirectory flightDir) {
        initComponents();
        this.airlinerDir=airlinerDir;
        this.rightPanel=rightPanel;
        this.flightDir=flightDir;
        //airlinerDir = new AirlinerDirectory();
        
         populateTable(airlinerDir);
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
   
     */
    public void populateTable(AirlinerDirectory airlinerDirectory){
        DefaultTableModel dtm = (DefaultTableModel)tableAirliner.getModel();
        dtm.setRowCount(0);
        
        for(Airliner airliner:airlinerDir.getAirlinerlist()){
            Object row[] = new Object[10];
            row[0]=airliner.getName();
            row[1]=airliner.getAddress();
            row[2]=airliner.getNationality();
            row[3]=airliner.getAge();
            dtm.addRow(row);}}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNewAir = new javax.swing.JButton();
        btnSearchAir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGetFlight = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAirliner = new javax.swing.JTable();
        txtSearchAir = new javax.swing.JTextField();
        airlinerdetail = new javax.swing.JButton();

        btnNewAir.setText("New Airliner");
        btnNewAir.setPreferredSize(new java.awt.Dimension(130, 30));
        btnNewAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAirActionPerformed(evt);
            }
        });

        btnSearchAir.setText("Search");
        btnSearchAir.setPreferredSize(new java.awt.Dimension(130, 30));
        btnSearchAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAirActionPerformed(evt);
            }
        });

        jLabel1.setText("Airliners");

        jLabel2.setText("search Airliner:");

        btnGetFlight.setText("Get Flight");
        btnGetFlight.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGetFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetFlightActionPerformed(evt);
            }
        });

        tableAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Nationality", "Age"
            }
        ));
        jScrollPane1.setViewportView(tableAirliner);

        airlinerdetail.setText("details");
        airlinerdetail.setPreferredSize(new java.awt.Dimension(130, 30));
        airlinerdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerdetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnNewAir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSearchAir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(61, 61, 61)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSearchAir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(airlinerdetail, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGetFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGetFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchAir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchAir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(airlinerdetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewAir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAirActionPerformed
        // TODO add your handling code here:
        //flightDir = new FlightDirectory();
        boolean b=false;
        searchAirliner = txtSearchAir.getText();
        //airlinerDir = new AirlinerDirectory();
        if(searchAirliner.equals("")){
            JOptionPane.showMessageDialog(null, "please enter airliner name.");
            txtSearchAir.setText("");
            return;
        }
        else if(!searchAirliner.equals("")){
            System.out.println("error test for search 1, input:"+searchAirliner);
                for(Airliner airliner: airlinerDir.getAirlinerlist()){
                    if(airliner.toString().toLowerCase().equals(searchAirliner.toLowerCase())){
                        b=true;break;
                    }else{
                        b=false;continue;
                    }
                }
                if(b==true){
                    System.out.println("error test for search 2->airline found:");
                        rightPanel.add(new ManageAirlinerFlightScheduleJPanel(rightPanel,searchAirliner,flightDir));
                        CardLayout layout = (CardLayout)rightPanel.getLayout();
                        layout.next(rightPanel);
                }else{
                    System.out.println("error test for search 3->not found");
                        rightPanel.add(new CreateNewAirlinerJPanel(rightPanel,airlinerDir));
                        CardLayout layout = (CardLayout)rightPanel.getLayout();
                        layout.next(rightPanel);
                }
                        
        }
        
    }//GEN-LAST:event_btnSearchAirActionPerformed

    private void btnGetFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetFlightActionPerformed
        // TODO add your handling code here:
        int select = tableAirliner.getSelectedRow();
        System.out.println("select row:"+select);
        if(select<0){
            JOptionPane.showMessageDialog(null, "must select a row","Warning", JOptionPane.WARNING_MESSAGE);
        }else{
           String findAirliner = (String)tableAirliner.getValueAt(select, 0);
            //System.out.println(findAirliner);
            rightPanel.add("ManageAirlinerFlightScheduleJPanel",new ManageAirlinerFlightScheduleJPanel(rightPanel,findAirliner,flightDir));
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
            System.out.println("success find");
        }
       
    }//GEN-LAST:event_btnGetFlightActionPerformed

    private void btnNewAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAirActionPerformed
        // TODO add your handling code here:
            rightPanel.add("CreateNewAirlinerJPanel",new CreateNewAirlinerJPanel(rightPanel,airlinerDir));
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
    }//GEN-LAST:event_btnNewAirActionPerformed

    private void airlinerdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerdetailActionPerformed
        // TODO add your handling code here:
        
        int select = tableAirliner.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "must select a row","Warning", JOptionPane.WARNING_MESSAGE);
        }else{
           String airliner_str = (String)tableAirliner.getValueAt(select, 0);
           for(Airliner air:airlinerDir.getAirlinerlist()){
               if(air.getName().equals(airliner_str)){
                   this.airliner=air;
               }
           }
           rightPanel.add("AirlinerDetailJPanel", new AirlinerDetailJPanel(rightPanel,airlinerDir,airliner));
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
        
    }//GEN-LAST:event_airlinerdetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton airlinerdetail;
    private javax.swing.JButton btnGetFlight;
    private javax.swing.JButton btnNewAir;
    private javax.swing.JButton btnSearchAir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAirliner;
    private javax.swing.JTextField txtSearchAir;
    // End of variables declaration//GEN-END:variables
}
