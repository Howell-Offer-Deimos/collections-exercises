package grades;

import jdk.jfr.Category;
import util.Input;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryList {
    static HashMap<String, Integer> dairy = new HashMap<>();
    static HashMap<String, Integer> produce = new HashMap<>();
    static HashMap<String, Integer> meats = new HashMap<>();
    static HashMap<String, Integer> snacks = new HashMap<>();
    static HashMap<String, Integer> beverages = new HashMap<>();
    static HashMap<String, Integer> breads = new HashMap<>();
    static Input input = new Input();
    static Scanner scan = new Scanner(System.in);

    public static void setHashMap(HashMap category, String name, int quantity) {
        category.put(name, quantity);
    }

    ;

    public static void main(String[] args) {


        boolean opt = true;
        System.out.println("Welcome to Offer-Howell Foods! Would you like to create a grocery list?");
        opt = input.yesNo();

        if (opt) {

            boolean again;
            do {
                System.out.println("What category would you like?\n" +
                        "0 - exit\n" +
                        "1 - Dairy\n" +
                        "2 - Produce\n" +
                        "3 - Meats\n" +
                        "4 - Snacks\n" +
                        "5 - Beverages\n" +
                        "6 - Breads\n" +
                        "\n" + "Please enter your choice: ");

                int userInput = input.getInt(0, 6);
                System.out.println("What is the item you would like to add?\n");
                String item = scan.nextLine();
                System.out.printf("Excellent! How many %s would you like?%n", item);
                int quantity = input.getInt();

                switch (userInput) {
                    case 0:
                        System.out.println("Adios, muchacho! Thanks for shopping with Offer-Howell Foods");
                        break;
                    case 1:
                        System.out.printf("Great, %d %s's were added to the Dairy category!%n", quantity, item);
                        setHashMap(dairy, item, quantity);
                        break;
                    case 2:
                        System.out.printf("Great, %d %s's were added to the Produce category!%n", quantity, item);
                        setHashMap(produce, item, quantity);
                        break;
                    case 3:
                        System.out.printf("Great, %d %s's were added to the Meats category!%n", quantity, item);
                        setHashMap(meats, item, quantity);
                        break;
                    case 4:
                        System.out.printf("Great, %d %s's were added to the Snacks category!%n", quantity, item);
                        setHashMap(snacks, item, quantity);
                        break;
                    case 5:
                        System.out.printf("Great, %d %s's were added to the Beverages category!%n", quantity, item);
                        setHashMap(beverages, item, quantity);
                        break;
                    case 6:
                        System.out.printf("Great, %d %s's were added to the Breads category!%n", quantity, item);
                        setHashMap(breads, item, quantity);
                        break;
                }

//                System.out.println(dairy.entrySet());
//                System.out.println(beverages.isEmpty());
                System.out.println("Would you like to add another item?");
                again = input.yesNo();
            } while (again);

            if (!beverages.isEmpty())
            {
                System.out.println("Beverages "+beverages.entrySet());
            }
            if (!breads.isEmpty())
            {
                System.out.println("Breads "+breads.entrySet());
            }
            if (!dairy.isEmpty())
            {
                System.out.println("Dairy "+dairy.entrySet());
            }
            if (!meats.isEmpty())
            {
                System.out.println("Meats "+meats.entrySet());
            }
            if (!produce.isEmpty())
            {
                System.out.println("Produce "+produce.entrySet());
            }
            if (!snacks.isEmpty())
            {
                System.out.println("Snakcs "+snacks.entrySet());
            }


            System.out.println("That completes your list! Thank you for shopping with Offer-Howell Foods\n");

        } else {
            System.out.println("Adios, muchacho! Thanks for shopping with Offer-Howell Foods");

        }
    }
}

