import java.util.*;

public class Contacts {

    private HashMap<String, HashSet<String>> chm = new HashMap<>();
    private HashSet<String> number_list;

    public Contacts() {
        this.add("Иванов", "8(800)200-40-40");
        this.add("Петров", "8(800)200-84-42");
    }

    public void add(String name, String number) {
        if (chm.containsKey(name)) {
            number_list = chm.get(name);
            number_list.add(number);
            chm.put(name, number_list);
        }
        else {
            number_list = new HashSet<>();
            number_list.add(number);
            chm.put(name, number_list);
        }
    }

    public HashSet<String> get(String name) {
        return chm.get(name);
    }

}
