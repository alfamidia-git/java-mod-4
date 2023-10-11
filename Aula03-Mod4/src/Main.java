import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] array = new String[2];

        array[0] = "teste";

        List<String> lista = new ArrayList<>();

        List<String> lista2 = new ArrayList<>();

        lista2.add("Java");
        lista2.add("Javascript");
        lista2.add("Computador");


        lista.add("Computador");//0
        lista.add("Cadeira gamer");//1
        System.out.println("-----ANTES------");
        System.out.println(lista);

        lista.retainAll(lista2);
        System.out.println("-----DEPOIS------");

        System.out.println(lista);

    }
}