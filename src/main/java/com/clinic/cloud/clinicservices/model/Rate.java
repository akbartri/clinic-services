package com.clinic.cloud.clinicservices.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mst_rate")
public class Rate extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "rate_type")
    private int rateType;

    @Column(name = "rate_value")
    private int rateValue;

    @Column(name = "rate_type_id")
    private int rateTypeId;

    @Column(name = "counted_rate")
    private int countedRate;

    @Column(name = "total_rate")
    private int totalRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRateType() {
        return rateType;
    }

    public void setRateType(int rateType) {
        this.rateType = rateType;
    }

    public int getRateValue() {
        return rateValue;
    }

    public void setRateValue(int rateValue) {
        this.rateValue = rateValue;
    }

    public int getRateTypeId() {
        return rateTypeId;
    }

    public void setRateTypeId(int rateTypeId) {
        this.rateTypeId = rateTypeId;
    }

    public int getCountedRate() {
        return countedRate;
    }

    public void setCountedRate(int countedRate) {
        this.countedRate = countedRate;
    }

    public int getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(int totalRate) {
        this.totalRate = totalRate;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id=" + id +
                ", rateType=" + rateType +
                ", rateValue=" + rateValue +
                ", rateTypeId=" + rateTypeId +
                ", countedRate=" + countedRate +
                ", totalRate=" + totalRate +
                '}';
    }
}
