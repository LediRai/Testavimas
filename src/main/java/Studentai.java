public class Studentai {
    String name;
    int age;
    String schoolName;
    //set- (nustato reiksme) varda/ (get- gaunama reiksme) vardas

    public static void main(String[]args){
        //objekto kurimas, studentai yra klase,myName kuriamo objekto pavadinimas,
        // new yra nurodymas kad kuriam nauja objekta,Studentai () klases pasaukimas
       Studentai myName= new Studentai();
       // parametro priskyrimas su reiksme  taip pat ir metodo panaudojimas
        //myname yra objektas kuri sukureme pries tai, .setname yra metodo pavadinimas "r.." parametras naudojimui
       myName.setName ("Raimonda");
       //objekto iskvietimas
//        String student1 = myName.getName();
        System.out.println("Mano vardas \n"  + myName.getName());
        myName.setSchoolName("Santara");
        myName.getSchoolName();
        myName.myAge(29);
        myName.setSchoolName("milikoniai");
        myName.getSchoolName();


    }
    public String setName(String name){// () irasytas argumentas/ su set nustatoma/
        this.name=name; //instruktorius
        return name;
    }
    public String getName(){ // metodas kad gauti varda
        return this.name;

    }
    public void myAge(int manoAmzius){
        this.age=manoAmzius;
        System.out.println("mano amzius " + this.age);
    }
    public void setSchoolName(String programavimas){
        this.schoolName=programavimas;
    }
    public void getSchoolName(){
        System.out.println("mano mokykla " +  this.schoolName);
    }


}
// sukurti nauja klase, kurios vpavadinimas Car(automobilis)
//si klase turi tureti 3 parametrus
//sukurkite metodus start , drive ir stop
//su start metodu jus turite uzkurti automobli
//su stop uzgesinti
//