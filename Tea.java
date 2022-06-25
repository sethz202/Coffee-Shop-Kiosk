
/**
 * This class is used to create a Tea object which extends Beverage.
 * 
 * @author Seth Zerwas
 *
 */
public class Tea extends Beverage {

    /**
     * Method to get the cost of Tea with any applicable addOns.
     * 
     * @return Returns a money object that contains the cost of tea.
     */
    public Money getCost() {
        Money fifty = new Money(50);
        Money teaTotal = Money.ZERO;

        if (size == 2) {
            teaTotal = Money.ONE_DOLLAR.add(fifty);
        } else if (size == 0) {
            teaTotal = Money.ONE_DOLLAR.add(fifty);
        }
        for (int i = 0; i < addOns.size(); i++) {
            teaTotal = teaTotal.add(addOns.get(i).getCost());
        }
        return teaTotal;
    }

    /**
     * Method to get the calories within Tea with any applicable addOns.
     * 
     * @return Returns an integer which represents the calories in tea.
     */
    public int getCalories() {
        int teaCalories = 5;
        for (int j = 0; j < addOns.size(); j++) {
            teaCalories = teaCalories + addOns.get(j).getCalories();
        }
        return teaCalories;
    }

    /**
     * Method to return the entire Tea order, including calories.
     * 
     * @return Returns a string containing the entire tea order.
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
        return "Tea" + addOnItem;
    }

}
