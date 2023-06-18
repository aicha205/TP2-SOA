package com.gestion.service.api.to;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class AdherentTo {
    private Long id;
    private String First_Name;
    private String Last_Name;
    private String Address;
    private Date Date_Naissance;
    private Long UserId;
    private Date Date_Creation;

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setDate_Naissance(Date date_Naissance) {
        Date_Naissance = date_Naissance;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public void setDate_Creation(Date date_Creation) {
        Date_Creation = date_Creation;
    }

    public Long getId() {
        return id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getAddress() {
        return Address;
    }

    public Date getDate_Naissance() {
        return Date_Naissance;
    }

    public Long getUserId() {
        return UserId;
    }

    public Date getDate_Creation() {
        return Date_Creation;
    }
}
