/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicineCatelog;

import java.util.ArrayList;

/**
 *
 * @author stacyhuang
 */
public class Medicine {
    private String medicineCatelog;
    private ArrayList<String> medicinearr;
    
    public Medicine(){
        this.medicinearr=new ArrayList();
    }
    public Medicine(String medicineCatelog){
        this.medicineCatelog=medicineCatelog;
        this.medicinearr=new ArrayList();
    }

    public String getMedicineCatelog() {
        return medicineCatelog;
    }

    public void setMedicineCatelog(String medicineCatelog) {
        this.medicineCatelog = medicineCatelog;
    }

    public ArrayList<String> getMedicinearr() {
        return medicinearr;
    }

    public void setMedicinearr(ArrayList<String> medicinearr) {
        this.medicinearr = medicinearr;
    }
    @Override
    public String toString(){
        return medicineCatelog;
    }
}
