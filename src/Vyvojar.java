import java.util.List;

public class Vyvojar extends Zamestnanec{
    private String jazyky;

    public Vyvojar(String jmeno, String prijmeni, String pozice, int plat, List<String> jazyky) {
        super(jmeno, prijmeni, pozice, plat);
        this.jazyky = jazyky;
    }
    public void vypisInfo(){
        System.out.println(jmeno + " " + prijmeni + " s pozici " + pozice + " ma plat " + plat + " kc. jazyky " + jazyky);
}
}
