package ar.org.casa.java.test;

import ar.org.casa.java.utils.files.FileText;
import ar.org.casa.java.utils.files.I_File;

public class TestFile {
    public static void main(String[] args) {
        String file = "texto.text";
        I_File ftext = new FileText(file);
        ftext.setText("Curso de Java\n");
        ftext.addpend("Lunes\n");
        ftext.addpend("Lunes\n");
        ftext.addpend("martes\n");
        ftext.addpend("Miercoles\n");
        ftext.addpend("Jueves\n");
        ftext.addpend("Viernes\n");
        ftext.addpend("Viernes\n");

        //System.out.println(ftext.getText());
        //ftext.print();
        ftext.getStream().forEach(System.out::println);
        System.out.println("*****filtrado*****");
        ftext.getByFilter("lu").forEach(System.out::println);
        System.out.println("*****lista ordenado alfabeticamente*****");
        ftext.getSortedLines().forEach(System.out::println);
        System.out.println("*****lista al reves**********");
        ftext.getReversedSortedLines().forEach(System.out::println);
        System.out.println("*****lista sin repeticiones**********");
        ftext.getLinkedHashSetLines().forEach(System.out::println);
    }
}
