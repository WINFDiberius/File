package FileinputDemo;

import java.io.File;

public class Ouput {

    public static void main(String[] args) {

        File f1 = new File("C:\\Ordner\\");

        System.out.println("Gesamtgröße der Datei: " + DemoFile.printAndGetSize(f1));

        System.out.println();

        File f2 = new File("C:\\Campus02\\Java\\ErweiterteThemenDerSoftwareEntwicklung\\Download\\bilder\\ets.jpg");

        System.out.println("Gesamtgröße der Dateien: " + DemoFile.printAndGetSize(f2));


    }


}
