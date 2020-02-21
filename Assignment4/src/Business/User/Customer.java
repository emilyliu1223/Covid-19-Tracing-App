/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Abstract.User;
import Business.FlightDirectory;
import java.util.List;
/**
 *
 * @author user
 */
public class Customer extends User{
    public FlightDirectory flightDir;
    public String ID;
    public String seat;
    public String flightnumber;
    public Customer(String name, String nationality, int age, String address, String phone){
        super(name,nationality,age,address,phone);
    }
    
    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

     public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
    public FlightDirectory getFlightDir() {
        return flightDir;
    }

    public void setFlightDir(FlightDirectory flightDir) {
        this.flightDir = flightDir;
    }
@Override
    public String toString(){
        return this.getName();
    }
  
    
}
