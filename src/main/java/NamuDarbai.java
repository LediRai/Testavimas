
import java.util.Scanner;
import java.util.Arrays;

public class NamuDarbai {
public static void main(String[] args){
    System.out.println("-----1. Užduotis:------");
//    Suskaičiuokite masyvo elementus, kurie yra didesni už 10.
    int[] manoMasyvas = {5, 10, 15, 20, 25}; // skaiciu masyvas
    int count = 0; // kintamasis, kuriame saugosime didesnių nei 10 elementų skaičių
    for (int i = 0; i < manoMasyvas.length; i++) { //lenth masyvo ilgis, jis nurodo elemtu kieki
        if (manoMasyvas[i] > 10) {  //[i] - yra tiesioginis paemimas is masyvo
            count++; // jei elementas yra didesnis nei 10, padidiname kintamąjį count vienetu
        }
    }
    System.out.println("Masyve yra " + count + " elementų, kurie yra didesni už 10.");

    System.out.println("----1.1 uzduotis  elementai kurie yra mazesni uz 10");

    int[] masyvoElementai = {3, 22, 8, 11, 13, 69, 73, 1, 6, 45};
    int mazesniNeiDesimt = 0;
    for (int i = 0; i< masyvoElementai.length; i++){
        if(masyvoElementai[i] <10){
            mazesniNeiDesimt++;
            System.out.println(" isvardinami elementai mazesni nei 10: " + masyvoElementai[i]);
        }
    }
    System.out.println("Viso mazesni nei 10: " + mazesniNeiDesimt);


    System.out.println("------2. Užduotis:-----");
//    Suraskite masyvo elementą su didžiausia reikšme.
    int[] big = {5, 10, 15, 20, 25};
    int max = big[0]; // pradžioje laikome, kad didžiausias elementas yra pirmas
    for (int i = 1; i < big.length; i++) { // i=1 del to kad 0 naudoju
        if (big[i] > max) {
            max = big[i]; // jei šis elementas yra didesnis už laikinai didžiausią elementą, jį pakeičiame
        }
    }
    System.out.println("Didžiausia reikšmė masyve yra: " + max);

    System.out.println("----2.1 uzduotis , ieskome maziausiu reiksmiu ");

    int[] reiksmes = {52, 21, 38, 17, 43, 89, 439};
    int maziausiaReiksme = reiksmes[0];
    for (int i=1; i<reiksmes.length; i++){
        if(reiksmes[i]<maziausiaReiksme){
            maziausiaReiksme=reiksmes[i];
        }
    }
    System.out.println("maziausia reiksme: " + maziausiaReiksme);


    System.out.println("-----3. Užduotis:------");
//    Pakeiskite masyvo 3 elementą su nauja reikšme.
    int[] skaicius = {5, 10, 15, 20, 25};
    int naujaReiksme = 30; // nauja reikšmė, kurią norime priskirti masyvo 3 elementui
    skaicius[2] = naujaReiksme; // pakeičiame 3 elementą nauja reikšme
    System.out.println("Masyvas po pakeitimo: " + Arrays.toString(skaicius));

    System.out.println("----4. Užduotis:----");
//    Sukurkite masyvą, kuris saugo 7 skirtingas temperatūras. Naudodami "set" metodą, pakeiskite temperatūrą,
//    kuri yra 4-toje masyvo pozicijoje. Jei temperatūra yra žemesnė nei 0, spausdinkite pranešimą "Šalta".
//    Jei temperatūra yra aukštesnė nei 25, spausdinkite pranešimą "Karšta".

    double[] temperaturos = {20.5, 21.2, 19.8, 18.0, 22.1, 23.7, 24.9}; // sukuriame masyvą su temperatūromis
    double naujaTemperatura = 26.3; // nauja reikšmė, kurią norime priskirti 4-ajam elementui
    temperaturos[3] = naujaTemperatura; // naudojame "set" metodą pakeisti 4-ąjį elementą nauja reikšme
    if (naujaTemperatura < 0) {
        System.out.println("Šalta");
    } else if (naujaTemperatura > 25) {
        System.out.println("Karšta");
    }

    System.out.println("-----5. Užduotis:------");
//    Sukurkite programą, kuri leidžia vartotojui įvesti savo amžių ir tada atspausdina pranešimą, ar jis pilnametis ir gali balsuoti.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savo amziu: ");
        int amzius = scanner.nextInt();
        if (amzius < 18) {
            System.out.println("Esate nepilnametis");
        } else {
            System.out.println("Galite balsuoti!");
        }

    System.out.println("-----6. Užduotis:-----");
//    Parašykite programą, kuri atspausdina žodžius "Automatinis testavimas su JAVA" 10 kartų.
    for (int i = 0; i < 10; i++) {
        System.out.println("Automatinis testavimas su JAVA");
    }

}
}

