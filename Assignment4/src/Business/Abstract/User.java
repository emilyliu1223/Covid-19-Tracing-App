/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Abstract;

/**
 *
 * @author user
 */
public class User {
    public String name;

    public String nationality;
    public int age;
    public String address;
    public String phone;

    public User(String name, String nationality, int age, String address, String phone){
        this.name=name;
        this.nationality=nationality; 
        this.age=age;
        this.address=address;
        this.phone=phone;
          
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     *
     * @param name
     * @param nationality
     */ 
 
   
 

   

    

    
    
     
   
    
    
}
