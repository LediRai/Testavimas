import java.util.Scanner;
public class Main {

        public static void main(String[]args) {
            Main testingArray = new Main();
            testingArray.createArray();
        }

        public void createArray(){
            String[] fruits = {"Orange","Apple"};
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your fruit: ");
            String item = scan.nextLine();

            String[] newItems = new String[fruits.length + 1];
            for (int i = 0; i < fruits.length; i++){
                if (fruits[i].equals(item)){
                    System.out.println("Error: fruit already exists in the list");
                    return;
                }
                newItems[i] = fruits[i];
            }
            newItems[fruits.length] = item;
            for (String newItem : newItems) {
                System.out.println(newItem);
            }
        }

    }
