package com.devsuperior.dscommerce.entities;

import jakarta.persistence.OneToOne;

import java.time.Instant;

public class Payment {
    private Long id;
    private Instant moment;
    @OneToOne(mappedBy = "payment")
    private Order order;

    public Payment(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }
}