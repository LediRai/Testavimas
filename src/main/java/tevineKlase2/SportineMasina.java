package tevineKlase2;

public class SportineMasina extends Masina {
    int didziausiasGreitis;

    public SportineMasina(String tpMarke, String tpModelis, int tpMetai, int tpDuruSkaicius, int tpMaxGreitis){
        super(tpMarke, tpModelis, tpMetai, tpDuruSkaicius);
        this.didziausiasGreitis= tpMaxGreitis;
    }
    public int getDidziausiasGreitis(){
        return didziausiasGreitis;
    }
    public static void main(String[] args){
        SportineMasina kietaMasina = new SportineMasina("MB", "AMG", 2023, 2,330 );
        System.out.println(" Marke: " + kietaMasina.getMarke() + " Modelis: " + kietaMasina.getModelis() + " Metai: " +
                kietaMasina.getMetai() + " Duru skaicius: " + kietaMasina.getDidziausiasGreitis() + " max greitis :" + kietaMasina.getDidziausiasGreitis() + "km/h");
    }
}
