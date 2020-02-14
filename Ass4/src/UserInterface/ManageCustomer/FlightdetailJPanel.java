/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomer;

import Business.CustomerDirectory;
import Business.Flight;
import Business.FlightDirectory;
import Business.User.Customer;
//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
//import org.jdesktop.swingx.decorator.HighlightPredicate;

/**
 *
 * @author user
 */
public class FlightdetailJPanel extends javax.swing.JPanel  {

    /**
     * Creates new form FlightdetailJPanel
     */
    private JPanel rightPanel;
    private FlightDirectory flightDir;
    private List<Customer> cuslist;
    private CustomerDirectory cusDir;
    private String selecteElement;
    private Customer customer;
    private Flight flight;
    public DefaultTableCellRenderer DEFAULT_RENDERER ;
    FlightdetailJPanel(JPanel rightPanel, List<Customer> cuslist, CustomerDirectory cusDir,FlightDirectory flightDir, Flight flight) {
         //To change body of generated methods, choose Tools | Templates.
         initComponents();
         this.rightPanel=rightPanel;
         this.flight=flight;
         this.flightDir=flightDir;
         this.cuslist=cuslist;
         this.cusDir=cusDir;
         
         populate();
        
         
    }
    
     public void populate(){
        
        DefaultTableModel dtm = (DefaultTableModel)tableSeats.getModel();
        dtm.setRowCount(0);

    //check time and date format
    //use airliner name to find all dlight 

       for(int i=0;i<26;i++){
           //System.out.println("enter populate flight table//airliner name:"+airliner);
                
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]="A"+(i+1);
            row[1]="B"+(i+1);
            row[2]="C"+(i+1);
            row[3]="D"+(i+1);
            row[4]="E"+(i+1);
            row[5]="F"+(i+1);
          
            dtm.addRow(row);
       }
          

            
        
    
   
     
     
  
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
        tableSeats = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnBook = new javax.swing.JButton();

        tableSeats.setBackground(new java.awt.Color(204, 255, 204));
        tableSeats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Window", "Middle", "Aisle", "Aisle", "Middle", "Window"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSeats.setRowSelectionAllowed(false);
        tableSeats.setSelectionBackground(new java.awt.Color(255, 0, 0));
        tableSeats.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSeats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSeatsMouseClicked(evt);
            }
        });
        tableSeats.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableSeatsComponentShown(evt);
            }
        });
        tableSeats.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tableSeatsPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tableSeats);

        jLabel1.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("Age");

        jLabel4.setText("Nationality");

        txtNation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNationActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        jLabel6.setText("Address");

        btnBook.setText("Confirm booking");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(txtID))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(txtNation))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addGap(215, 215, 215))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtNation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBook)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableSeatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSeatsMouseClicked
        // TODO add your handling code here:
         //tableSeats.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
                txtName.setText("");
                 txtNation.setText("");
                txtAddress.setText("");
                txtID.setText("");
                txtAge.setText("");
                txtPhone.setText("");
                  txtName.setEditable(true);
                txtNation.setEditable(true);
                   txtAddress.setEditable(true);
                    txtID.setEditable(true);
                      txtAge.setEditable(true);
                   txtPhone.setEditable(true);
             // Component[]put=new Component[tableSeats.getSelectedRowCount()*tableSeats.getSelectedColumnCount()];
           
          //    Component c = Tcr.getTableCellRendererComponent(tableSeats, tableSeats.getValueAt(i, j), false, false, i, j);           
      int row = tableSeats.getSelectedRow();
      int column = tableSeats.getSelectedColumn();
        Object target= (Object) tableSeats.getValueAt(row, column);
           // TableCellRenderer Tcr = tableSeats.getCellRenderer(row, column);
           //           Component c = Tcr.getTableCellRendererComponent(tableSeats, tableSeats.getValueAt(row, column), false, false,row, column);
             //         c.setBackground(Color.yellow);
        
       // TableCellRenderer Tcr = tableSeats.getCellRenderer(row, column);
         //Component c = Tcr.getTableCellRendererComponent(tableSeats, tableSeats.getValueAt(row, column), false, false, row, column);
        for(Customer customer:cuslist){
        if(customer.getSeat().equals(target)){ 
                txtName.setText(customer.getName());
                txtNation.setText(customer.getNationality());
                txtAddress.setText(customer.getAddress());
                txtID.setText(customer.getID());
                txtAge.setText(String.valueOf(customer.getAge()));
                txtPhone.setText(customer.getPhone());
                
                txtName.setEditable(false);
                txtNation.setEditable(false);
                   txtAddress.setEditable(false);
                    txtID.setEditable(false);
                      txtAge.setEditable(false);
                   txtPhone.setEditable(false);
        }
        else if(!customer.getSeat().equals(target)){
        selecteElement=(String)target;
        }

       }
        
               
    }//GEN-LAST:event_tableSeatsMouseClicked

    private void txtNationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNationActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void tableSeatsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tableSeatsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tableSeatsPropertyChange

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
       
        customer=new Customer(txtName.getText(),txtNation.getText(),Integer.parseInt(txtAge.getText()),txtAddress.getText(),txtPhone.getText());
        customer.setSeat(selecteElement);
       customer.setFlightnumber(cuslist.get(0).getFlightnumber());
       customer.setID(txtID.getText());
        cuslist.add(customer);
        cusDir.getCustomerlist().add(customer);
        flight.getID().add(txtID.getText());
        
       System.out.println(cusDir.getCustomerlist());
        System.out.println(cuslist);
        
       
        JOptionPane.showMessageDialog(null, "Add success");
         rightPanel.add(new ConfirmationJPanel(rightPanel,customer));
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnBookActionPerformed

    private void tableSeatsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableSeatsComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tableSeatsComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSeats;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNation;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
