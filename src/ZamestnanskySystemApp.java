import java.util.List;

public class ZamestnanskySystemApp {
    public static void main (String [] args){

        Zamestnanec zamestnanec = new Zamestnanec("jozin", "zbaznin", "smetak", 100);
        zamestnanec.vypisInfo();
        Manager manager = new Manager("kamil", "smetana", "smetak2", 120,5);
        manager.vypisInfo();
        Vyvojar vyvojar = new Vyvojar("liboor","vcelka","bohac",500,"C++");
        vyvojar.vypisInfo();
        Tester tester = new Tester("ondy","musil","bezdak",5,6);
        tester.vypisInfo();

        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();

        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();
        tester.naselJsemChybu();

        tester.vypisInfo();
    }
}
