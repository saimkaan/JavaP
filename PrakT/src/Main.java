import java.util.HashSet;
import java.util.Set;

/**
 * Created by saim on 03/05/16.
 */
public class Main {
    public static void main(String[] args) {
//        String s = "hallo";
//        System.out.println(s.hashCode());
//
//        Object o = new Object();
//        System.out.println(o.hashCode());


        Set<String> strings = new HashSet<>();

        String s1 = "hallo";
        String s2 = "hallo";

        strings.add(s1);
        strings.add("sdfgsd");
        strings.add(s2);
        System.out.println(strings);
    }
}
