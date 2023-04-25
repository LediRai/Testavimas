public class Katinas {
    String vardas;
    int zingsniai;
    String draugas;

    public void setVardas(String katinoVardas){
        this.vardas= katinoVardas;
    }
    public void getVardas (){
        System.out.println(this.vardas);
    }
    public void katinasMiega(){
        System.out.println(this.vardas + " saldziai miega");
    }
    public void katinasPrabunda(){
        System.out.println(this.vardas + " pabudo is saldaus miego");
    }
    public void katinasEina (int nueitiZingsniai){
        this.zingsniai+= nueitiZingsniai;
        System.out.println(this.vardas + " nuejo " + this.zingsniai + " zingsnius");
    }
    public void setDraugas(String draugoVardas){
        this.draugas=draugoVardas;
    }
    public String getDraugas(){
        return this.draugas;
    }


    public static void main (String[] args){
        Katinas mielas= new Katinas();
        mielas.setVardas("Kazys");
        mielas.getVardas();
        mielas.katinasMiega();
        mielas.katinasPrabunda();
        mielas.katinasEina(10);
        mielas.katinasEina(8);
        mielas.katinasEina(12);
        mielas.setDraugas("Stase");
        System.out.println("susitiko drauge vardu " + mielas.getDraugas());
    }
}
