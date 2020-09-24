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

    @Override
    public String toString() {
        return String.format(
                "K;%s;%.2f;%s;%s;%s",
                this.description,
                this.price,
                this.getReleaseDateString(),
                this.strengthControl,
                this.temperatureControl
        );
    }
}
