package com.SVROT.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class OwnershipHistory {

    @Id
    private Long id;

    private Vehicle vehicle;
    private Owner oldOwner;
    private Owner newOwner;
    private LocalDateTime transferDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Owner getOldOwner() {
        return oldOwner;
    }

    public void setOldOwner(Owner oldOwner) {
        this.oldOwner = oldOwner;
    }

    public Owner getNewOwner() {
        return newOwner;
    }

    public void setNewOwner(Owner newOwner) {
        this.newOwner = newOwner;
    }

    public LocalDateTime getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDateTime transferDate) {
        this.transferDate = transferDate;
    }
}
