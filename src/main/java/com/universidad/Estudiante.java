package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Estudiante extends Usuario {
    @Setter
    @Getter
    private double promedio;
    @Setter @Getter
    private String idCarrera;

    //@Setter @Getter
    //ArrayList<Double> notas = new ArrayList<>();

    //@Setter @Getter
    //ArrayList<String>historialMaterias = new ArrayList<>();


    public Estudiante(int idUsuario, String nombre, String apellido, String sexo, String fechaNacimiento, String statusUsuario, double promedio, String idCarrera) {
        super(idUsuario, nombre, apellido, sexo, fechaNacimiento, statusUsuario);
        this.promedio = promedio;
        this.idCarrera = idCarrera;
    }

    private List<Estudiante> estudiantesList = new ArrayList<>();

    public Estudiante() {
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                " idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", statusUsuario='" + statusUsuario + '\'' +
                "promedio=" + promedio +
                ", idCarrera='" + idCarrera + '\'' +
                '}';
    }
    List<Estudiante> generarLista (){
        estudiantesList.add(new Estudiante(4, "Fulgencio", "Zeballos", "MAS","MARZO", "activo",
                5.0,"FIS"));
        estudiantesList.add(new Estudiante(6,"Federico","Rivera","MAS","MARZO","inactivo",6.0,"CONT"));
        System.out.println(estudiantesList);
        return estudiantesList;
    }

    Estudiante registrarEstudiante (){
        Estudiante estudianteNuevo = new Estudiante();
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cual es el nombre del estudiante?");
        String nombre= entrada.nextLine();
        System.out.println("¿Cual es el apellido del estudiante?");
        String apellido= entrada.nextLine();
        System.out.println("Ingresar sexo del alumno(FEM o MAS");
        String sexo= entrada.nextLine();
        System.out.println("¿En qué mes nació?");
        String fechaNacimiento= entrada.nextLine();
        System.out.println("¿Qué carrera estudia?");
        String idCarrera= entrada.nextLine();


        estudianteNuevo.setNombre(nombre);
        estudianteNuevo.setApellido(apellido);
        estudianteNuevo.setSexo(sexo);
        estudianteNuevo.setFechaNacimiento(fechaNacimiento);
        estudianteNuevo.setIdCarrera(idCarrera);
        return estudianteNuevo;
    }

}
