/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.User.Airliner;
import Business.User.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class FlightDirectory {
     private List<Flight>flightlist;
      private List<Customer> IDlist;
    private AirlinerDirectory airlinerlist;
   public FlightDirectory(){
       flightlist = new ArrayList<Flight>();
    }

    public List<Flight> getFlightlist() {
        return flightlist;
    }

    public void setFlightlist(List<Flight> flightlist) {
        this.flightlist = flightlist;
    }
    public Flight addflight(){
        Flight flight=new Flight();
        flightlist.add(flight);
        return flight;
    }
    public void removeflight(Flight flight){
     flightlist.remove(flight);
    }
//    public List<Flight> getflightbyAirliner(String airliner1){
//        airlinerlist = new AirlinerDirectory();
//        List <Flight> flightAir=new ArrayList<Flight>();
//        
//        for(Airliner airliner:airlinerlist.getAirlinerlist()){
//            if(airliner.getName().toLowerCase().equals(airliner1.toLowerCase())){
//                for(Flight flight:this.flightlist){
//                if(flight.getAirliner().toLowerCase().equals(airliner1.toLowerCase())){
//                    flightAir.add(flight);
//                }
//            }
//        }
//    }return flightAir;
//   }
    
       public List<Flight> getFlightsforCustomer(Customer ID){
         List <Flight> flightlist1=new ArrayList<Flight>();
         for(Flight flight:flightlist){
         if(flight.getID().equals(ID.getID())){
             flightlist1.add(flight);
         }
         
         }
         return flightlist1;
    
    }
     
   
   
   
}
