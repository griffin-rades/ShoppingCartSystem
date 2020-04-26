import java.util.Scanner;

/**
 * Class ShoppingCartManager creates a menu system for users to add, remove, change items in their carts
 */
public class ShoppingCartManager {
    /**
     * Prints the menu used to guide the user to create their shopping cart of items
     * @param cart
     */
    public void printMenu(ShoppingCart cart){
        System.out.println("MENU");
        System.out.println(("a - Add item to cart"));
        System.out.println(("d - Remove item from cart"));
        System.out.println(("c - Change item quantity"));
        System.out.println(("i - Output items' descriptions"));
        System.out.println(("o - Output shopping cart"));
        System.out.println(("q - Quit"));
        System.out.println("");
    }

    /**
     * Main used to start everything and get the ball rolling
     * @param args
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); //create scanner object
        ShoppingCartManager cartManager = new ShoppingCartManager();
        char userIn = 'z';

        System.out.println("Enter Customer's Name:");
        String custName = scnr.nextLine(); //Get the customers name
        System.out.println("Enter Today's Date:");
        String date = scnr.nextLine(); //Get the date
        System.out.println("");

        ShoppingCart cartOne = new ShoppingCart(custName, date); //create a shopping cart for the customer using name and date

        System.out.println("Customer Name: " + cartOne.getCustomerName());
        System.out.println("Today's Date: " + cartOne.getDate());

        System.out.println("");
        cartManager.printMenu(cartOne); //call printMenu to give the user options

        while(userIn != 'q'){ //User input is 'q'
            System.out.println("Choose an option:");
            userIn = scnr.next().charAt(0);

            if(userIn == 'o'){ //User input is 'o'
                System.out.println("OUTPUT SHOPPING CART");
                System.out.println(cartOne.getCustomerName() + " Shopping Cart - " + cartOne.getDate());
                cartOne.printTotal();
                System.out.println();

            }else if(userIn =='i'){ //User input is 'i'
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                System.out.println(cartOne.getCustomerName() + " Shopping Cart - " + cartOne.getDate());
                System.out.println("");
                cartOne.printDescriptions();
                System.out.println();

            }else if(userIn == 'a'){ //User input is 'a'
                String name;
                String desc;
                int price;
                int quantity;

                scnr.nextLine();

                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                name = scnr.nextLine();
                System.out.println("Enter the item description:");
                desc = scnr.nextLine();
                System.out.println("Enter the item price");
                price = scnr.nextInt();
                System.out.println("Enter the item quantity");
                quantity = scnr.nextInt();

                ItemToPurchase item = new ItemToPurchase();
                item.setPrice(price);
                item.setQuantity(quantity);
                item.setDescription(desc);
                item.setName(name);

                cartOne.addItem(item);
                System.out.println();

            }else if(userIn == 'd'){ //User input is 'd'
                scnr.nextLine();
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter the name of item to remove:");
                cartOne.removeItem(scnr.nextLine());
                System.out.println();

            }else if(userIn == 'c'){ //User input is 'c' UNFINISHED
                String itemName;
                int quant;

                scnr.nextLine();
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                itemName = scnr.nextLine();
                System.out.println("Enter the new quantity:");
                quant = scnr.nextInt();
                System.out.println();
            }
        }
    }
}
