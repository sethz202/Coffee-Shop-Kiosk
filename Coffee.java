
/**
 * This class creates the Coffee that was requested by user.
 * 
 * @author Seth Zerwas
 *
 */
public class Coffee extends Beverage {

    /**
     * Method to get the cost of Coffee with any applicable addOns.
     * 
     * @return Returns a Money Object with the cost of Coffee within it.
     */
    public Money getCost() {
        Money coffeeTotal = Money.ZERO;
        Money fifty = new Money(50);
        if (size == 2) {
            coffeeTotal = Money.TWO_DOLLARS.add(fifty);
        } else if (size == 0) {
            coffeeTotal = Money.ONE_DOLLAR.add(fifty);
        }
        for (int i = 0; i < addOns.size(); i++) {
            coffeeTotal = coffeeTotal.add(addOns.get(i).getCost());
        }
        return coffeeTotal;
    }

    /**
     * Method to get the calories in Coffee with any applicable addOns.
     * 
     * @return Returns an integer which represents the calories in the coffee.
     */
    public int getCalories() {
        int coffeeCalories = 0;
        if (size == 2) {
            coffeeCalories = 15;
        } else if (size == 0) {
            coffeeCalories = 5;
        }
        for (int j = 0; j < addOns.size(); j++) {
            coffeeCalories = coffeeCalories + addOns.get(j).getCalories();
        }
        return coffeeCalories;
    }

    /**
     * Method to return the string of the entire Coffee order, including calories
     * and size
     * 
     * @return Returns a string containing the entire coffee order
     */
    public String toString() {
        String addOnItem = "";
        for (int k = 0; k < addOns.size(); k++) {
            addOnItem = addOnItem + "+" + String.valueOf(addOns.get(k));
        }
        String beverageSize = "";
        if (size == 2) {
            beverageSize = "L";
        } else if (size == 0) {
            beverageSize = "S";
        }
        addOnItem = addOnItem + " (" + beverageSize + ") - " + getCalories() + " calories";
        return "Coffee" + addOnItem;
    }

}
