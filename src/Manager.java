public class Manager extends Zamestnanec{
    int pz;
    public Manager(String jmeno, String prijmeni, String pozice, int plat, int pz) {
        super(jmeno, prijmeni, pozice, plat);
        this.pz = pz;
    }
    public void vypisInfo(){
        System.out.println(jmeno + " " + prijmeni + " s pozici " + pozice + " ma plat " + plat + " kc. pocet: " + pz);
    }
    public int getPz() {return pz;}
    public void setPz(int pz) {this.pz = pz;}
}
