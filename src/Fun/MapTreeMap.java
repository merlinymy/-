package Fun;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
public class MapTreeMap {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(3,"three");
        hm.put(1,"one");
        hm.put(4,"four");
        hm.put(2,"two");
        printMap(hm);
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(hm);
        printMap(treeMap);
    }//main

    public static void printMap(Map<Integer,String> map) {
        Set s = map.entrySet();
        Iterator it = s.iterator();
        while ( it.hasNext() ) {
            Map.Entry entry = (Map.Entry) it.next();
            Integer key = (Integer) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key + " => " + value);
        }//while
        System.out.println("========================");
    }//printMap

}//class
