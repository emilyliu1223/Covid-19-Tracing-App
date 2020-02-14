/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.User.Customer;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class Flight {
    private String flightnumber;
    private Date fromdate;
    private LocalTime fromtime;
    private Date todate;
    private LocalTime totime;
    private String from;
    private String to;
    private String estimation;
    private List<String> IDlist;
    private String airliner;
    
    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public LocalTime getFromtime() {
        return fromtime;
    }

    public void setFromtime(LocalTime fromtime) {
        this.fromtime = fromtime;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public LocalTime getTotime() {
        return totime;
    }

    public void setTotime(LocalTime totime) {
        this.totime = totime;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }
    
    public List<String>getID() {
        return IDlist;
    }

    public void setID(List<String> IDlist) {
        this.IDlist = IDlist;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getEstimation() {
        return estimation;
    }

    public void setEstimation(String estimation) {
        this.estimation = estimation;
    }
    @Override
    public String toString(){
        return this.getFlightnumber();
    }
}