package com.suivi;

import java.util.Date;

public class Expense {
    private String description;
    private int montant;
    private String category;
    private Date date;

    public Expense(String description, int montant, String category, Date date) {
        this.description = description;
        this.montant = montant;
        this.category = category;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
