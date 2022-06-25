
/**
 * This class is used to hold the attributes for Oat milk add-On.
 * 
 * @author Seth Zerwas
 *
 */
public class OatMilk extends Addition {

    /**
     * Method to get the cost of Oat milk
     * 
     * @return Returns a Money object containing the cost of the oat milk.
     */
    public Money getCost() {
        Money oatMilkCost = Money.ONE_DOLLAR;
        return oatMilkCost;
    }

    /**
     * Method to get the calories in oat milk.
     * 
     * @return Returns an integer which represents calories in oat milk.
     */
    public int getCalories() {
        int oatMilkCalories = 30;
        return oatMilkCalories;
    }

    /**
     * Method to return oat milk.
     * 
     * @return Returns oat milk.
     */
    public String toString() {
        return "Oatmilk";
    }
}
