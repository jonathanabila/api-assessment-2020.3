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

    @Override
    public String toString() {
        return String.format(
                "K;%s;%.2f;%s;%s;%s",
                this.description,
                this.price,
                this.getReleaseDateString(),
                this.isRBG,
                this.isMechanic
        );
    }
}
