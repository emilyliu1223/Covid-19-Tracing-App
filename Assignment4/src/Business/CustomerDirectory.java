/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.User.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CustomerDirectory {
    List <Customer> customerlist=new ArrayList<Customer>();
   
    public CustomerDirectory(){
    }
    public List<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(List<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    public List<Customer> getCostumerinFlight(String flight){
         List<Customer> customerlist1=new ArrayList<Customer>();
    
        for(Customer customer:customerlist){
        if(customer.getFlightnumber().equals(flight)){   
            customerlist1.add(customer);
        }
    } return customerlist1;
    }
    
   public void removeCustomer(Customer customer){
        customerlist.remove(customer);
    }
}
