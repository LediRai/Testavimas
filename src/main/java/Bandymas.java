public class Bandymas {
    String zodisAtmintyje; //atminties dalis kuomet kursim klase su konstruktorium i cia isirasys parametras kuri paduosim;
    int skaiciusAtmintyje;
    //----------------
    public Bandymas(String irasomasZodis, int skaicius) {
        // Bandymas= konstruktoriaus pavadinimas (irasomasZodis = parametras) {konstruktoriaus logika}
        this.zodisAtmintyje = irasomasZodis;
        this.skaiciusAtmintyje = skaicius;
    }
    public void pakeiciamSkaiciuAtmintyje(int betkas) {  //Metodas
        this.skaiciusAtmintyje += betkas;
    }
    public void atimamSkaiciu(int atimamasSkaicius) {  //Metodas
        this.skaiciusAtmintyje -= atimamasSkaicius;
    }
    public static void main(String[] args) {
        //Klasiu kurimas naudojant konstuktoriu
        Bandymas VisiskaiNeaisku = new Bandymas("nesuprantu", 8);
        Bandymas JauAisku = new Bandymas("pgaliau supratau", 10);


        System.out.println(VisiskaiNeaisku.zodisAtmintyje);
        System.out.println(VisiskaiNeaisku.skaiciusAtmintyje);
        VisiskaiNeaisku.pakeiciamSkaiciuAtmintyje(13); //Metodo pasaukimas
        System.out.println(VisiskaiNeaisku.skaiciusAtmintyje);

        System.out.println(JauAisku.zodisAtmintyje);
        System.out.println(JauAisku.skaiciusAtmintyje);
        JauAisku.pakeiciamSkaiciuAtmintyje(55);
        System.out.println(JauAisku.skaiciusAtmintyje);
    }





}
