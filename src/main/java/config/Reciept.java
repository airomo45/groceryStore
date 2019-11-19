package config;

import simulator.checkout.AbstractReceipt;
import simulator.grocery.GroceryInterface;

import java.util.List;

public class Reciept extends AbstractReceipt {
    /**
     * Creates a {@link AbstractReceipt} with the specified grocery list, and
     * discount. The discount given to a {@link Shopper} is a value in the range
     * [0, 1] where 0 is no discount and 1 is a 100% discount.
     *
     * @param groceries the {@link List} of {@link GroceryInterface} items purchased
     * @param discount  any discount given to the {@link Shopper}
     * @throws NullPointerException     if {@code groceries} is {@code null}
     * @throws IllegalArgumentException if discount is less than 0 or greater than 1.
     */
    protected Reciept(List<GroceryInterface> groceries, double discount) {
        super(groceries, discount);
    }

    @Override
    public double getSubtotal() {
        List<GroceryInterface> groceriesList = super.getGroceries();
//        System.out.println(groceriesList);
        double totalGroceriesPrice = 0;
        for(GroceryInterface groceryItem : groceriesList){
            totalGroceriesPrice += groceryItem.getPrice();
//            return totalGroceriesPrice;
        }
        return totalGroceriesPrice;
    }

    @Override
    public double getSaleValue() {
        List<GroceryInterface> groceriesList = super.getGroceries();
        double discount, discountPrice, totalGroceriesPrice = 0;
        for(GroceryInterface groceryItem : groceriesList){
            totalGroceriesPrice += groceryItem.getPrice();
//            return totalGroceriesPrice;
        }
        discount = totalGroceriesPrice * super.getDiscount();
        discountPrice = totalGroceriesPrice - discount;
        return discountPrice;
    }
}
