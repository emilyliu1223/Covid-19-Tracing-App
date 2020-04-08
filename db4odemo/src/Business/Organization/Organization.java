/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkQueue_doctorPharmacy;
import Business.WorkQueue.WorkQueue_doctorQuarantine;
import Business.WorkQueue.WorkQueue_documentDoctor;
import Business.WorkQueue.WorkQueue_quarantineCDC;
import Business.WorkQueue.WorkQueue_receptionInvestigation;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue_documentDoctor workQueue_documentDoctor;
    private WorkQueue_doctorQuarantine workQueue_doctorQuarantine;
    private WorkQueue_quarantineCDC workQueue_quarantineCDC;
    private WorkQueue_doctorPharmacy workQueue_doctorPharmacy;
    private WorkQueue_receptionInvestigation workQueue_receptionInvestigation;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Document("Document Organization"),Pharmacy("Pharmacy Organization"),Doctor("Doctor Organization")
        ,Quarantine("Quarantine Organization"),Reception("Reception Organization"),Investigation("Investigation Organization"), 
        Publish("Publish Organization"),Police("Police Organization"),
        Lab("Lab Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue_documentDoctor=new WorkQueue_documentDoctor();
        workQueue_doctorQuarantine=new WorkQueue_doctorQuarantine();
        workQueue_quarantineCDC=new WorkQueue_quarantineCDC();
        workQueue_doctorPharmacy=new WorkQueue_doctorPharmacy();
        workQueue_receptionInvestigation=new WorkQueue_receptionInvestigation();
        organizationID = counter;
        ++counter;
    }

    public WorkQueue_receptionInvestigation getWorkQueue_receptionInvestigation() {
        return workQueue_receptionInvestigation;
    }

    public void setWorkQueue_receptionInvestigation(WorkQueue_receptionInvestigation workQueue_receptionInvestigation) {
        this.workQueue_receptionInvestigation = workQueue_receptionInvestigation;
    }

    public WorkQueue_doctorPharmacy getWorkQueue_doctorPharmacy() {
        return workQueue_doctorPharmacy;
    }

    public void setWorkQueue_doctorPharmacy(WorkQueue_doctorPharmacy workQueue_doctorPharmacy) {
        this.workQueue_doctorPharmacy = workQueue_doctorPharmacy;
    }

    
    public WorkQueue_quarantineCDC getWorkQueue_quarantineCDC() {
        return workQueue_quarantineCDC;
    }

    public void setWorkQueue_quarantineCDC(WorkQueue_quarantineCDC workQueue_quarantineCDC) {
        this.workQueue_quarantineCDC = workQueue_quarantineCDC;
    }

    public WorkQueue_doctorQuarantine getWorkQueue_doctorQuarantine() {
        return workQueue_doctorQuarantine;
    }

    public void setWorkQueue_doctorQuarantine(WorkQueue_doctorQuarantine workQueue_doctorQuarantine) {
        this.workQueue_doctorQuarantine = workQueue_doctorQuarantine;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public WorkQueue_documentDoctor getWorkQueue_documentDoctor() {
        return workQueue_documentDoctor;
    }

    public void setWorkQueue_documentDoctor(WorkQueue_documentDoctor workQueue_documentDoctor) {
        this.workQueue_documentDoctor = workQueue_documentDoctor;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
