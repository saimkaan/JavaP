/**
 * Created by saim on 26/04/16.
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {

//        List
        List<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Asd");
        list.add("ASdasd");
        System.out.println(list);


//        Set
        Set<String> set = new HashSet<String>();
        set.add("Hallo");
        set.add("Asd");
        set.add("ASdasd");
        System.out.println(set);

//        Map
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("Eins", 1);
        map.put("Zwei", 2);
        map.put("Drei", 3);
        System.out.println(map);
        System.out.println(map.get("Zwei"));
    }
}
