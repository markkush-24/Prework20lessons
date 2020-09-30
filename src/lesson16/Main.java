package lesson16;

import org.w3c.dom.xpath.XPathNamespace;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\pc\\Desktopsddsdf");
        if (!startDir.exists()){
            startDir.mkdir();
        }
        File dir = new File("C:\\Users");
        File[]allFilesFromDir = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if(file.isDirectory()){

                }
                return false;
            }
        });
        for (File f:allFilesFromDir) {
            System.out.println(f.getAbsolutePath());
        }
    }

}
