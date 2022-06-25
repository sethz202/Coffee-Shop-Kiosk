import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This class is used to hold all of the items the user wants to buy.
 * 
 * @author Seth Zerwas
 *
 */
public class ShoppingCart {

    /** ArrayList that holds all of the items requested by user. */
    private ArrayList<Buyable> items = new ArrayList<Buyable>();

    /**
     * Method to add an item to the ArrayList items.
     * 
     * @param item Item to be added to the list.
     */
    public void addItem(Buyable item) {
        items.add(item);
    }

    /**
     * Method to get the total cost for all items in the list.
     * 
     * @return Returns a Money object total which contains the total price for all
     *         items in the list.
     */
    public Money getTotal() {
        Money total = Money.ZERO;
        for (int i = 0; i < items.size(); i++) {
            total = total.add(items.get(i).getCost());
        }
        total = total.add(Money.computeMNSalesTax(total));
        return total;
    }

    /**
     * Method to return the items in the shopping cart.
     * 
     * @return Returns a string containing the items in the list.
     */
    public String toString() {
        String cart = "";
        if (items.size() == 0) {
            cart = "Cart is empty";
        } else {
            for (int j = 0; j < items.size(); j++) {
                cart = cart + (j + 1) + ".) " + String.valueOf(items.get(j)) + ": " + items.get(j).getCost() + "\n";
            }
            cart = cart + "Total: " + getTotal();
        }

        return cart;
    }

}
