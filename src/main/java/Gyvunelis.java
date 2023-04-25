public class Gyvunelis {
    String vardas;
    int amzius;
    String rusis;
    boolean zinduolis;

    public Gyvunelis (String gyvunelioVardas, int gyvunelioAmzius, String gyvunelioRusis, boolean gyvunelisZinduolis) {
        this.vardas = gyvunelioVardas;
        this.amzius = gyvunelioAmzius;
        this.rusis = gyvunelioRusis;
        this.zinduolis = gyvunelisZinduolis;
    }

    public void info () {
        System.out.println("Gyvuno vardas: " + this.vardas + " jam yra " + this.amzius + " metu/ai" );
    }

    public static void main(String[] args) {
        Gyvunelis Tuci = new Gyvunelis("Tuci", 8, "Seskas", true);
        Gyvunelis Alfa = new Gyvunelis("Alfa", 14, "Suo", true);
        Gyvunelis Dinkelmanas = new Gyvunelis("Dinkelmanas", 3, "Varle", false);

        Tuci.info();
    }

}
