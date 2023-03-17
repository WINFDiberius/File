package StringOutputDemoApp;

import java.io.*;

public class StringOuputDemo {

    public static void main(String[] args) {

        File f = new File("C:\\Campus02\\Java\\ErweiterteThemenDerSoftwareEntwicklung\\Download\\dokumente\\demo.txt");

        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            String helloWorld = "Hello World";

            oos.writeObject(helloWorld);
            oos.flush();
        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }

    }

}
