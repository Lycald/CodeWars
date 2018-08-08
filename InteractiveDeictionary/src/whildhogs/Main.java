package whildhogs;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Dictionary d = new Dictionary();
        d.newEntry("Kot", "bysle co");

        System.out.println(d.look("kot"));
        System.out.println(d.look("Kot"));

    }
}

class Dictionary{
    Map<String, String> dictionary = new HashMap<>();

    public void newEntry(String name, String description){
        dictionary.put(name, description);
    }

    public String look(String name){
        Optional<String> optional = dictionary.entrySet().stream().filter(d -> d.getKey().equals(name)).map(d -> d.getValue()).findAny();
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Cant find entry for " + name;
        }
    }

}
