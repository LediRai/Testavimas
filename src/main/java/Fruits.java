public class Fruits {
    String pavadinimas;
    String spalva;
    int skaicius;

    public void setPavadinimas(String vaisiausVardas){
        this.pavadinimas=vaisiausVardas;
    }
    public void getPavadinimas(){
        System.out.println("Vaisiaus pavadinimas: " + this.pavadinimas);
    }
    public void setSpalva(String vaisausSpalva){
        this.spalva=vaisausSpalva;
    }
    public void getSpalva(){
        System.out.println("Vaisiaus spalva: " + this.spalva);
    }
    public void setSkaicius(int vaisiuKiekis){
        this.skaicius=vaisiuKiekis;
    }
    public int getSkaicius(){
        return this.skaicius;
    }
    public boolean arPilnaPintine(){
        if (this.skaicius>=20){
            return true;
        }else{
            return false;
        }
    }
//    public void setDidintiSkaiciu(double vaisiuPirkimas){
//        this.didintiSkaiciu()+=vaisiuPirkimas;
//    }
//    public double getDidintiSkaiciu(){
//        return this.skaicius;
//    }
    public static void main(String[]args){
        Fruits manoVaisiai = new Fruits();
        manoVaisiai.setPavadinimas("OBUOLYS");
        manoVaisiai.getPavadinimas();
        manoVaisiai.setSpalva("Raudonas");
        manoVaisiai.getSpalva();
        manoVaisiai.setSkaicius(34);
        System.out.println( "Vaisiu skaicius: " + manoVaisiai.getSkaicius());
        System.out.println("Ar pilna pintine? " + manoVaisiai.arPilnaPintine());
      //  System.out.println(manoVaisiai.didintiSkaiciu(8));
    }


}
