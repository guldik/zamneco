public class Tester extends Zamestnanec {
    int chyb;

    public Tester(String jmeno, String prijmeni, String pozice, int plat, int chyb) {
        super(jmeno, prijmeni, pozice, plat);
        this.chyb = chyb;
    }
    public void naselJsemChybu(){
        chyb++;
        System.out.println("Chybu: " + chyb);

    }

    public void vypisInfo(){
        System.out.println(jmeno + " " + prijmeni + " s pozici " + pozice + " ma plat " + plat + " kc. chyb: " + chyb);
}
}

