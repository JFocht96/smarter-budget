package com.smarterbudget.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "BUDGETS")
public class Budget {
    @Id
    @GeneratedValue
    private Long BUDGET_ID;
    @NotBlank
    private double TOTAL_AMOUNT;
    @NotBlank
    private Date START_DATE;
    @NotBlank
    private Date END_DATE;
    @NotBlank
    private Long USER_ID;

    public Budget() { super(); }

    public Budget(Long BUDGET_ID, double TOTAL_AMOUNT, Date START_DATE, Date END_DATE, Long USER_ID){
        super();
        this.BUDGET_ID = BUDGET_ID;
        this.TOTAL_AMOUNT = TOTAL_AMOUNT;
        this.START_DATE = START_DATE;
        this.END_DATE = END_DATE;
        this.USER_ID = USER_ID;
    }

    public Long getBUDGET_ID() {
        return BUDGET_ID;
    }

    public void setBUDGET_ID(Long BUDGET_ID) {
        this.BUDGET_ID = BUDGET_ID;
    }

    public double getTOTAL_AMOUNT() {
        return TOTAL_AMOUNT;
    }

    public void setTOTAL_AMOUNT(double TOTAL_AMOUNT) {
        this.TOTAL_AMOUNT = TOTAL_AMOUNT;
    }

    public Date getSTART_DATE() {
        return START_DATE;
    }

    public void setSTART_DATE(Date START_DATE) {
        this.START_DATE = START_DATE;
    }

    public Date getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(Date END_DATE) {
        this.END_DATE = END_DATE;
    }

    public Long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Long USER_ID) {
        this.USER_ID = USER_ID;
    }
}
