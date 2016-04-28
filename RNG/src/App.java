import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by saim on 28/04/16.
 */
public class App {

    public static void main(String[] args) {
        Set<Integer> randoms = new TreeSet<Integer>();

        Random rnd = new Random(15652);

        while (randoms.size() < 25){
            randoms.add(rnd.nextInt(100));
        }

        System.out.println(randoms.size());
        for (Integer i: randoms
             ) {
            System.out.println(i);
        }
    }
}
