import java.io.IOException;

public class Counter implements AutoCloseable {

    public static int counter = 1;

    public static void add() throws IOException {
        counter++;
        throw new IOException();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Counter stopped");
    }
}
