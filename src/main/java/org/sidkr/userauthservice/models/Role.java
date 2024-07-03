package org.sidkr.userauthservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Table(name = "roles")
@Entity
public class Role extends BaseModel{
    @ManyToMany(mappedBy = "roles")
    private List<User> users;
    private String role;
}
