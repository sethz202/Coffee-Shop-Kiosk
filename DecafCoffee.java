
/**
 * This class extends Coffee class and contains attributes for Decaf Coffee.
 * 
 * @author Seth Zerwas
 *
 */
public class DecafCoffee extends Coffee {

    /**
     * Method to get the cost of Decaf Coffee with any applicable addOns.
     * 
     * @return Returns a money object that contains the cost of Decaf Coffee.
     */
    public Money getCost() {
        return super.getCost();
    }

    /**
     * Method to get the calories in Decaf Coffee with any applicable addOns.
     * 
     * @return Returns an integer which represents the calories within Decaf Coffee.
     */
    public int getCalories() {
        return super.getCalories();
    }

    /**
     * Method to return the entire Decaf Coffee order, including calories.
     * 
     * @return Returns a string containing entire Decaf Coffee order.
     */
    public String toString() {
        return "Decaf " + super.toString();
    }

}
