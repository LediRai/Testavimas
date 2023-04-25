//import java.util.Scanner;
public class Krautuve {
//String preke;
//String produktai;
//public void setPreke(String prekesPavadinimas){
//    this.preke=prekesPavadinimas;
//}
//public void getPrekes(){
//    System.out.println(this.preke);
//}
    public static void main(String[] args) {
//    Krautuve manoKrautuve = new Krautuve();
//    manoKrautuve.setPreke("produktu sarasas:");
//    manoKrautuve.getPrekes();

//        System.out.println("-------------");
//        String[] produktai = { "bananas", "svogunai", "vysnios"};
//        String[] produktas= new String[3];
//        produktai[0]= "obuolys";
//        produktai[1]= "braske";
//        produktai[2]= "bulve";
//        System.out.println(produktai);
////        for (int x=0; x< produktai.length; x++){
////            System.out.println(produktai[x]);
////        }






        for (int x = 1; x < 11; x++){
            System.out.println(x);
        }
        System.out.println("----lyginio skaiciaus paieska----");

        int[] skaicius = {1, 3, 5};
        boolean radauLygini=false;
        for (int x = 0; x< skaicius.length; x++) {
            if (skaicius[x] % 2 == 0) {
                System.out.println(skaicius[x]);
                radauLygini = true;
            }
        }
        if (!radauLygini){ // ! yra nelygybe
            System.out.println("nera lyginio skaiciaus");
        }
        //
//            }else {
//                System.out.println("nera lyginiu skaiciu ");
//            }
        //}





//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Prideti produkta: ");
//        String item = scanner.next();
//        //String[] newItems= new String[item + 1];
//        System sanner;
//        String produktas = scanner.next();
//        String produktas1 = scanner.next();
//        String produktas2 = scanner.next();
//        String produktas3 = scanner.next();
//



//    }
}}
