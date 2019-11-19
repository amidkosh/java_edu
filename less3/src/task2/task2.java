package task2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class task2 {
    public static void main(String[] args) {
        Path dir = Paths.get("tmp");
        try {
            Files.createDirectory(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path[] list = new Path[10];
        for(int i=0;i<10;i++){
            list[i] = Paths.get(dir.getFileName()+"/file"+i+".nio");
            if(list[i].toFile().exists()){
                continue;
            }
            try {
                Files.createFile(list[i]);
                File file = list[i].toFile();
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(("Hello dfkngfkn. I'm java "+i).getBytes());
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for(int i=0;i<10;i++){
            if (i%2 == 0 ){
                File f = list[i].toFile();
                f.delete();
            }
        }
    }
}
