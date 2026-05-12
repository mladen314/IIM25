package projekatVukDelibasic;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class projekat {

    public static void main(String[] args) {

        ArrayList<Integer> slucajniBrojevi = new ArrayList<Integer>();

        popuniBrojevima(slucajniBrojevi, 10);

        ArrayList<Integer> parniBrojevi = new ArrayList<Integer>();
        ArrayList<Integer> neparniBrojevi = new ArrayList<Integer>();

        razvrstajBrojeve(slucajniBrojevi, parniBrojevi, neparniBrojevi);

        ispisiBrojeve(slucajniBrojevi, parniBrojevi, neparniBrojevi);
    }

    public static void popuniBrojevima(ArrayList<Integer> lista, int brojClanova) {

        Random random = new Random();

        for (int i = 0; i < brojClanova; i++) {

            lista.add(random.nextInt(100));
        }
    }

    public static void razvrstajBrojeve(ArrayList<Integer> sviBrojevi,
                                        ArrayList<Integer> parni,
                                        ArrayList<Integer> neparni) {

        for (int i = 0; i < sviBrojevi.size(); i++) {

            int broj = sviBrojevi.get(i);

            if (broj % 2 == 0) {

                parni.add(broj);

            } else {

                neparni.add(broj);
            }
        }
    }

    public static void ispisiBrojeve(ArrayList<Integer> svi,
                                     ArrayList<Integer> parni,
                                     ArrayList<Integer> neparni) {

        System.out.println("Svi brojevi:");
        System.out.println(svi);

        System.out.println();

        System.out.println("Parni brojevi:");
        System.out.println(parni);

        System.out.println("Najveci parni broj:");
        System.out.println(Collections.max(parni));

        System.out.println("Najmanji parni broj:");
        System.out.println(Collections.min(parni));

        System.out.println();

        System.out.println("Neparni brojevi:");
        System.out.println(neparni);

        System.out.println("Najveci neparni broj:");
        System.out.println(Collections.max(neparni));

        System.out.println("Najmanji neparni broj:");
        System.out.println(Collections.min(neparni));
    }
}