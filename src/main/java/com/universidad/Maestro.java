package com.universidad;

import java.util.ArrayList;
import java.util.List;

public class Maestro {

    public void identificarmaestros() {
        List<Empleado> Maestros = new ArrayList<>();

        for (int i = 0; i < BdEmpleados.listarEmpleados().size(); i++ ){
            if (BdEmpleados.listarEmpleados().get(i).rol .equals("MAESTRO")){
                Maestros.add(BdEmpleados.listarEmpleados().get(i));
            }
        }
        System.out.println(Maestros);
    }


    

}
