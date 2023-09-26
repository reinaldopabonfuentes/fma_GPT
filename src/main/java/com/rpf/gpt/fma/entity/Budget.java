package com.rpf.gpt.fma.entity;

import jakarta.persistence.*;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long budget_id;

    private String category;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Budget(Long budget_id, String category, double amount, User user) {
        this.budget_id = budget_id;
        this.category = category;
        this.amount = amount;
        this.user = user;
    }

    public Long getBudget_id() {
        return budget_id;
    }

    public void setBudget_id(Long budget_id) {
        this.budget_id = budget_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
