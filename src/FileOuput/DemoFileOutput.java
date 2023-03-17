package FileOuput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileOutput {
    public static void main(String[] args) {
        File f = new File("C:\\Campus02\\Java\\ErweiterteThemenDerSoftwareEntwicklung\\Download\\dokumente\\demo.txt");


        try(FileOutputStream fos = new FileOutputStream(f))
        {

            String demo = "Wir haben die Intensivwoche bald hinter uns :-)!";
            char[] arrayOfChars = demo.toCharArray();
            for(char c : arrayOfChars)
            {
                fos.write((int) c);
            }

            fos.flush();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
