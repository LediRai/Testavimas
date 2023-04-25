public class pasiruosimasRytojui {   //
    String paparagis;
    int metai;

    public static void main(String[] args){
        pasiruosimasRytojui car = new pasiruosimasRytojui();
        car.setPaparagis("Petras");
        car.getPaparagis();
        // System.out.println(car.getPaparagis1());
    }
    public void setPaparagis(String vardas){
        this.paparagis=vardas;
    }
    // sitas kintamasis jis nieko negrazina
    public void getPaparagis(){
        System.out.println(this.paparagis);
    }
    // sitas kintamasis grazina reiksme
    public String getPaparagis1(){
        return this.paparagis;
    }
}
