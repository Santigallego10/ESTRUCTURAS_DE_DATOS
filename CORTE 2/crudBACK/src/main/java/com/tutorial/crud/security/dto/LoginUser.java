package com.tutorial.crud.security.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class LoginUser {

    @NotBlank
    private String nombreUsuario;
    @Email
    @NotBlank
    private String password;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
