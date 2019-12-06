package grades;
import util.Input;
import java.util.*;

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

    public static void hashMapSort(HashMap input) {
        Set keys = input.keySet();
        int i = keys.size();
        ArrayList<String> sortedkeys = new ArrayList<>(i);
        sortedkeys.addAll(keys);
        Collections.sort(sortedkeys);

        for (String item : sortedkeys) {
            System.out.printf("Item: %s | Quantity: " + input.get(item) + "%n", item);
        }
    }
    ;

    public static void main(String[] args) {


        boolean opt = true;
        System.out.println("Welcome to the Offer-Howell Foods! Would you like to create a grocery list?");
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
                System.out.println("What is the item you would like to add?");
                String item = scan.nextLine();
                System.out.printf("Excellent! How many %s would you like?%n", item);
                int quantity = input.getInt();

                switch (userInput) {
                    case 0:
                        System.out.println("Adios, muchacho! Thanks for shopping with Offer-Howell Foods");
                        break;
                    case 1:
                        System.out.printf("%nGreat, %d %s's were added to the Dairy category!", quantity, item);
                        setHashMap(dairy, item, quantity);
                        break;
                    case 2:
                        System.out.printf("%nGreat, %d %s's were added to the Produce category!%n", quantity, item);
                        setHashMap(produce, item, quantity);
                        break;
                    case 3:
                        System.out.printf("%nGreat, %d %s's were added to the Meats category!%n", quantity, item);
                        setHashMap(meats, item, quantity);
                        break;
                    case 4:
                        System.out.printf("%nGreat, %d %s's were added to the Snacks category!%n", quantity, item);
                        setHashMap(snacks, item, quantity);
                        break;
                    case 5:
                        System.out.printf("%nGreat, %d %s's were added to the Beverages category!%n", quantity, item);
                        setHashMap(beverages, item, quantity);
                        break;
                    case 6:
                        System.out.printf("Great, %d %s's were added to the Breads category!%n", quantity, item);
                        setHashMap(breads, item, quantity);
                        break;
                }


                System.out.println("Would you like to add another item?");
                again = input.yesNo();
            } while (again);

            if (!beverages.isEmpty())
            {
                System.out.println("\nYour chosen beverages:");
                hashMapSort(beverages);
                ;
            }
            if (!breads.isEmpty())
            {
                System.out.println("\nYour chosen breads:");
                hashMapSort(breads);
            }
            if (!dairy.isEmpty())
            {
                System.out.println("\nYour chosen dairy products:");
                hashMapSort(dairy);            }
            if (!meats.isEmpty())
            {
                System.out.println("\nYour chosen meats:");
                hashMapSort(meats);            }
            if (!produce.isEmpty())
            {
                System.out.println("\nYour chosen produce:");
                hashMapSort(produce);            }
            if (!snacks.isEmpty())
            {
                System.out.println("\nYour chosen snacks:");
                hashMapSort(snacks);
            }

            System.out.println("\nThis completes your list! Thank you for shopping with Offer-Howell Foods\n");

        } else {
            System.out.println("Adios, muchacho! Thanks for shopping with Offer-Howell Foods");

        }
    }
}
