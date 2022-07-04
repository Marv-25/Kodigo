package com.universidad;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Menus{
    public Menus() {
        empleado1 = new Empleado();
    }

    Empleado empleado1;
    Materia materia1;

    public void MenudeMenus() throws FileNotFoundException {
        Scanner scn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        Materia materia = new Materia();
        while(!salir){

            System.out.println("1. Empleado  1");
            System.out.println("2. Materia 2");
            System.out.println("3. Estuadiante 3");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = scn.nextInt();
            if(opcion == 1 )
                Menuempleado();
           if(opcion == 2 ){
               Menumateria();

           }
               // if(opcion == 3 )


        }

    }



    public void Menuempleado(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
         materia1 = new Materia(empleado1.getEmpleadosList());
        while(!salir){

            System.out.println("1. Registrar Empleado  1");
            System.out.println("2. Mostrar Empleado 2");
            System.out.println("3. Mostrar Maestros 3");
            System.out.println("4. Eliminar Usuario 4");
            System.out.println("5. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            if(opcion == 1 )
                empleado1.registrarUsuario();
            if(opcion == 2 )
                empleado1.mostrarUsuario();
            if(opcion == 3 )
                materia1.mostrarmaestros();
            if(opcion == 4)
                empleado1.eliminarUsuario();
            if(opcion == 5)
                salir = true;

        }
    }

    public void Menumateria() throws FileNotFoundException {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        materia1 = new Materia(empleado1.getEmpleadosList());
        while(!salir){

            System.out.println("1. Mostrar maestros 1");
            System.out.println("2. Mostrar info 2");
            System.out.println("3. Mostrar Materias 3");
            System.out.println("4. Eliminar Usuario 4");
            System.out.println("5. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            if(opcion == 1 )
                materia1.mostrarmaestros();
            if(opcion == 2 )
               materia1.mostrarInfo();
            if(opcion == 3 )
                materia1.mostrarmaterias();
            if(opcion == 4)
                empleado1.eliminarUsuario();
            if(opcion == 5)
                salir = true;

        }
    }
}
