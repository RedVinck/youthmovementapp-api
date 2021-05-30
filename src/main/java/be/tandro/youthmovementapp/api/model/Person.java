package be.tandro.youthmovementapp.api.model;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 * Person class is the individual person.
 */
@Entity
public class Person {

    /**
     * This is the id of the person, this is important for the database
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    /**
     * This is the family name of a person
     */
    private String name;


    /**
     * This is the first name of a person
     */
    private String surname;


    /**
     * This is the email of the person it has to be unique
     */
    @Column(unique = true)
    @NotBlank(message = "email.is.missing")
    private String email;

    /**
     * This is the group the individual is in
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Group group;


    @OneToOne
    private Balance balance;

    @ManyToOne
    private Role role;

    private Integer memberNumber;

    private LocalDate birthday;

    @Formula("YEAR(CURDATE()) - YEAR(birthday)")
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
    }

    public int getAge() {
        return age;
    }

        public LocalDate getBirthday() {
        return birthday;
    }


    public void setBirthday(LocalDate birthday) {
        System.out.println(birthday);
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
