package demo1;

import java.util.HashSet;
import java.util.Set;

public class names<String> {
    private Set<String> name = new HashSet<>();

    public void add(String name) {
        name.add(name);
    }

    @Override
    public java.lang.String toString() {
        return "saxeli" + name;
    }
}
