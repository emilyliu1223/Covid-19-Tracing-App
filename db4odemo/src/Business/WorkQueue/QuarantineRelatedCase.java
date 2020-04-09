/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import People.People;

/**
 *
 * @author stacyhuang
 */
public class QuarantineRelatedCase {
    private int caseNumber;
    private People quarantinePeople;
    private int relatedCaseNumber;

    public int getRelatedCaseNumber() {
        return relatedCaseNumber;
    }

    public void setRelatedCaseNumber(int relatedCaseNumber) {
        this.relatedCaseNumber = relatedCaseNumber;
    }
    

    public int getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
    }

    public People getQuarantinePeople() {
        return quarantinePeople;
    }

    public void setQuarantinePeople(People quarantinePeople) {
        this.quarantinePeople = quarantinePeople;
    }
    @Override
    public String toString(){
        return String.valueOf(caseNumber);
    }      
}
