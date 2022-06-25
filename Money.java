
/**
 * This class creates the Money that is used throughout the program
 * 
 * @author Seth Zerwas
 *
 */
public class Money {

    /** Constant for 0 dollars */
    public static final Money ZERO = new Money(0);

    /** Constant for 1 dollar */
    public static final Money ONE_DOLLAR = new Money(100);

    /** Constant for 2 dollars */
    public static final Money TWO_DOLLARS = new Money(200);

    /** The amount of money in cents */
    private int amountInCents;

    /**
     * Constructor to create a money object.
     * 
     * @param moneyInCents A dollar amount in cents to allow for easier transferring
     *                     between classes.
     */
    public Money(int moneyInCents) {
        amountInCents = moneyInCents;

    }

    /**
     * Method to compute the sales tax for Minnesota.
     * 
     * @param other Takes other Money object which is in cents and computes sales
     *              tax for that amount.
     * @return Returns a new Money object that contains the cost of sales tax for
     *         the price input.
     */
    public static Money computeMNSalesTax(Money other) {
        int salesTax = (int) Math.round(other.amountInCents * .06875);
        return new Money(salesTax);
    }

    /**
     * Method to add two Money objects together.
     * 
     * @param other Other Money object in cents.
     * @return Returns a new Money object that contains the sum of the two objects.
     */
    public Money add(Money other) {
        int newAddAmount = this.amountInCents + other.amountInCents;
        return new Money(newAddAmount);
    }

    /**
     * Method to subtract two Money objects.
     * 
     * @param other Other Money object in cents.
     * @return Returns a new Money object that contains the new price of the object
     *         after subtraction.
     */
    public Money subtract(Money other) {
        int newSubtractAmount = this.amountInCents - other.amountInCents;
        return new Money(newSubtractAmount);
    }

    /**
     * Method to return the price in Dollars format ($0.00).
     * 
     * @return Returns the string of the dollars in the format ($0.00).
     */
    public String toString() {
        double priceFormat = (double) this.amountInCents / 100;
        return "$" + String.format("%.2f", priceFormat);
    }

}
