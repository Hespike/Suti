/*A kapott érték nem jó. Valuta vagy hasonló tárolására nem érdemes floatot vagy doublet haszálni. */

public class Suti {

    public static void main(String[] args) {
        double penzunk = 1.00;
        int megvettSutik = 0;
        for (double ar = 0.1; penzunk >= ar; ar += 0.1) {
            penzunk -= ar;
            ++megvettSutik;
        }
        System.out.println("Megvett sütik: " + megvettSutik);
        System.out.println("Megmaradt pénz: " + penzunk);
    }
}
