public class ZamestnanskySystemApp (){
    public static void main (String [] args){
        Zamestnanec zamestnanec = new Zamestnanec("jozin", "zbaznin", "smetak", 100);
        zamestnanec.vypisInfo();
        Manager manager = new Manager("kamil", "jejda", "smetak2", 120,5);
        manager.vypisInfo();
        Vyvojar vyvojar = new Vyvojar("liboor","yum","bohac",500,);
        vyvojar.vypisInfo();
        Tester tester = new Tester("ondy","musil","bezdak",5,);
        tester.vypisInfo();


    }
}
