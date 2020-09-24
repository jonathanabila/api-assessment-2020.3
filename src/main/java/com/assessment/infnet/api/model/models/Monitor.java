package com.assessment.infnet.api.model.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TMonitor")
@PrimaryKeyJoinColumn(name = "idProduct")
public class Monitor extends Product {

    public int screenSize;
    public boolean heightAdjustable;

    @Override
    public String toString() {
        return String.format(
                "M;%s;%.2f;%s;%s;%s",
                this.description,
                this.price,
                this.getReleaseDateString(),
                this.screenSize,
                this.heightAdjustable
        );
    }
}
