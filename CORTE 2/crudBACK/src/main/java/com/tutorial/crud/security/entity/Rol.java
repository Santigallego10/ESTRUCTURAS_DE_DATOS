package com.tutorial.crud.security.entity;

import com.tutorial.crud.security.enums.RolName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolName rolNombre;

    public Rol() {
    }

    public Rol(@NotNull RolName rolNombre) {
        this.rolNombre = rolNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolName getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolName rolNombre) {
        this.rolNombre = rolNombre;
    }
}
