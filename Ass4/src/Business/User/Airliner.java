/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Abstract.User;
import Business.FlightDirectory;
 
/**
 *
 * @author user
 */
public class Airliner extends User{
    public FlightDirectory flightDir;
    
     
    public Airliner(String name, String nationality, int age, String address, String phone){
    super(name,nationality,age,address,phone);}

    @Override
    public String toString(){
        return this.getName();
    }
    
}
