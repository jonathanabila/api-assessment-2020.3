package com.assessment.infnet.api.model.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "TProducts")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "productType"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CoffeeMachine.class, name = "C"),
        @JsonSubTypes.Type(value = Keyboard.class, name = "K"),
        @JsonSubTypes.Type(value = Monitor.class, name = "M")
})
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public float price;
    public String description;
    private LocalDate releaseDate;

    public Product() {}

    public Product(Integer id, float price, String description, LocalDate releaseDate) {
        this();
        this.id = id;
        this.price = price;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public String getReleaseDateString() {
        return releaseDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
