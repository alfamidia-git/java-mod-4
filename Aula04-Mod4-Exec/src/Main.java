import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(8);
        set.add(1);
        set.add(4);

        System.out.println(set);

        set.remove(8);
        System.out.println("Depois de remover");
        System.out.println(set);

        System.out.println("Adicionando mais números");
        set.add(20);
        set.add(50);
        set.add(60);

        System.out.println(set);

        System.out.println("Criando a cópia");
        Set<Integer> set2 = new HashSet<>(set);

        set.remove(1);
        set.remove(50);
        set.remove(4);

        System.out.println("Imprimindo cópia antes do retainAll");
        System.out.println(set2);

        set2.retainAll(set);

        System.out.println("Imprimindo cópia depois do retainAll");
        System.out.println(set2);

        set.clear();
        set2.clear();

        System.out.println("Imprimindo original depois do clear");
        System.out.println(set);

        System.out.println("Imprimindo cópia depois do clear");
        System.out.println(set2);
    }
}