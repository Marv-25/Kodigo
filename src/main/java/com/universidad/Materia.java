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


    @Setter @Getter
    private String[] fechaInicio = {"30/06/2022","25/07/2022","15/08/2022","04/09/2022","12/10/2022","25/07/2022","03/03/2022","01/08/2022","07/10/2022"};

    @Setter @Getter
    private String[] fechaFin = {"01/12/2022","11/01/2023","20/12/2023","10/12/2022","03/11/2022","22/10/2022","20/08/2022","15/03/2023","10/06/2023"};


    @Setter @Getter
    private String[] maestroMateria = {"Fernando","Pedro","Juan","Ernesto","Maria","Lara","Clotilde","Diana","Margarita"};

    @Setter @Getter
    private String[] idMateria = {"M01","M02","M03","M04","M05","M06","M07","M08","M09"};

    @Setter @Getter
    private String[] nombreMateria =  {"Matematicas","Fisica","Economia","Filosofia","Ingles","Frances","Programacion","Bases de datos","TIC"};

    @Setter @Getter
    private String[] horario = {"3:00PM-4:00PM","10:00AM-11:00AM","7:00AM-9:00AM","4:00PM-6:00PM","7:00PM-8:00PM","2:00PM-3:00PM","7:00AM-8:00AM","3:00PM-4:00PM","10:00AM-11:00AM"};





    public void mostrarmaterias(){
        for (int i=0; i < idMateria.length; i++ ){
            System.out.println("Indice: "+  (i) +  " Codigo: " + idMateria[i] + " " + "Materia: " + nombreMateria[i] );

        }

    }



    public  void mostrarInfo() throws FileNotFoundException {


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
        float [] pointColumnWidth = {150F, 150F};
        Table tabla = new Table(pointColumnWidth);





           //Agregando datos a la tabla
           //primera fila
           Cell cell1 = new Cell();
           cell1.add("ID de la materia");
           tabla.addCell(cell1);

           Cell cell2 = new Cell();
           cell2.add(idMateria[nmateria]);
           tabla.addCell(cell2);


           //segunda fila
           Cell cell3 = new Cell();
           cell3.add("Materia");
           tabla.addCell(cell3);

           Cell cell4 = new Cell();
           cell4.add(nombreMateria[nmateria]);
           tabla.addCell(cell4);

           //tercera fila
           Cell cell5 = new Cell();
           cell5.add("Maestro");
           tabla.addCell(cell5);

           Cell cell6 = new Cell();
           cell6.add(maestroMateria[nmateria]);
           tabla.addCell(cell6);

           //cuarta fila
           Cell cell7 = new Cell();
           cell7.add("Horario");
           tabla.addCell(cell7);

           Cell cell8 = new Cell();
           cell8.add(horario[nmateria]);
           tabla.addCell(cell8);

           //quinta fila
           Cell cell9 = new Cell();
           cell9.add("Fecha de inicio");
           tabla.addCell(cell9);

           Cell cell10 = new Cell();
           cell10.add(fechaInicio[nmateria]);
           tabla.addCell(cell10);

           //sexta fila
           Cell cell11 = new Cell();
           cell11.add("Fecha de finalizacion");
           tabla.addCell(cell11);

           Cell cell12 = new Cell();
           cell12.add(fechaFin[nmateria]);
           tabla.addCell(cell12);

           documento.add(tabla);

           documento.close();

           entrada.close();

           System.out.println("Documento PDF creado");


    }









}
