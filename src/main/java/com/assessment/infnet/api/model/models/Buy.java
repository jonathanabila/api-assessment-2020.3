package com.assessment.infnet.api.model.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Entity
@Table(name = "TBuy")
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public LocalDateTime date;
    public boolean forDelivery;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idBuyer")
    public Buyer buyer;

    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "TBuyProduct",
            joinColumns = {@JoinColumn(name="idBuy")},
            inverseJoinColumns = {@JoinColumn(name="idProduct")})
    public List<Product> items;

    public Buy() {}

    public Buy(Integer id, LocalDateTime date, boolean forDelivery) {
        this();
        this.id = id;
        this.date = date;
        this.forDelivery = forDelivery;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public String getDate() {
        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}

