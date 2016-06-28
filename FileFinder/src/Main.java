import java.io.File;
import java.util.List;

/**
 * Created by saim on 10/05/16.
 */
public class Main {
    public static void main(String[] args) {
        FileFinder ff = new FileFinder();
        List<File> files = ff.findFiles("files");
        printList(files);
    }

    public static void printList(List<File> list) {
        for(File f : list){
            System.out.println(f);
        }

    }
}
