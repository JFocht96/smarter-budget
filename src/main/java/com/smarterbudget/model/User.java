package com.smarterbudget.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue
    private Long USER_ID;
    @NotBlank
    private String NAME;
    @NotBlank
    private String LOGIN;
    @NotBlank
    private String PASSWORD;
    @NotBlank
    private Long PAY_FREQUENCY_ID;
    @NotBlank
    private double NEEDS_PERCENTAGE;
    @NotBlank
    private double WANTS_PERCENTAGE;
    @NotBlank
    private double SAVINGS_PERCENTAGE;

    public User() { super(); }

    public User(Long USER_ID, String NAME, String LOGIN, String PASSWORD, Long PAY_FREQUENCY_ID, double NEEDS_PERCENTAGE, double WANTS_PERCENTAGE, double SAVINGS_PERCENTAGE) {
        this.USER_ID = USER_ID;
        this.NAME = NAME;
        this.LOGIN = LOGIN;
        this.PASSWORD = PASSWORD;
        this.PAY_FREQUENCY_ID = PAY_FREQUENCY_ID;
        this.NEEDS_PERCENTAGE = NEEDS_PERCENTAGE;
        this.WANTS_PERCENTAGE = WANTS_PERCENTAGE;
        this.SAVINGS_PERCENTAGE = SAVINGS_PERCENTAGE;
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

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String LOGIN) {
        this.LOGIN = LOGIN;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public Long getPAY_FREQUENCY_ID() {
        return PAY_FREQUENCY_ID;
    }

    public void setPAY_FREQUENCY_ID(Long PAY_FREQUENCY_ID) {
        this.PAY_FREQUENCY_ID = PAY_FREQUENCY_ID;
    }

    public double getNEEDS_PERCENTAGE() {
        return NEEDS_PERCENTAGE;
    }

    public void setNEEDS_PERCENTAGE(double NEEDS_PERCENTAGE) {
        this.NEEDS_PERCENTAGE = NEEDS_PERCENTAGE;
    }

    public double getWANTS_PERCENTAGE() {
        return WANTS_PERCENTAGE;
    }

    public void setWANTS_PERCENTAGE(double WANTS_PERCENTAGE) {
        this.WANTS_PERCENTAGE = WANTS_PERCENTAGE;
    }

    public double getSAVINGS_PERCENTAGE() {
        return SAVINGS_PERCENTAGE;
    }

    public void setSAVINGS_PERCENTAGE(double SAVINGS_PERCENTAGE) {
        this.SAVINGS_PERCENTAGE = SAVINGS_PERCENTAGE;
    }
}
