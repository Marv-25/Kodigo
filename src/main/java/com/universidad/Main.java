package com.universidad;
import com.universidad.Estudiante;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();
        List listadoEstudiantes =estudiante.generarLista();
        System.out.println(listadoEstudiantes);
        Estudiante estudianteNuevo = estudiante.registrarEstudiante();
        System.out.println(estudianteNuevo);


    }
}
