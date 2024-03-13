package fr.uhuruconsulting.registerEmployee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Nom")
    private String lastname;

    @Column(name = "Prenom")
    private String firstname;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Poste")
    private String jobTitle;

    @Column(name = "Numéros")
    private String phone;

    @Column(name = "Photo_profile")
    private String imageUrl;

    @Column(name = "Matricule", updatable = false)
    private String matricule;
}
