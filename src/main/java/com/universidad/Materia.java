package com.universidad;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import lombok.Getter;
import lombok.Setter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Materia {

    public Materia() {
    }
    @Setter @Getter
    List<Empleado> empleadoList;

    List<Empleado> Maestros = new ArrayList<>();

    public  Materia(List<Empleado> empleadoList) {
    this.empleadoList = empleadoList;
        for(Empleado empleado1 : empleadoList){
            if (empleado1.getRol().equals("Maestro"))
                Maestros.add(empleado1);

        }
}


    public void mostrarmaestros(){


Empleado empleado = new Empleado();



        System.out.println(Maestros);
}

    public void mostrarmaterias(){
        for ( Empleado maestros  : Maestros ){
            int iteracion = 0;
            System.out.println( iteracion + " " + maestros.getNombre() );
            iteracion++;
        }
    }

    public  void mostrarInfo() throws FileNotFoundException {


        if (Maestros.size() != 0) {
            Scanner entrada = new Scanner(System.in);

            System.out.println(" ");
            System.out.println("Escriba el indice de la materia:");

            int nmateria = entrada.nextInt();

            //Crear pdf PdfWriter
            String dest = "C:/Pruebas/prueba.pdf";
            PdfWriter writer = new PdfWriter(dest);

            //Crear PdfDocument
            PdfDocument pdfDoc = new PdfDocument(writer);

            //Crear documento
            Document documento = new Document(pdfDoc);

            //creando tabla
            float[] pointColumnWidth = {150F, 150F};
            Table tabla = new Table(pointColumnWidth);
            int contador = 0;
            for (Empleado teacher : Maestros) {

                if (contador == nmateria) {

                    //Agregando datos a la tabla
                    //primera fila
                    Cell cell1 = new Cell();
                    cell1.add("ID de la materia");
                    tabla.addCell(cell1);

                    Cell cell2 = new Cell();
                    cell2.add(teacher.getMateria());
                    tabla.addCell(cell2);

                    //segunda fila
                    Cell cell3 = new Cell();
                    cell3.add("Materia");
                    tabla.addCell(cell3);

                    Cell cell4 = new Cell();
                    cell4.add(teacher.getMateria());
                    tabla.addCell(cell4);

                    //tercera fila
                    Cell cell5 = new Cell();
                    cell5.add("Maestro");
                    tabla.addCell(cell5);

                    Cell cell6 = new Cell();
                    cell6.add(teacher.getNombre());
                    tabla.addCell(cell6);

                    //cuarta fila
                    Cell cell7 = new Cell();
                    cell7.add("Horario");
                    tabla.addCell(cell7);

                    Cell cell8 = new Cell();
                    cell8.add(teacher.getHorarioMateria());
                    tabla.addCell(cell8);

                    //quinta fila
                    Cell cell9 = new Cell();
                    cell9.add("Fecha de inicio");
                    tabla.addCell(cell9);

                    Cell cell10 = new Cell();
                    cell10.add(teacher.getFechaInicio());
                    tabla.addCell(cell10);

                    //sexta fila
                    Cell cell11 = new Cell();
                    cell11.add("Fecha de finalizacion");
                    tabla.addCell(cell11);

                    Cell cell12 = new Cell();
                    cell12.add(teacher.getFechaFin());
                    tabla.addCell(cell12);


                }
                contador++;
            }
            documento.add(tabla);
            documento.close();
           // entrada.close();
            System.out.println("Documento PDF creado");
        }
        else  System.out.println("No hay usuarios registrados");
    }
}
