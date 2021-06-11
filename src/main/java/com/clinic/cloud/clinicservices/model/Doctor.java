package com.clinic.cloud.clinicservices.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mst_doctor")
public class Doctor extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String biography;

    @Column(name = "clinic_id")
    private int clinicId;

    @Column(name = "rate_id")
    private int rateId;

    @Column(name = "schedule_id")
    private int scheduleId;

    @Column(name = "image_id")
    private int imageId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
