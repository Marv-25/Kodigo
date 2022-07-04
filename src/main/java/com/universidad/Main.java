package com.universidad;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variables
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion1;
        int opcion2;
        int opcion3;

        //Creando objetos
        Empleado empleado1 = new Empleado();

        //Menu
        while(!salir){
            System.out.println("*****************************************");
            System.out.println("Seleccione una de las siguientes opciones");
            System.out.println("1. Registrar/Listar/Eliminar Empleado");
            System.out.println("2. Registrar/Listar/Eliminar Estudiante");
            System.out.println("3. Listar Maestros");
            System.out.println("4. Registrar notas de alumnos");
            System.out.println("5. Listar alumnos por materia y notas");
            System.out.println("6. Salir");
            opcion1 = entrada.nextInt();
            if (opcion1<1 || opcion1>6){
                System.out.println("Opcion invalida");
                //salir=true;
            }
            switch (opcion1){
                case 1:
                    System.out.println("1. Registrar Empleado");
                    System.out.println("2. Listar Empleado");
                    System.out.println("3. Eliminar Empleado");
                    opcion2 = entrada.nextInt();
                    switch (opcion2){
                        case 1:
                            System.out.println("1. Registrando Empleado");
                            empleado1.registrarUsuario();
                            break;
                        case 2:
                            System.out.println("2. Listando Empleado");
                            empleado1.mostrarUsuario();
                            break;
                        case 3:
                            System.out.println("3. Eliminando Empleado");
                            empleado1.eliminarUsuario();
                            break;
                    }
                break;
                case 2:
                    System.out.println("1. Registrar Estudiante");
                    System.out.println("2. Listar Estudiante");
                    System.out.println("3. Eliminar Estudiante");
                    opcion3 = entrada.nextInt();
                    switch (opcion3){
                        case 1:
                            System.out.println("1. Registrando Estudiante");
                            //Implementar metodo
                            break;
                        case 2:
                            System.out.println("2. Listando Estudiante");
                            //Implementar metodo
                            break;
                        case 3:
                            System.out.println("3. Eliminando Empleado");
                            //Implementar metodo
                            break;
                    }
                break;
                case 3:
                    System.out.println("Listar Maestros");
                    //Implementar metodo
                    break;
                case 4:
                    System.out.println("Registrar notas de alumnos");
                    //Implementar metodo
                    break;
                case 5:
                    System.out.println("Listar alumnos por materia y notas");
                    //Implementar metodo
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo numeros entre 1 y 6");
            }
        }

        /*Empleado empleado1 = new Empleado();
        empleado1.registrarUsuario();
        empleado1.mostrarUsuario();*/

        /*empleado1.eliminarUsuario();*/
        /*Materia materia1 = new Materia();
        materia1.listarEmpleados();*/




    }
}
