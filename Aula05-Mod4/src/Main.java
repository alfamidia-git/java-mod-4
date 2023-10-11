import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> turma = new TreeMap<>(); // instanciando um objeto Map

        turma.put("000.000.111-33", "Fulano");
        turma.put("111.000.123-56", "Fulano");

        System.out.println("Turma MAP");
        System.out.println(turma);

        Set<String> values = new HashSet<>( turma.values() );
        System.out.println("Set Values");
        System.out.println(values);


        Set<Integer> set = new HashSet<>();
    }
}