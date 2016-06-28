import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by saim on 10/05/16.
 */
public class FileFinder {
    public List<File> findFiles(String directory){
        File dir = new File(directory);
        List<File> files = new ArrayList<File>();
        findFiles(dir, files);

        if (dir.exists() && dir.isDirectory()){
            findFiles(dir, files);
        }else System.out.println(directory + " existiert nicht oder ist kein Verzeichnis!");
        return files;
    }

    private void findFiles(File dir, List<File> files){
        for (File f : dir.listFiles()) {
            if (!f.isDirectory()){
                files.add(f);
            } else {
                findFiles(f, files);
            }
        }
    }
}
