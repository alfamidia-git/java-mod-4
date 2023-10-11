import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Fulano");
        nomes.add("Beltrano");
        nomes.add("Ciclano");
        nomes.add("Maria");
        nomes.add("Marina");
        nomes.add("Ana");

        System.out.println(nomes);
        System.out.println();
        boolean existe = nomes.contains("Ana");

        if(existe){
            System.out.println("O nome Ana está presente");
        }
        System.out.println();

        nomes.remove(4);

        System.out.println(nomes);

        System.out.println();
        nomes.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(nomes);

        System.out.println();


        List<String> sublista = nomes.subList(0, nomes.size()-2);

        System.out.println("Sublista");

        System.out.println(sublista);

        System.out.println();

        nomes.clear();

        System.out.println(nomes);
    }
}