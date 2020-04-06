package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.DocumentOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Organization.QuarantineOrganization;
import Business.Role.AdminRole;
import Business.Role.DoctorRole;
import Business.Role.DocumentRole;
import Business.Role.PharmacyRole;
import Business.Role.QuarantineRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import People.MedicalRecord;
import People.People;
import java.util.ArrayList;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        Network createNetwork=new Network();
        createNetwork.setName("Massachusetts");
        system.getNetworkList().add(createNetwork);
        //create an enterprise
        Enterprise e1=createNetwork.getEnterpriseDirectory().createAndAddEnterprise("Fenway Health", Enterprise.EnterpriseType.Hospital);
        Enterprise e2=createNetwork.getEnterpriseDirectory().createAndAddEnterprise("CDC-boston branch", Enterprise.EnterpriseType.CDC);
        Enterprise e3=createNetwork.getEnterpriseDirectory().createAndAddEnterprise("Boston PD", Enterprise.EnterpriseType.Police);

        //create employee & user account for hospital enterprise-fenway health
        Employee em1=e1.getEmployeeDirectory().createEmployee("fenway health");
        e1.getUserAccountDirectory().createUserAccount("fenwayhealth", "fenwayhealth", em1, new AdminRole());
        DocumentOrganization o_document=null;
        DoctorOrganization o_doctor=null;
        PharmacyOrganization o_pharmacy=null;
        QuarantineOrganization o_quarantine=null;
        for(Organization org:e1.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof DocumentOrganization){
                o_document=(DocumentOrganization)org;
            }else if(org instanceof DoctorOrganization){
                o_doctor=(DoctorOrganization)org;
            }else if(org instanceof PharmacyOrganization){
                o_pharmacy=(PharmacyOrganization)org;
            }else if(org instanceof QuarantineOrganization){
                o_quarantine=(QuarantineOrganization)org;
            }
        }
        Employee em1_document=o_document.getEmployeeDirectory().createEmployee("document");
        o_document.getUserAccountDirectory().createUserAccount("doc", "doc", em1_document, new DocumentRole());
        
        Employee em1_doctor=o_doctor.getEmployeeDirectory().createEmployee("doctor");
        o_doctor.getUserAccountDirectory().createUserAccount("doctor", "doctor", em1_doctor, new DoctorRole());
           
        Employee em1_pharmacy=o_pharmacy.getEmployeeDirectory().createEmployee("pharmacy");
        o_pharmacy.getUserAccountDirectory().createUserAccount("pharmacy", "pharmacy", em1_pharmacy, new PharmacyRole());
        
        Employee em1_quarantine=o_quarantine.getEmployeeDirectory().createEmployee("quarantine");
        o_quarantine.getUserAccountDirectory().createUserAccount("quarantine", "quarantine", em1_quarantine, new QuarantineRole());
        
        //create employee & user account for cdc enterprise-cdc
        Employee em2=e2.getEmployeeDirectory().createEmployee("cdc_boston");
        e2.getUserAccountDirectory().createUserAccount("cdc_boston", "cdc_boston", em2, new AdminRole());
        
        //create employee & user account for police enterprise-boston police
        Employee em3=e3.getEmployeeDirectory().createEmployee("boston pd");
        e3.getUserAccountDirectory().createUserAccount("boston_pd", "boston_pd", em3, new AdminRole());

         
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");    
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        //create people
        People p=system.getPeopleDirectory().createPeople("123","Mickey Mouse","1990/01/11",30,"339019","143 park drive","boston","MA","female","//Users/stacyhuang/twoGirls/db4odemo/mickey.png");
            MedicalRecord mr=p.getMedicalRecord();
            mr.setBloodType("O");
            ArrayList<String> past=new ArrayList();
            ArrayList<String> family=new ArrayList();
            family.add("stroke");family.add("high blood pressure");
            ArrayList<String> operation=new ArrayList();
            operation.add("appendicitis");
            ArrayList<String> chronic=new ArrayList();
            chronic.add("high blood pressure");
            mr.setChronicDisease(chronic);
            mr.setFamily_history(family);
            mr.setOperation_history(operation);
            mr.setPast_history(past);
            mr.setPregancy("yes");
            mr.setEmergency_contactName("amy");mr.setEmergency_contactPhone("778837");
           
        People p2=system.getPeopleDirectory().createPeople("456","Thresseyes Joesph","1991/12/20",29,"103384","1 Manhatton avenue","new york","New York","male","/Users/stacyhuang/twoGirls/db4odemo/threeeyes.png");
   
        return system;
    }
    
}
