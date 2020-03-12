package com.smarterbudget.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "PAY_FREQUENCY")
public class PayFrequency {
    @Id
    @GeneratedValue
    private Long PAY_FREQUENCY_ID;
    @NotBlank
    private String NAME;

    public PayFrequency() { super(); }

    public PayFrequency(Long PAY_FREQUENCY_ID, String NAME){
        super();
        this.PAY_FREQUENCY_ID = PAY_FREQUENCY_ID;
        this.NAME = NAME;
    }

    public Long getPAY_FREQUENCY_ID() {
        return PAY_FREQUENCY_ID;
    }

    public void setPAY_FREQUENCY_ID(Long PAY_FREQUENCY_ID) {
        this.PAY_FREQUENCY_ID = PAY_FREQUENCY_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
