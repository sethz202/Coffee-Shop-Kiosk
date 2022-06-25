import java.util.ArrayList;

/**
 * This class is used to create the beverages that are added to the cart.
 * 
 * @author Seth Zerwas
 */
public abstract class Beverage implements Buyable {

    /** Constant for a Large size beverage */
    public static final int LARGE = 2;

    /** Constant for a Small size beverage */
    public static final int SMALL = 0;

    /** ArrayList that contains all of the addOn items to the beverage */
    protected ArrayList<Addition> addOns = new ArrayList<Addition>();

    /** Integer for the size of drink requested by user */
    protected int size;

    public abstract Money getCost();

    public abstract int getCalories();

    /**
     * Method to set the size for the program to use.
     * 
     * @param size Size refers to the size of beverage, 0 = Small, 2 = Large.
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Method to add addOns to the user's beverage.
     * 
     * @param itemToAdd The addOn that the user requested to be added to their
     *                  drink.
     */
    public void addToDrink(Addition itemToAdd) {
        addOns.add(itemToAdd);
    }

}
