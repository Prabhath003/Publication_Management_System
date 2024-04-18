package com.swe.pms.domain;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.NotBlank;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @NotBlank
    private String username;
    private String email;
    private String password;
    private String phone_no;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles; // Optional for user roles

    // Getters, setters, equals, hashCode, and other methods...

    public void change_firstname(String new_firstName) {
        this.firstName = new_firstName;
    }

    public void change_lastname(String new_lastname) {
        this.lastName = new_lastname;
    }

    public void change_password(String new_password) {
        this.password = new_password;
    }
}
