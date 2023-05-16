import java.util.Random;

import static java.awt.SystemColor.text;

public class Uzduotys {

//parasyti programa kuri naudoja masyva, jis naudoja 5 vardus, isprintinama reverce (is kito galo);

    public static void main(String[] args) {

        String text = "123";

        System.out.println("---1 uzduotis----");
        String[] name = {"Pertas", "Asta", "Ugne", "Raimonda", "Tomas"};
//        if (tekstoEilute(text)) {
//            System.out.println(text + " yra skaicius");
//        } else {
//            System.out.println(text + " nera skaicius");
//        }

        //sukurti masyva is 8 zodziu ir surasti ilgiausia zodi

        String[] sakinys ={"Raimonda", "mokosi", "vilnius", "Coding", "School", "qa", "automatinis", "testavimas"};
        int maxLeth = 0;
        String ilgiausiaEilute = "";
        for (int i = 0; i < sakinys.length; i++) {
            if (sakinys[i].length() > maxLeth) {
                maxLeth = sakinys[i].length();
                ilgiausiaEilute = sakinys[i];
            }
        }
        System.out.println("ilgiausiaEilute: " + ilgiausiaEilute);




//        for (int i = name.length - 1; i >= 0; i--) {
//            System.out.println(name[i]);
//        }
//
//        System.out.println("----- 1.1 uzduotis-------");
//
//        // is listo issikraukti zodzius su a raide
//
//        for (int i = 0; i < name.length; i++) {
//            if (name[i].contains("a")) {
//                System.out.println(name[i]);
//            }
//        }
//        System.out.println("-------1.2 uzduotis-----");
//    }
//
//
//
//    //sukurti metado kuris priima teksto eilute  , ir patikrinti ar yra skaicius
//    public static boolean tekstoEilute(String text) {
//        try {
//            Integer.parseInt(text);
//            return true;
//        } catch (NumberFormatException e) {
//            System.out.println(false);
//        }
//
//
//        return false;
//


    }}