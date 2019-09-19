package com.example.assignment.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name="person_general_information")
@Table(name="person_general_information")
public class PersonGeneralInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="person_general_id")
    private Integer personGeneralId;

    @NotNull
    @Column(name="first_name")
    @Size(max=50)
    private String firstName;


    @NotNull
    @Size(max=50)
    private String lastName;

    @Column(name="middle_name")
    private String middleName;

    @Column(name="initial")
    private String initial;

    @NotNull
    @Email
    @Size(max = 100)
    @Column(name="email",unique = true)
    private String email;

    @Email
    @Column(name="email2")
    private String email2;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="person_mapping", joinColumns = @JoinColumn(name="person_general_id"), inverseJoinColumns = @JoinColumn(name="person_detail_id"))
    private PersonDetails personDetails;

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public void setPersonDetails(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }

    public Integer getPersonGeneralId() {
        return personGeneralId;
    }

    public void setPersonGeneralId(Integer personGeneralId) {
        this.personGeneralId = personGeneralId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }
}
