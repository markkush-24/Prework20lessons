package threds;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyWithJavaa7 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        Path pathSource = Paths.get(source);
        Path pathDest = Paths.get(destination);
        if (Files.exists(pathDest))
            throw new FileAlreadyExistsException("Путь куда мы пытаемся скопировать файл - уже занят");

        try {
            Files.copy(pathSource, pathDest);
        }  catch (Exception e) {
           throw new FileCopyFailedException("Упс! Что-то пошло не так при копировании");
        }
    }
}
