package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        Network createNetwork=new Network();
        createNetwork.setName("Boston");
        system.getNetworkList().add(createNetwork);
        //create an enterprise
        Enterprise e1=createNetwork.getEnterpriseDirectory().createAndAddEnterprise("Fenway Health", Enterprise.EnterpriseType.Hospital);
        Enterprise e2=createNetwork.getEnterpriseDirectory().createAndAddEnterprise("CDC-boston branch", Enterprise.EnterpriseType.CDC);
        Enterprise e3=createNetwork.getEnterpriseDirectory().createAndAddEnterprise("Boston PD", Enterprise.EnterpriseType.Police);
        //initialize some organizations
//        e1.getOrganizationDirectory().createOrganization(Organization.Type.Admin);
//        e1.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
//        e1.getOrganizationDirectory().createOrganization(Organization.Type.Document);
//        e1.getOrganizationDirectory().createOrganization(Organization.Type.Pharmacy);
//        e1.getOrganizationDirectory().createOrganization(Organization.Type.Quarantine);
//        e2.getOrganizationDirectory().createOrganization(Organization.Type.Admin);
//        e2.getOrganizationDirectory().createOrganization(Organization.Type.Reception);
//        e2.getOrganizationDirectory().createOrganization(Organization.Type.Investigation);
//        e2.getOrganizationDirectory().createOrganization(Organization.Type.Publish);
//        e3.getOrganizationDirectory().createOrganization(Organization.Type.Admin);
//        e3.getOrganizationDirectory().createOrganization(Organization.Type.Police);
        //have some employees
        Employee em1=e1.getEmployeeDirectory().createEmployee("fenway health");
        Employee em2=e2.getEmployeeDirectory().createEmployee("cdc_boston");
        Employee em3=e3.getEmployeeDirectory().createEmployee("boston pd");
        //create user account
        e1.getUserAccountDirectory().createUserAccount("fenwayhealth", "fenwayhealth", em1, new AdminRole());
        e2.getUserAccountDirectory().createUserAccount("cdc_boston", "cdc_boston", em2, new AdminRole());
        e3.getUserAccountDirectory().createUserAccount("boston_pd", "boston_pd", em3, new AdminRole());
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
