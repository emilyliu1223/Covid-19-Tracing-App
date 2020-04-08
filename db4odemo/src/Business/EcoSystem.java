/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import MedicineCatelog.MedicineDirectory;
import People.PeopleDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private PeopleDirectory peopleDirectory;
    private MedicineDirectory medicineDir;
    private ArrayList<Network> networkList;
    private CountSymptoms countSymtoms;
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        peopleDirectory=new PeopleDirectory();
        medicineDir=new MedicineDirectory();
        countSymtoms=new CountSymptoms();
    }

    public CountSymptoms getCountSymtoms() {
        return countSymtoms;
    }

    public void setCountSymtoms(CountSymptoms countSymtoms) {
        this.countSymtoms = countSymtoms;
    }

    
    public MedicineDirectory getMedicineDir() {
        return medicineDir;
    }

    public void setMedicineDir(MedicineDirectory medicineDir) {
        this.medicineDir = medicineDir;
    }

    
    public PeopleDirectory getPeopleDirectory() {
        return peopleDirectory;
    }
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
