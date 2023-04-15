import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        try {
//            doSomething();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        try(Counter counter = new Counter()) {
//            counter.add();
//
//        } catch (Exception e) {
//            System.out.println("Ex");
//        }



//        try {
//            int a = 6;
//            int b = 0;
//            isValid(b);
//            System.out.println(a / b);
//        } catch (ZeroDivExcep ex) {
//            ex.printStackTrace();
//        }

//        try {
//            Integer[] arr = {null, 1};
//
//            if (arr[0] == null) {
//                throw new NullArray("Null array");
//            }
//
//            System.out.println(arr[0]);
//        } catch (NullArray ex) {
//            ex.printStackTrace();
//        }

//        try {
//            File file = new File("123.txt");
//            if (!file.exists()) {
//                throw new NoFileExcep();
//            }
//            System.out.println("File exist");
//        } catch (NoFileExcep excep) {
//            excep.printStackTrace();
//        }


    }

    public static void isValid (int num) {
        if (num == 0) {
            throw new ZeroDivExcep();
        }

    }


    private static void rwLine(Path pathRead, Path pathWrite) {
        try(BufferedReader in = Files.newBufferedReader(pathRead);
            BufferedWriter out = Files.newBufferedWriter(pathWrite)){
            out.write(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doSomething() throws Exception {
        throw new Exception();
    }

    public static void checkMatrix(String[][] matrix) {
        if (matrix.length != 4 || matrix[0].length != 4) {
            throw new MyArraySizeException();
        }
    }


}
