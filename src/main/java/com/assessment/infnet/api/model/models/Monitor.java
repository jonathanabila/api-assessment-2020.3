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
}
