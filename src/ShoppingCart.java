import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class ShoppingCart. Shopping cart gets filled with items
 */
public class ShoppingCart {
    Scanner scnr = new Scanner(System.in); //scanner object
    String customerName;
    String currentDate;
    ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>(); //arrayList to keep track of the items in the cart

    /**
     * Initialize a Shopping cart. Give customerName and currentData default values
     */
    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
    }

    /**
     * OVERLOAD Initialization of a Shopping cart given name, and date.
     * @param name
     * @param date
     */
    public ShoppingCart(String name, String date) {
        customerName = name;
        currentDate = date;
    }

    /**
     * get the customers name
     * @return string customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * getDate of shopping cart
     * @return string currentDate
     */
    public String getDate() {
        return currentDate;
    }

    /**
     * add an item to the cart
     * @param item
     */
    public void addItem(ItemToPurchase item) {
        cartItems.add(item);
    }

    /**
     * Remove an item from the users shopping cart
     * @param item
     */
    public void removeItem(String item) {
        for(int i = 0; i < cartItems.size(); i++){
            if(cartItems.get(i).getName().equals(item)) { //get the item in the arrayList then get the name then compare strings
                cartItems.remove(i);
            } else {
                System.out.println("Item not found in cart. Nothing Removed.");
            }
        }
    }

    /**
     * modify an item in the cart.
     * @param item
     */
    public void modifyItem(ItemToPurchase item){
        if(cartItems.contains((item))){
            if(item.getPrice() == 0) {
                System.out.println("Enter the item price: "); //change the item price
                item.setPrice(scnr.nextInt());
            }else if(item.getQuantity() == 0){
                System.out.println("Enter the item quantity"); //change the number of the item
                item.setQuantity(scnr.nextInt());
            }else if(item.getDescription().equalsIgnoreCase("None")){
                System.out.println("Enter the item description"); //set the items description
                item.setDescription(scnr.nextLine());
            }
        }else{
            System.out.println("Item not found in card. Nothing Modified"); //nothing to modify
        }
    }

    /**
     * get the number of items in the cart
     * @return int arrayList.size()
     */
    public int getNumItemsInCart(){
        return cartItems.size();
    }

    /**
     * get the total cost of the items in the cart (integer)
     * @return int total
     */
    public int getCostOfCart(){
        int total = 0;
        for(int i = 0; i < cartItems.size(); i++){
            total += (cartItems.get(i).itemPrice * cartItems.get(i).itemQuantity);
        }
        return total;
    }

    /**
     * Print the total of each item in the cart and the total cost of the item in the cart
     */
    public void printTotal() {
        if (cartItems.size() > 0) {
            System.out.println("Number of Items: " + cartItems.size());
            System.out.println("");
            for(int i = 0; i < cartItems.size(); i++){
                cartItems.get(i).printItemCost();
            }
            System.out.println("");

            System.out.println("Total : $" + getCostOfCart());
        } else {
            System.out.println("SHOPPING CART IS EMPTY");
        }
    }

    /**
     * print the descriptions of each item in the cart
     */
    public void printDescriptions(){
        System.out.println("Item Descriptions");
        for(int i = 0; i < cartItems.size(); i++){
            cartItems.get(i).printItemDescription();
        }
    }
}
