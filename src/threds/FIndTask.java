package threds;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FIndTask extends TaskImpl implements FindFilesTask {


    private String directory;
    private String searchString;
    private PrintStream out;



    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        if (directory == null) {
            throw new NullPointerException("не указана директория");
        }
        File file = new File(directory);
        if (!file.exists()) {
            throw new FileNotFoundException("По указанному пути не существует папки");
        }
        if (!file.isDirectory()) {
            throw new FileNotFoundException("По указанному пути не папка , а файл");
        }
        this.directory = directory;

    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        if (searchString == null) {
            throw new IllegalArgumentException("не установлено слово для поиска");
        }
this.searchString = searchString;
    }
        @Override
        public void setPrintStream (PrintStream out){
            this.out = out;


        }

        @Override
        public void execute () throws TaskExecutionFailedException {
            if (directory == null) {
                throw new TaskExecutionFailedException("не указана директория");
            }
            File dir = new File(directory);
            if (!dir.exists()) {
                throw new TaskExecutionFailedException("По указанному пути не существует папки");
            }
            if (!dir.isDirectory()) {
                throw new TaskExecutionFailedException("По указанному пути не папка , а файл");
            }
            File [] files = dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    if(file.getName().contains(searchString)){
                        return true;
                    }
                    return false;

                }
            });
            out.println("Результат выполненной задачи: ------");
            for (File file:files) {
             out.println(file.getAbsolutePath());
            }
        }

    }
