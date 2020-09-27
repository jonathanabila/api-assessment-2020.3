package com.assessment.infnet.api.model.models;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
    @ManyToMany(mappedBy = "items")
    @JsonBackReference
    private List<Buy> buyList;

    public Product() {}

    public Product(Integer id, float price, String description, LocalDate releaseDate) {
        this();
        this.id = id;
        this.price = price;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public void setReleaseDate(String releaseDate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.releaseDate = LocalDate.parse(releaseDate, dtf);
    }

    public List<Buy> getBuyList() {
        return buyList;
    }

    public void setBuyList(List<Buy> buyList) {
        this.buyList = buyList;
    }
}
