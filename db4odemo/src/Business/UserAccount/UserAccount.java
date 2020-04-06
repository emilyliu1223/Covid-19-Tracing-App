/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkQueue_doctorQuarantine;
import Business.WorkQueue.WorkQueue_documentDoctor;
import Business.WorkQueue.WorkQueue_quarantineCDC;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private WorkQueue_documentDoctor workQueue_documentDoctor;
    private WorkQueue_doctorQuarantine workQueue_doctorQuarantine;
    private WorkQueue_quarantineCDC workQueue_quarantineCDC;
    public UserAccount() {
        workQueue = new WorkQueue();
        workQueue_documentDoctor=new WorkQueue_documentDoctor();
        workQueue_doctorQuarantine=new WorkQueue_doctorQuarantine();
        workQueue_quarantineCDC=new WorkQueue_quarantineCDC();
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
    
    
    public WorkQueue_documentDoctor getWorkQueue_documentDoctor() {
        return workQueue_documentDoctor;
    }

    public void setWorkQueue_documentDoctor(WorkQueue_documentDoctor workQueue_documentDoctor) {
        this.workQueue_documentDoctor = workQueue_documentDoctor;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}