import java.util.Scanner;

public class Zamestnanec {

    public String jmeno;
    public String prijmeni;
    public String pozice;
    public int plat;


    public Zamestnanec(String jmeno, String prijmeni, String pozice, int plat) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pozice = pozice;
        this.plat = plat;
    }

    public void vypisInfo() {
        System.out.println("Jmeno: " + jmeno);
        System.out.println("Prijmeni: " + prijmeni);
        System.out.println("Pozice: " + pozice);
        System.out.println("Plat: " + plat);
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setPozice(String pozice) {
        this.pozice = pozice;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getPozice() {
        return pozice;
    }

    public int getPlat() {
        return plat;
    }
}