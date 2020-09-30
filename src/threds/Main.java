package threds;

import lesson16.CopyFiles3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        CopyFile task1 = new CopyFile();
        task1.setCopyFrom("C:\\Users\\pc\\Desktop\\GeekBrains Java\\Урок 1. Базовые понятия.mp4");
        task1.setCopyTo("C:\\Users\\pc\\Desktop\\GeekBrains Java\\okp.mp4");

        CopyFile task2 = new CopyFile();
        task2.setCopyFrom("C:\\Users\\pc\\Desktop\\GeekBrains Java\\Урок 2. Типы данных.mp4");
        task2.setCopyTo("C:\\Users\\pc\\Desktop\\GeekBrains Java\\lijij.mp4");

        CopyFile task3 = new CopyFile();
        task3.setCopyFrom("C:\\Users\\pc\\Desktop\\GeekBrains Java\\Урок 3.mp4");
        task3.setCopyTo("C:\\Users\\pc\\Desktop\\GeekBrains Java\\uuu.mp4");

        CopyFile task4 = new CopyFile();
        task4.setCopyFrom("C:\\Users\\pc\\Desktop\\GeekBrains Java\\Урок 4. Введение в ООП\\lklk.mp4");
        task4.setCopyTo("C:\\Users\\pc\\Desktop");

        CopyWithJavaa7 copyUtils = new CopyWithJavaa7();
        task1.setFileCopyUtils(copyUtils);
        task2.setFileCopyUtils(copyUtils);
        task3.setFileCopyUtils(copyUtils);
        task4.setFileCopyUtils(copyUtils);

        FIndTask task5 = new FIndTask();
        try {
            task5.setDirectory("C:\\Users\\pc\\Desktop");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        task5.setFileNameSearchString(".mp4");
        task5.setPrintStream(System.out);

        TaskStorageImpl storage = new TaskStorageImpl();
        storage.add(task5);
        storage.add(task4);
        storage.add(task3);
        storage.add(task2);
        storage.add(task1);


        TaskExecutorImpl executor1 = new TaskExecutorImpl();
        TaskExecutorImpl executor2 = new TaskExecutorImpl();
        TaskExecutorImpl executor3 = new TaskExecutorImpl();

        executor1.setStorage(storage);
        executor2.setStorage(storage);
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}
