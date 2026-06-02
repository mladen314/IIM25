package domaci_gordic;

import java.util.*;

public class gordic {
    public static void main(String[] args)
    {
        ArrayList<String> imena = new ArrayList<>();

        dodajImena(imena);
        pokaziListu(imena);

        obrisiDuplo(imena);
        sortirajListu(imena);

        pokaziListu(imena);
    }

    public static void dodajImena(ArrayList<String> lista)
    {
        String[] imena = {"Marko", "Vuk", "Dusan", "Smesko", "Cundere"};
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            lista.add(imena[random.nextInt(imena.length)]);
        }
    }

    public static void pokaziListu(ArrayList<String> lista)
    {
        System.out.println(lista);
    }

    public static void obrisiDuplo(ArrayList<String> lista)
    {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    lista.remove(j);
                    j--;
                }
            }
        }
    }

    public static void sortirajListu(ArrayList<String> lista)
    {
        Collections.sort(lista);
    }
}