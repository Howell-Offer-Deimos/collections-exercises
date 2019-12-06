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
        System.out.println("Welcome to the Grocery List App! Would you like to create a grocery list?");
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
                        System.out.println("Thank you for using the Grocery List App!");
                        break;
                    case 1:
                        setHashMap(dairy, item, quantity);
                        break;
                    case 2:
                        setHashMap(produce, item, quantity);
                        break;
                    case 3:
                        setHashMap(meats, item, quantity);
                        break;
                    case 4:
                        setHashMap(snacks, item, quantity);
                        break;
                    case 5:
                        setHashMap(beverages, item, quantity);
                        break;
                    case 6:
                        setHashMap(breads, item, quantity);
                        break;
                    default:
                        System.err.println("That's not an option...");
                }

//                System.out.println(dairy.entrySet());
//                System.out.println(beverages.isEmpty());
                System.out.println("Would you like to add another item or is your list complete?");
                again = input.yesNo();
            } while (again);

            if (!dairy.isEmpty())
            {
                System.out.println(dairy.entrySet());
            }
            if (!produce.isEmpty())
            {
                System.out.println(produce.entrySet());
            }
            if (!meats.isEmpty())
            {
                System.out.println(meats.entrySet());
            }
            if (!snacks.isEmpty())
            {
                System.out.println(snacks.entrySet());
            }
            if (!beverages.isEmpty())
            {
                System.out.println(beverages.entrySet());
            }
            if (!breads.isEmpty())
            {
                System.out.println(breads.entrySet());
            }

            System.out.println("That completes your list! Thank you for shopping with Offer-Howell Foods\n");

        } else {
            System.out.println("Adios, muchacho! Thanks for shopping with Offer-Howell Foods");

        }
    }
}
//    Create a grocery list command line application. You will use your input class from previous exercises.
//
//    A user should be prompted if they would like to create a grocery list.
//
//    If they pick yes, they will be prompted if they would like to enter a new item.
//
//    If the users picks yes, they should be given the following three prompts:
//
//    Given an ordered list of grocery categories to choose from, select the category.
//    Enter name of the item.
//    Enter how many of the item.
//    The user will then be given the choice to finalize the list or add an additional item.
//
//    Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped
//    by category, and including quantity.


//        }



//}
