import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(4);
        set.add(null);
        
        System.out.println(set);
    }
}