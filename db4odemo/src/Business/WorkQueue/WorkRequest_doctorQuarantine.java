/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import People.People;
import java.util.Date;

/**
 *
 * @author stacyhuang
 */
public class WorkRequest_doctorQuarantine {
    private String testType;
    private String status;
    private Date date;
    private UserAccount doctor;
    private People patient;
    private String result;
    private int id;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public People getPatient() {
        return patient;
    }

    public void setPatient(People patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
