package com.suivi;
import java.time.LocalDate;

import java.util.List;

public class UserProfile {
    private id;
    private String userName;
    private int mensualBudget;
    List<Expense> expenses;

    public UserProfile(int id, String userName, int mensualBudget, List<Expense> expenses) {
        this.id = id;
        this.userName = userName;
        this.mensualBudget = mensualBudget;
        this.expenses = expenses;
    }

    // 1. Ajouter une dépense
    public void addExpense(String description, double montant, String category, LocalDate date) {
        if (montant < 0) {
            throw new Error("Le montant ne peut pas être négatif.");
        }
        expenses.add(new Expense(description, (int) montant, category, date));
    }

    //2. Afficher toutes les depenses
    public void
    
}
