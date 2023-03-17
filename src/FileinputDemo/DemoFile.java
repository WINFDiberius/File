package FileinputDemo;

import java.io.File;

public class DemoFile {


    public static long printAndGetSize(File f) {
        long totalSize = 0;

        if(f.exists() == false)
            return 0;

        if(f.isFile())
        {
            System.out.println(f.getName() + " | " + f.length());
            return f.length();
        }


        File[] files = f.listFiles();
        for (File file : files) {
                System.out.println(file.getName() + " | " + file.length());
                totalSize += file.length();

                if(file.isDirectory())
                {
                    totalSize += printAndGetSize(file);
                }
        }
        return totalSize;
    }
}

