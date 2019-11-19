package home;

import com.sun.codemodel.internal.JArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Filewalker {

    public static void main(String[] args) {

        Filewalker fw = new Filewalker();
        File root = new File(System.getProperty("user.dir"));
        fw.walk(root.getAbsolutePath());
        String[] new_name;
        String target;

        while(true) {
            System.out.println("Enter a command:");
            Scanner sc = new Scanner(System.in);
            String c = sc.nextLine();
            String[] input = c.split(" ");
            if(input.length>0){
                String cmd = input[0];
                switch (cmd) {
                    case "cd":
                        if(input.length < 1){
                            System.err.println("Wrong amount of input parameters. Example: cd <folder_name>");
                            break;
                        }
                        new_name = Arrays.copyOfRange(input,1, input.length);
                        target = String.join(" ", new_name);;
                        if(target == "..") {
                            root = new File(root.getParent());
                        } else if(target == "/") {
                            root = new File("/");
                        } else {
                            root = new File(root.getAbsolutePath()+ File.separator + target);
                        }
                        System.out.println( "Current dir:" + root.getAbsoluteFile() + "\n" );

                        break;
                    case "ls":
                        fw.walk(root.getAbsolutePath());
                        break;
                    case "show":
                        if(input.length < 1){
                            System.err.println("Wrong amount of input parameters. Example: cd <folder_name>");
                            break;
                        }
                        new_name = Arrays.copyOfRange(input,1, input.length);
                        target = String.join(" ", new_name);
                        try {
                            Scanner scanner = new Scanner(new File(root.getAbsolutePath()+ File.separator + target));
                            scanner.useDelimiter("\\Z");
                            System.out.println(scanner.next());
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    default:
                        break;
                }
            }
        }
    }

    public void walk( String path ) {

        File root = new File( path );
        File[] list = root.listFiles();
        System.out.println( "Current dir:" + root.getAbsoluteFile() + "\n" );
        for ( File f : list ) {
            if ( f.isDirectory() && !f.isHidden()) {
                //walk( f.getAbsolutePath() );
                System.out.println(  f.getName()+"/" );
            }
        }

        for ( File f : list ) {
            if (!f.isDirectory() && !f.isHidden()) {
                System.out.println(f.getName() );
            }
        }

    }
}