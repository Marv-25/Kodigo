package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


public abstract class Usuario {

    @Setter @Getter
    protected int idUsuario;

    @Setter @Getter
    protected String nombre;

    @Setter @Getter
    protected String apellido;

    @Setter @Getter
    protected String sexo;

    @Setter @Getter
    protected String fechaNacimiento;

    @Setter @Getter
    protected String statusUsuario;


    public Usuario(int idUsuario, String nombre, String apellido, String sexo, String fechaNacimiento,
                   String statusUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.statusUsuario = statusUsuario;
    }

    public Usuario() {

    }

    public ArrayList registrarUsuario() {
        return null;
    }
    public void mostrarUsuario(){

    }

    public void eliminarUsuario(){

    }
}
