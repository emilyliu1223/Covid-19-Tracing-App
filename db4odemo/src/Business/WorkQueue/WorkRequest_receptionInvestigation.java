/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import People.People;

/**
 *
 * @author stacyhuang
 */
public class WorkRequest_receptionInvestigation {
    private int caseNumber;
    private People patient;
    private Enterprise hospital;
    private UserAccount sender;
    private String symptons;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
    }

    public People getPatient() {
        return patient;
    }

    public void setPatient(People patient) {
        this.patient = patient;
    }

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public String getSymptons() {
        return symptons;
    }

    public void setSymptons(String symptons) {
        this.symptons = symptons;
    }
    @Override
    public String toString(){
        return String.valueOf(caseNumber);
    }
}
