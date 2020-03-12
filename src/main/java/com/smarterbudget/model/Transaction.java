package com.smarterbudget.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "TRANSACTIONS")
public class Transaction {
    @Id
    @GeneratedValue
    private Long TRANSACTION_ID;
    @NotBlank
    private Long BUDGET_ID;
    @NotBlank
    private Date DATE;
    @NotBlank
    private String TRANSACTION_TYPE;
    @NotBlank
    private String DESCRIPTION;
    @NotBlank
    private double AMOUNT;
    @NotBlank
    private boolean CREDITED;

    public Transaction() { super();}

    public Transaction(Long TRANSACTION_ID, Long BUDGET_ID, Date DATE, String TRANSACTION_TYPE, String DESCRIPTION, double AMOUNT, boolean CREDITED) {
        this.TRANSACTION_ID = TRANSACTION_ID;
        this.BUDGET_ID = BUDGET_ID;
        this.DATE = DATE;
        this.TRANSACTION_TYPE = TRANSACTION_TYPE;
        this.DESCRIPTION = DESCRIPTION;
        this.AMOUNT = AMOUNT;
        this.CREDITED = CREDITED;
    }

    public Long getTRANSACTION_ID() {
        return TRANSACTION_ID;
    }

    public void setTRANSACTION_ID(Long TRANSACTION_ID) {
        this.TRANSACTION_ID = TRANSACTION_ID;
    }

    public Long getBUDGET_ID() {
        return BUDGET_ID;
    }

    public void setBUDGET_ID(Long BUDGET_ID) {
        this.BUDGET_ID = BUDGET_ID;
    }

    public Date getDATE() {
        return DATE;
    }

    public void setDATE(Date DATE) {
        this.DATE = DATE;
    }

    public String getTRANSACTION_TYPE() {
        return TRANSACTION_TYPE;
    }

    public void setTRANSACTION_TYPE(String TRANSACTION_TYPE) {
        this.TRANSACTION_TYPE = TRANSACTION_TYPE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public double getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(double AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public boolean isCREDITED() {
        return CREDITED;
    }

    public void setCREDITED(boolean CREDITED) {
        this.CREDITED = CREDITED;
    }
}
