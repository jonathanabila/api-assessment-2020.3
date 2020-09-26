package com.assessment.infnet.api.model.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "TCoffeeMachine")
@PrimaryKeyJoinColumn(name="idProduct")
public class CoffeeMachine extends Product{
    public boolean strengthControl;
    public boolean temperatureControl;
}
