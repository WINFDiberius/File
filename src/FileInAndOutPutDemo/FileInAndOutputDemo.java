package FileInAndOutPutDemo;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileInAndOutputDemo {

    public static void main(String[] args){


        File doc = new File("C:\\Campus02\\Java\\ErweiterteThemenDerSoftwareEntwicklung\\Download\\dokumente\\demo.txt");


        int byteRead;
        try (FileInputStream fis = new FileInputStream(doc); FileOutputStream fos = new FileOutputStream(doc); BufferedInputStream bis = new BufferedInputStream(fis))
        {
            while((byteRead = System.in.read()) != 'x')
            {
                fos.write(byteRead);
            }
            fos.flush();
        }
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }
    }

}
