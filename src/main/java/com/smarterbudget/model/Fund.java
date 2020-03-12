package com.smarterbudget.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "FUNDS")
public class Fund {
    @Id
    @GeneratedValue
    private Long FUND_ID;
    @NotBlank
    private Long USER_ID;
    @NotBlank
    private String NAME;
    @NotBlank
    private double GOAL_AMOUNT;
    @NotBlank
    private double SAVED_AMOUNT;

    public Fund() { super(); }

    public Fund(Long FUND_ID, Long USER_ID, String NAME, double GOAL_AMOUNT, double SAVED_AMOUNT) {
        super();
        this.FUND_ID = FUND_ID;
        this.USER_ID = USER_ID;
        this.NAME = NAME;
        this.GOAL_AMOUNT = GOAL_AMOUNT;
        this.SAVED_AMOUNT = SAVED_AMOUNT;
    }

    public Long getFUND_ID() {
        return FUND_ID;
    }

    public void setFUND_ID(Long FUND_ID) {
        this.FUND_ID = FUND_ID;
    }

    public Long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public double getGOAL_AMOUNT() {
        return GOAL_AMOUNT;
    }

    public void setGOAL_AMOUNT(double GOAL_AMOUNT) {
        this.GOAL_AMOUNT = GOAL_AMOUNT;
    }

    public double getSAVED_AMOUNT() {
        return SAVED_AMOUNT;
    }

    public void setSAVED_AMOUNT(double SAVED_AMOUNT) {
        this.SAVED_AMOUNT = SAVED_AMOUNT;
    }
}
