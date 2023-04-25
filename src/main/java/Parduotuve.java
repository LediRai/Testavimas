public class Parduotuve {
    String pavadinimas;
    String prekes;
    int kiekis;

    public void setPavadinimas(String krautuve){
        this.pavadinimas =krautuve;
    }
    public void getPavadinimas(){
        System.out.println("Parduotuves pavadinimas " + this.pavadinimas);
    }
    public void setPrekes(String pintine){
        this.prekes = pintine;
    }
    public void getPrekes(){
        System.out.println("Prekiu krepsi sudaro:  " + this.prekes);
    }
    public void setKiekis(int produktuKiekis){
        this.kiekis= produktuKiekis;
    }
    public void getkiekis(){
        System.out.println(this.kiekis);
    }
 public static void main (String[] args){
        Parduotuve maistoParduotuve= new Parduotuve();
        maistoParduotuve.setPavadinimas("Rimi");
        maistoParduotuve.getPavadinimas();
        maistoParduotuve.setPrekes("pienas ");
        maistoParduotuve.getPrekes();
        maistoParduotuve.setKiekis(3);
        maistoParduotuve.getkiekis();
 }
}
