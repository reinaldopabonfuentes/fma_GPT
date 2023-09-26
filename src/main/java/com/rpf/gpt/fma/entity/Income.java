package com.rpf.gpt.fma.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long income_id;

    private String source;
    private double amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Income(Long income_id, String source, double amount, Date date, User user) {
        this.income_id = income_id;
        this.source = source;
        this.amount = amount;
        this.date = date;
        this.user = user;
    }


    public Long getIncome_id() {
        return income_id;
    }

    public void setIncome_id(Long income_id) {
        this.income_id = income_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
