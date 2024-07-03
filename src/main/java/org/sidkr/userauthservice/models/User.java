package org.sidkr.userauthservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User extends BaseModel{
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
            joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id")} ,
    inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id")})
    private  Set<Role> roles;
}
