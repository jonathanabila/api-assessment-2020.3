package com.assessment.infnet.api.model.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "TBuyer")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String email;
    public String socialSecurityNumber;
    public LocalDate birth;

    public Buyer() {}

    public Buyer(Integer id, String email, String socialSecurityNumber) {
        this();
        this.id = id;
        this.email = email;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getBirth() {
        return birth.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public void setBirth(String birth) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.birth = LocalDate.parse(birth, dtf);
    }
}
