package org.example.Lab3.Task2;

public class Utilisateur {
    private String nom, prénom, email;

    // Adding id for the task 3.4
    private int id;

    public Utilisateur(String nom, String prénom, String email, int id) {
        this.nom = nom;
        this.prénom = prénom;
        this.email = email;
        this.id = id;
    }
}
