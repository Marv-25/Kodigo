package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.*;

public class Empleado extends Usuario {//implements Persona, displayUsuarios{
    @Setter
    @Getter
    double salario;
    @Setter
    @Getter
    String rol;
    @Setter
    @Getter
    String cuentaBancaria;
    @Setter
    @Getter
    String profesion;
    @Setter @Getter
    String fechaInicio;
    @Setter @Getter
    String fechaFin;
    @Setter @Getter
    String horarioMateria;
    @Setter @Getter
    String idMateria;
     @Setter @Getter
    String materia;
    public Empleado(int idUsuario, String nombre, String apellido, String sexo, String fechaNacimiento,
                    String statusUsuario, double salario, String rol, String cuentaBancaria, String profesion,String materia,String fechaInicio, String fechaFin, String horarioMateria, String idMateria) {
        super(idUsuario, nombre, apellido, sexo, fechaNacimiento, statusUsuario);
        this.salario = salario;
        this.rol = rol;
        this.cuentaBancaria = cuentaBancaria;
        this.profesion = profesion;
        this.materia = materia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horarioMateria = horarioMateria;
        this.idMateria = idMateria;

    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" +'\n'+
                "ID Usuario= " + idUsuario +'\n'+
                "nombre= " + nombre + '\n' +
                "apellido= " + apellido + '\n' +
                "sexo= " + sexo + '\n' +
                "Fecha de nacimiento= " + fechaNacimiento +'\n'+
                "Status= " + statusUsuario + '\n' +
                "salario= " + salario + '\n' +
                "rol= " + rol + '\n' +
                "cuenta Bancaria= " + cuentaBancaria + '\n' +
                "Profesion= " + profesion + '\n' +
                '}';
    }

    Scanner entrada = new Scanner(System.in);

    @Setter @Getter
    private List<Empleado> empleadosList = new ArrayList<>();



    @Override
    public ArrayList registrarUsuario() {
        int listSize = empleadosList.size();
        System.out.println("Cantidad de empleados a registrar");
        listSize = entrada.nextInt();
        for (int i = 0; i < listSize; i++) {
            System.out.println(i + 1);
            System.out.println("ID asignado");
            int id = (int) (Math.random() * 10000);
            System.out.println(id);
            entrada.nextLine();
            System.out.println("Nombre del empleado");
            String nombre = entrada.nextLine();
            System.out.println("Apellido del empleado");
            String apellido = entrada.nextLine();
            System.out.println("Ingresar sexo del empleado(FEM o MAS)");
            String sexo = entrada.nextLine();System.out.println("Fecha de nacimiento");
            String fechaNacimiento = entrada.nextLine();
            System.out.println("Status del empleado");
            String status = entrada.nextLine();
            System.out.println("Salario del empleado");
            double salario = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Cuenta Bancaria del empleado");
            String cuentaBancaria = entrada.nextLine();
            System.out.println("Profesion del empleado");
            String profesion = entrada.nextLine();
            System.out.println("Rol del empleado");
            String rol = entrada.nextLine();
            if(rol.equals("Maestro") ){
                System.out.println("Materia que imparte");
                String materia1 = entrada.nextLine();
                System.out.println("Fecha de inicio");
                String fechaInicio1 = entrada.nextLine();
                System.out.println("Fecha de finalizacion");
                String fechaFin1 = entrada.nextLine();
                System.out.println("Codigo de la materia");
                String idMateria1 = entrada.nextLine();
                System.out.println("Horario de la materia");
                String horarioMateria1 = entrada.nextLine();

                entrada.nextLine();
                Empleado empleadoNuevo = new Empleado(id, nombre, apellido, sexo, fechaNacimiento, status, salario, rol,
                        cuentaBancaria, profesion, materia1,fechaInicio1, fechaFin1,horarioMateria1,idMateria1);
                empleadosList.add(empleadoNuevo);

            }
            else {
                String materia = "";
            }
            entrada.nextLine();
          /*  Empleado empleadoNuevo = new Empleado(id, nombre, apellido, sexo, fechaNacimiento, status, salario, rol,
                    cuentaBancaria, profesion, materia1,fechaInicio1, fechaFin1,horarioMateria1,idMateria1);
            empleadosList.add(empleadoNuevo);*/
        }
        return (ArrayList) empleadosList;
    }

    public ArrayList mostrarUsuario() {
        for (int i = 0; i < empleadosList.size(); i++) {
            System.out.println(i + 1);
            System.out.println(empleadosList.get(i));
        }

        return (ArrayList) empleadosList;
    }

    public void eliminarUsuario(){
        System.out.println("Indique el indice del empleado a eliminar");
        int indice = entrada.nextInt();
        empleadosList.remove(indice-1);
        Iterator iterador = empleadosList.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
}
