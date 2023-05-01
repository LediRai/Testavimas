package tevineKlase;

public class Studentas extends Zmogus { // dukterine klase
    String universitetas;

    public Studentas(String zmogausVardas, int zmogausAmzius, String universitetas ){
        super(zmogausVardas, zmogausAmzius);
        this.universitetas = universitetas;
    }
    public String getUniversitetas(){
        return universitetas;
    }
    public static void main(String[] args){
        Studentas student = new Studentas("Raimonda", 20,  "ASU");
        System.out.println("vardas: " + student.getVardas() + ", amzius: " + student.getAmzius() + ", Universitetas: " + student.getUniversitetas() );

    }
}
