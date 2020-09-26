package com.assessment.infnet.api.model.models;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TKeyboard")
@PrimaryKeyJoinColumn(name = "idProduct")
public class Keyboard extends Product{
    public boolean isRBG;
    public boolean isMechanic;
}
