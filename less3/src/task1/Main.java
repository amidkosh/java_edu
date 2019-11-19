package task1;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String str = "is that on the left hand side, you are using the generic type List<String> where on the right side you are using the raw type LinkedList. Raw types in Java effectively only exist for compatibility with pre-generics code and should never be used in new code unless you absolutely have to."+
                    "Now, if Java had generics from the beginning and didn't have types, such as LinkedList, that were originally created before it had generics, it probably could have made it so that the constructor for a generic type automatically infers its type parameters from the left-hand side of the assignment if possible. But it didn't, and it must treat raw types and generic types differently for backwards compatibility. That leaves them needing to make a slightly different, but equally convenient, way of declaring a new instance of a generic object without having to repeat its type parameters... the diamond operator.";

        File file = new File("tets.txt");
        try (
                FileOutputStream fos = new FileOutputStream(file);
                FileOutputStream foss = new FileOutputStream(new File("test.txt"));
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
            ) {
            fos.write(str.getBytes());
            short startPos = (short) (raf.length()/2-5);
            System.out.println(String.valueOf(raf.length()));
            System.out.println(String.valueOf(startPos));
            byte[] bytes = new byte[10] ;
            raf.seek(startPos+40);
            raf.read(bytes);

//            raf.seek(startPos);
//            raf.read(bytes);

            foss.write(bytes);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
