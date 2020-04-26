/**
 * Class ItemToPurchase controls the items that will be put in carts
 */
public class ItemToPurchase{
    String itemName;
    String itemDescription;
    int itemPrice; //uses integer values for prices
    int itemQuantity; //can not have part of an item

    /**
     * Initialize ItemToPurchase set variables to default values
     */
    public ItemToPurchase(){
        itemName = "None";
        itemDescription = "None";
        itemPrice = 0;
        itemQuantity = 0;
    }

    /**
     * OVERLOAD ItemToPurchase initializer given name, description, price, and number of item.
     * @param name
     * @param desc
     * @param price
     * @param num
     */
    public ItemToPurchase(String name, String desc, int price, int num){
        itemName = name;
        itemDescription = desc;
        itemQuantity = num;
        itemPrice = price;
    }

    /**
     * print the items cost
     */
    public void printItemCost(){
        System.out.println(itemName + " " + itemQuantity + " @ " + itemPrice + " = $" + (itemQuantity * itemPrice));
    }

    /**
     * print the items description
     */
    public void printItemDescription(){
        System.out.println(itemName + ": " + itemDescription);
    }

    /**
     * set the name of the item
     * @param name
     */
    public void setName(String name){
        itemName = name;
    }

    /**
     * set the description of an item
     * @param desc
     */
    public void setDescription(String desc){
        itemDescription = desc;
    }

    /**
     * set the price of an item
     * @param price
     */
    public void setPrice(int price){
        itemPrice = price;
    }

    /**
     * set the quantity of an item
     * @param num
     */
    public void setQuantity(int num){
        itemQuantity = num;
    }

    /**
     * get the name of the item
     * @return string itemName
     */
    public String getName(){
        return itemName;
    }

    /**
     * get the description of an item
     * @return string itemDescription
     */
    public String getDescription(){
        return itemDescription;
    }

    /**
     * get the price of an item
     * @return integer itemPrice
     */
    public int getPrice(){
        return itemPrice;
    }

    /**
     * get the quantity of an item
     * @return integer itemQuantity
     */
    public int getQuantity(){
        return itemQuantity;
    }

}
