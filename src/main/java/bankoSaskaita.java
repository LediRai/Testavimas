public class bankoSaskaita {
    //Sukurkite klasę BankoSaskaita, turinčią privačias savybes saskaitosNumeris, savininkoVardas,
    // balansas ir limitas. Klasė turi turėti set ir get metodus kiekvienai savybei.
    // Taip pat parašykite metodą papildytiBalansa(double suma), kuris padidintų balansą nurodyta suma, ir
    // metodą siustiPinigus(BankoSaskaita kitasSaskaita, double suma),
    // kuris pervestų pinigus į kitą sąskaitą, tačiau tik tada, jei balansas yra didesnis už sumą. (edited)

   private int saskaitosNumeris;
    private String savininkoVardas;
    private double balansas;
    private double limitas;

    public void setSaskaitosNumeris( int skaicius){
        this.saskaitosNumeris = skaicius;
    }
    public int getSaskaitosNumeris(){
       // System.out.println("Saskaitos numeris LT-" + this.saskaitosNumeris );
        return this.saskaitosNumeris;
    }
    public void setSavininkoVardas(String vardas){
        this.savininkoVardas = vardas;
    }
    public void getSavininkoVardas() {
        System.out.println("Savininko vardas " + this.savininkoVardas);
    }
    public void setBalansas(double saskBalansas){
        this.balansas = saskBalansas;
    }
    public void getBalansas(){
        System.out.println("Balansas: " + this.balansas + "Eur");
    }
    public void setLimitas(double saskLimitas){
        this.limitas = saskLimitas;
    }
    public void getLimitas(){
        System.out.println("Saskaitos limitas: " + this.limitas + "Eur");
    }
    public void papildytiBalansa(double pildomaSuma){
        this.balansas+= pildomaSuma;
    }
    public void siustiPinigus(bankoSaskaita kitaSaskaita, double pervedamaSuma) {
        if (this.balansas >= pervedamaSuma) {
            this.balansas -= pervedamaSuma;
            kitaSaskaita.papildytiBalansa(pervedamaSuma);
            System.out.println("Pervedėte " + pervedamaSuma + " Eur į sąskaitą " +    kitaSaskaita.getSaskaitosNumeris()  );
        } else {
            System.out.println("Nepakanka lėšų saskaitoje");
        }
    }
    public static void main(String[] args){
        bankoSaskaita zmonosSaskaita = new bankoSaskaita();
        bankoSaskaita vyroSaskaita = new bankoSaskaita();
        zmonosSaskaita.setSavininkoVardas("Raimonda");
        zmonosSaskaita.getSavininkoVardas();
        zmonosSaskaita.setSaskaitosNumeris(12345);
        zmonosSaskaita.getSaskaitosNumeris();
        zmonosSaskaita.setBalansas(5000);
        zmonosSaskaita.getBalansas();
        zmonosSaskaita.setLimitas(1500);
        zmonosSaskaita.getLimitas();

        System.out.println("---------------------");

        vyroSaskaita.setSavininkoVardas("Zenius");
        vyroSaskaita.getSavininkoVardas();
        vyroSaskaita.setSaskaitosNumeris(54321);
        vyroSaskaita.getSaskaitosNumeris();
        vyroSaskaita.setBalansas(240);
        vyroSaskaita.getBalansas();
        vyroSaskaita.setLimitas(1500);
        vyroSaskaita.getLimitas();

        System.out.println("---------------------");

        zmonosSaskaita.siustiPinigus(vyroSaskaita, 100);
        vyroSaskaita.getBalansas();
        zmonosSaskaita.getBalansas();
    }
}
