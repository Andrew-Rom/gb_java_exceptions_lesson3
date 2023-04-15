public class NoFileExcep extends RuntimeException{

    public NoFileExcep() {
        super("file does not exist");
    }

}
