package com.gestion.service.api.dataaccess.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="adherent",schema = "public")
public class Adherent implements Serializable{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;
    @Column(name = "First_Name")
    private String First_Name;
    @Column(name = "Last_Name")
    private String Last_Name;
    @Column(name = "Address")
    private String Address;
    @Column(name = "Date_Naissance")
    private Date Date_Naissance;
    @Column(name = "UserId")
    private Long UserId;
    @Column(name = "Date_Creation")
    private Date Date_Creation;

    public void setId(Long id) {
        this.Id = id;
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
        return Id;
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
