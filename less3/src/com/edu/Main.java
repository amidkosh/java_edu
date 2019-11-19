package com.edu;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
//        File file = new File("myFile.txt");
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        File secFile = new File("secFIle.txt");
//            file.renameTo(secFile);

//        write();

//        write_via_stream(file);

//        stream(file);

        Path path = Paths.get("myFile.nio");
        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path pathDestination = Paths.get("myFileDestination.nio");
        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        };
        //------------------------
        try {
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //------------------------
        try {
            Files.move(path, pathDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void stream(File file) {
        try (FileInputStream fis = new FileInputStream((file));) {

            byte[] bytes = new byte[1024];
            fis.read(bytes);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(RandomAccessFile raf = new RandomAccessFile(file, "r");){
            raf.seek(0);
            byte[] bytes = new byte[100];
            raf.read(bytes);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write_via_stream(File file) {
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.seek(file.length());
            raf.write(" 3434".getBytes());
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        try {
            FileOutputStream fos = new FileOutputStream(new File("myNewFile.txt"));
//            byte[] bytes = new byte
            fos.write("Hello dfkngfkn. I'm java".getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
