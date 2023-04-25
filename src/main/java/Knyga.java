public class Knyga {
    //Sukurkite klasę Knyga, turinčią privačias savybes pavadinimas, autorius, isbn ir puslapiuSkaicius.
    // Klasė turi turėti set ir get metodus kiekvienai savybei.
    // Taip pat parašykite metodą arGeraKnyga(), kuris grąžintų true,
    // jei knygos puslapių skaičius yra didesnis nei 200, ir false, jei ne.
    private String pavadinimas;
    private String autorius;
    private int isbn;
    private int puslapiuSkaicius;

    public void setPavadinimas(String knygosPavadinimas){
        this.pavadinimas = knygosPavadinimas;
    }
    public void getPavadinimas(){
        System.out.println("knygos pavadinimas: " + pavadinimas);
    }
    public void setAutorius(String knygosAutorius){
        this.autorius = knygosAutorius;
    }
    public void getAutorius(){
        System.out.println("Knygos autorius: " + autorius);
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    public void getIsbn(){
        System.out.println("Isbn " + isbn);
    }
    public void setPuslapiuSkaicius(int knygosPuslapiuSkaicius){
        this.puslapiuSkaicius= knygosPuslapiuSkaicius;
    }
    public int getPuslapiuSkaicius(){
        return this.puslapiuSkaicius;
    }
    public boolean arGeraKnyga(){
        if (this.puslapiuSkaicius>=200){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        Knyga manoKnyga = new Knyga();
        manoKnyga.setPavadinimas ("kepiniai");
        manoKnyga.getPavadinimas();
        manoKnyga.setAutorius("Raimonda");
        manoKnyga.getAutorius();
        manoKnyga.setIsbn(1234567);
        manoKnyga.getIsbn();
        manoKnyga.setPuslapiuSkaicius(344);
        System.out.println("puslapiu skaicius " + manoKnyga.getPuslapiuSkaicius());
        System.out.println("knygoje daugiau nei 200 puslapiu: " + manoKnyga.arGeraKnyga());
    }
}
