
/**
 * This class is used to create a Mug that is able to be purchased.
 * 
 * @author Seth Zerwas
 *
 */
public class Mug implements Buyable {

    /**
     * Method to get the cost of the Mug.
     * 
     * @return Returns a money object that contains the cost of the mug.
     */
    public Money getCost() {
        Money mugCost = Money.TWO_DOLLARS.add(Money.TWO_DOLLARS).add(Money.TWO_DOLLARS).add(Money.TWO_DOLLARS)
                .add(Money.TWO_DOLLARS);
        return mugCost;
    }

    /**
     * Method to return Mug.
     * 
     * @return Returns mug.
     */
    public String toString() {
        return "Classy Mug";
    }

}
