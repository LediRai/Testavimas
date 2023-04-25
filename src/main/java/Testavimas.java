import java.util.Scanner;

public class Testavimas {
    public static void main(String[] args) { //  void negrazinama reiksme
////        string number= "1234";    //string yra naudojamas tekstui
//        int numberThreeInteger = 12348; // int yra naudojamas skaiciams
//        Boolean numberIsEven= false;    // true arba false reiksmes


        String user = "Raimonda";
        System.out.println(user); // (sout yra trumpinys)
        System.out.println("hello " + user); // concatenation metodas, kai kintamasis sujungtas su tekstu

        System.out.println("---sudetis----");
        int a = 10;
        int b = 5;
        int suma = a + b;
        System.out.println("Sudetis: " + a + "+" + b + "=" + suma);
        System.out.println("-------daugyba------");
        int x = 30;
        int y = 20;
        int rezultatas = x * y;
        System.out.println("Daugyba: " + x + "*" + y + "=" + rezultatas);
        System.out.println("------skirtumas-----");
        int n = 8;
        int m = 37;
        int skirtumoRezultatas = m - n;
        System.out.println("Skirtumas: " + m + "-" + n + "=" + skirtumoRezultatas);
        System.out.println("------dalyba-----");
        int z = 10;
        int r = 2;
        int dalyba = z / r;
        System.out.println("Dalyba: " + z + "/" + r + "=" + dalyba);

        int misrus = (y / r) + x - (z * b);
        System.out.println("Misrus atsakymas: " + misrus);

        System.out.println("-- Parašykite programą, kuri atspausdina žodžius (Automatinis testavimas) su JAVA 10 kartų --");
        int kartai = 10;
        for (int i = 1; i <= kartai; ++i){
            System.out.println("Automatinis testavimas");
        }
        System.out.println("rodykite skaičius nuo 1 iki 5");

        int nuoIki = 6;
        for (int i = 1; i<=nuoIki; ++i){
            System.out.println(i);
        }

        System.out.println(" Teigiamų skaičių suma");
        int sum = 2;
        int numeris = 3;
        Scanner imput = new Scanner(System.in);
        do {
            sum+= numeris;
            System.out.println("irasyti numeri: ");
            numeris = imput.nextInt();
        } while (numeris>=0);
        System.out.println("suma = " + sum);
        imput.close();




    }

}

//        int g = 10;
//        if (g <= 10) {
//            System.out.println("trume");
//        } else if (g >= 4) {
//            System.out.println("false");
//        } else {
//            System.out.println("error");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Enter a number: ");
//        System sanner;
//        int num = scanner.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }}


//
//        Scanner scanner = new Scanner (System.in);
//        System.out.println(" Enter a number: ");
//        System scanner;
//        int amzius = scanner.nextInt();
//        if (amzius >= 18){
//        {else if (amzius<=18) {
//                System.out.println("esate nepilnametis");
//            }else {
//                System.out.println("esate suauges zmogus");
//            }


//        for (int i=0; i < 101; i++){
//            System.out.println(i);
//        }

        //System.out.println(  "------elementas for -----");
//        for (int i =0; i<100; i++){
//            boolean isPrime = true;
//            for(int k=2; k<1; k++){
//                if(i % k ==0){
//                    isPrime =false;
//                }
//            }
//            if(isPrime && i >1){
//                System.out.println(i+ "");
//            }
//        }

      //  System.out.println("------- masyvas  ----------");

 //       int[] masyvas = new int[5];
//        masyvas[0] = 1;
//        masyvas[1] = 2;
//        masyvas[2] = 3;
//        masyvas[3] = 4;
//        masyvas[4] = 5;
//        int[] masyvas = {2,4 ,6, 41, 60, 332};
//        masyvas[2] = 4;
//        System.out.println(masyvas[2]);

//        for (int i = 0; i<masyvas.length; i++){
//            System.out.println(masyvas[i]);
//        }
//        }

//parasyti programa kuri paims svekuju skaiciu masyva ir grazins ??

////public class Testavimas {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
////    }
////}
