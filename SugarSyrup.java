
/**
 * This class contains an addOn for beverages.
 * 
 * @author Seth Zerwas
 *
 */
public class SugarSyrup extends Addition {

    /**
     * Method to get the cost of sugar syrup.
     * 
     * @return Returns a Money object that contains the cost of sugar syrup.
     */
    public Money getCost() {
        Money subtractFifty = new Money(50);
        Money sugarSyrupCost = Money.ONE_DOLLAR.subtract(subtractFifty);
        return sugarSyrupCost;

    }

    /**
     * Method to get the calories within sugar syrup.
     * 
     * @return Returns an integer which represents the calories within sugar syrup.
     */
    public int getCalories() {
        int sugarSyrupCalories = 60;
        return sugarSyrupCalories;
    }

    /**
     * Method to return sugar syrup.
     * 
     * @return Returns sugar syrup.
     */
    public String toString() {
        return "Sugar Syrup";
    }
}
