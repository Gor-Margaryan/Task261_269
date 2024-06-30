package petqa;

import java.util.Scanner;

public class Sportsmeni {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Gri anunt");
        String anun = s.next();
        System.out.println("Gri azganunt");
        String azganun = s.next();
        System.out.println("Gri tariqt");
        int tariq = s.nextInt();
        System.out.println("Gri qaxaqt");
        String qaxaq = s.next();
        System.out.println("Gri andznakan qasht");
        float andznakanQash = s.nextFloat();

        Sportsmen K1 = new Sportsmen();
        K1.setAnun(anun);
        K1.setAzganun(azganun);
        K1.setTariq(tariq);
        K1.setQaxaq(qaxaq);
        K1.setAndznakan_qash(andznakanQash);

        K1.Tvyalner();


    }
}
