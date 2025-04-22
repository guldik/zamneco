public class Tester extends Zamestnanec {
    private int chyb = 0;

    public Tester(String jmeno, String prijmeni, String pozice, int plat, int chyb) {
        super(jmeno, prijmeni, pozice, plat);
    }
    public void naselJsemChybu(){
        System.out.println(chyb+1);
    }

}

