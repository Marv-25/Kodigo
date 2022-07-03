package com.universidad;
import com.universidad.Estudiante;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.registrarUsuario();
        empleado1.mostrarUsuario();
        empleado1.eliminarUsuario();

        Estudiante est1 = new Estudiante();
        est1.getNombre();
        est1.setNombre("tomas");



    }
}
