/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.User;
import Business.User.Airliner;
import Business.User.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class AirlinerDirectory {
//Add flight, find and update flight, select and cancel
//flights
     List <Airliner> airlinerlist=new ArrayList<Airliner>();

    public List<Airliner> getAirlinerlist() {
        return airlinerlist;
    }

    public void setAirlinerlist(List<Airliner> airlinerlist) {
        this.airlinerlist = airlinerlist;
    }
   
   
    
    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
