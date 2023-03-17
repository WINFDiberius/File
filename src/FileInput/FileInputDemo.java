package FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Campus02\\Java\\ErweiterteThemenDerSoftwareEntwicklung\\Download\\dokumente\\demo.txt");

        if(!file.exists())
        {
            System.out.println("Datei existiert nicht ...");
            return;
        }

            int count = 0;
            FileInputStream fis = new FileInputStream(file);
            int byteRead;
            while((byteRead = fis.read()) != -1)
            {
                count++;
                char[] chars = Character.toChars(byteRead);
                System.out.println("char [" + count + "] " + chars[0]);
            }
            System.out.println(count);



            fis.close();




    }

}
