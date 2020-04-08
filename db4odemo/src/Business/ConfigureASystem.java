package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.DocumentOrganization;
import Business.Organization.InvestigationOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Organization.PoliceOrganization;
import Business.Organization.QuarantineOrganization;
import Business.Organization.ReceptionOrganization;
import Business.Role.AdminRole;
import Business.Role.DoctorRole;
import Business.Role.DocumentRole;
import Business.Role.InvestigationRole;
import Business.Role.PharmacyRole;
import Business.Role.PoliceRole;
import Business.Role.QuarantineRole;
import Business.Role.ReceptionRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import MedicineCatelog.Medicine;
import MedicineCatelog.MedicineDetail;
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
        
        system.getCountSymtoms().setCountAndType();
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
        ReceptionOrganization o_reception=null;
        InvestigationOrganization o_investigation=null;
        for(Organization o_e2:e2.getOrganizationDirectory().getOrganizationList()){
            if(o_e2 instanceof ReceptionOrganization){
                o_reception=(ReceptionOrganization)o_e2;
            }else if(o_e2 instanceof InvestigationOrganization){
                o_investigation=(InvestigationOrganization)o_e2;
            }
        }
        Employee em2_reception=o_reception.getEmployeeDirectory().createEmployee("reception");
        o_reception.getUserAccountDirectory().createUserAccount("recep", "recep", em2_reception, new ReceptionRole());
        Employee em2_investigation=o_investigation.getEmployeeDirectory().createEmployee("investigation");
        o_investigation.getUserAccountDirectory().createUserAccount("inves", "inves", em2_investigation, new InvestigationRole());
        //create employee & user account for police enterprise-boston police
        Employee em3=e3.getEmployeeDirectory().createEmployee("boston pd");
        e3.getUserAccountDirectory().createUserAccount("boston_pd", "boston_pd", em3, new AdminRole());
        PoliceOrganization o_police=null;
        for(Organization o_e3:e3.getOrganizationDirectory().getOrganizationList()){
            if(o_e3 instanceof PoliceOrganization){
                o_police=(PoliceOrganization)o_e3;
            }
        }
        Employee em3_police=o_police.getEmployeeDirectory().createEmployee("police");
        o_police.getUserAccountDirectory().createUserAccount("police", "police", em3_police, new PoliceRole());
         
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");    
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        //create people
        People p=system.getPeopleDirectory().createPeople("123","Mickey Mouse","1990/01/11",30,"339019","143 park drive","boston","Massachusetts","female","//Users/stacyhuang/twoGirls/db4odemo/mickey.png");
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
           
        People p2=system.getPeopleDirectory().createPeople("456","Thresseyes Joesph","1991/12/20",29,"103384","12 bolyston street","boston","Massachusetts","male","/Users/stacyhuang/twoGirls/db4odemo/threeeyes.png");
   
        Medicine medicine=system.getMedicineDir().createMedicineCatelog("Diabete");
        MedicineDetail m=new MedicineDetail();
        m.setName("Tolbutamide");
        m.setDescription("diabete");
        m.setTreatment("diabete"); 
        MedicineDetail m2=new MedicineDetail();
        m2.setName("Glibenclamide");
        m2.setTreatment("diabete");
        m2.setDescription("no");
        medicine.getMedicinearr().add(m);
        medicine.getMedicinearr().add(m2);
//        medicine.getMedicinearr().add("Tolbutamide/diabete/no");
//        medicine.getMedicinearr().add("Glibenclamide/diabete/no");
        Medicine medicine2=system.getMedicineDir().createMedicineCatelog("Vitamin");
        MedicineDetail m3=new MedicineDetail();
        m3.setName("Vitamin A");
        m3.setTreatment("prevent and cure");
        m3.setDescription("no");
        MedicineDetail m4=new MedicineDetail();
        m4.setName("Vitamin C");
        m4.setTreatment("prevent and cure");
        m4.setDescription("no");
        MedicineDetail m5=new MedicineDetail();
        m5.setName("Vitamin E");
        m5.setTreatment("prevent, eye care and cure");
        m5.setDescription("no");
        medicine2.getMedicinearr().add(m3);
        medicine2.getMedicinearr().add(m4);
        medicine2.getMedicinearr().add(m5);
        
        Medicine medicine3=system.getMedicineDir().createMedicineCatelog("Flu and Cold");
        MedicineDetail m3_1=new MedicineDetail();
        m3_1.setName("Zanamivir");
        m3_1.setTreatment("for flu symptoms");
        m3_1.setDescription("sleepy");
        MedicineDetail m3_2=new MedicineDetail();
        m3_2.setName("Peramivir");
        m3_2.setDescription("nausea, vomiting");
        m3_2.setTreatment("flu and cold");
        medicine3.getMedicinearr().add(m3_1);
        medicine3.getMedicinearr().add(m3_2);
        return system;
    }
    
}
