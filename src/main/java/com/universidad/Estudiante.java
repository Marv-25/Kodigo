package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudiante extends Usuario{
    @Setter
    @Getter
    private double promedio;
    @Setter
    @Getter
    private String idCarrera;

    private ArrayList<Materia> materiasList;

    public Estudiante(int idUsuario, String nombre, String apellido, String sexo, String fechaNacimiento, String statusUsuario, double promedio, String idCarrera, ArrayList<Materia> materiasList) {
        super(idUsuario, nombre, apellido, sexo, fechaNacimiento, statusUsuario);
        this.promedio = promedio;
        this.idCarrera = idCarrera;
        this.materiasList = materiasList;
    }


    private List<Estudiante> estudiantesList = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    public Estudiante() {
        super();
    }

    @Override
    public String registrarUsuario() {
        int listSize = estudiantesList.size();
        System.out.println("Cantidad de estudiantes a inscribir?");
            listSize = entrada.nextInt();
        for (int i = 0; i < listSize; i++) {
            System.out.println(i+1);
            System.out.println("Asigne un ID");
            int id = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Nombre del estudiante");
            String nombre = entrada.nextLine();
            System.out.println("Apellido del estudiante");
            String apellido = entrada.nextLine();
            System.out.println("Ingresar sexo del alumno(FEM o MAS)");
            String sexo = entrada.nextLine();
            System.out.println("Fecha de nacimiento");
            String fechaNacimiento = entrada.nextLine();
            System.out.println("Status del Alumno");
            String status = entrada.nextLine();
            entrada.nextLine();

            Estudiante estudianteNuevo = new Estudiante(id,nombre,apellido,sexo,fechaNacimiento,status);
            estudiantesList.add(estudianteNuevo);
        }
        return "registro exitoso";
    }



    public void mostarUsuario(){
        for (int i=0; i<estudiantesList.size(); i++){
            System.out.println(i+1);
            System.out.println("Nombre: "+estudiantesList.get(i).getNombre());
            System.out.println("Apellido: "+estudiantesList.get(i).getApellido());
        }
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", statusUsuario='" + statusUsuario + '\'' +
                ", promedio=" + promedio +
                ", idCarrera='" + idCarrera + '\'' +
                ", materiasList=" + materiasList +
                '}';
    }
}

