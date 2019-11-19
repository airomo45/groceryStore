package config;

import simulator.grocery.GroceryInterface;

/**
 * This file contains your implementation of some {@link GroceryInterface} items that
 * must be available in your {@link GroceryStore}.
 * @author jcollard, jddevaug
 */
public final class Groceries {



    /**
     * Private constructor to prevent class instantiation.
     */
    private Groceries() {


    }

    /**
     * Returns your implementation of Milk.
     * <pre>
     * getName() returns "Milk"
     * getPrice() returns 3.29
     * getCost() returns 1.25
     * getHandlingRating() returns 0.1
     * </pre>
     * @return your implementation of Milk
     */
    public static GroceryInterface getMilk() {
        return new Grocery("milk");
    }

    /**
     * Returns your implementation of Eggs.
     * <pre>
     * getName() returns "Eggs"
     * getPrice() returns 2.29
     * getCost() returns .25
     * getHandlingRating() returns 0.8
     * </pre>
     * @return your implementation of Eggs
     */
    public static GroceryInterface getEggs() {
        return new Grocery("eggs");
    }

    /**
     * Returns your implementation of a Cold Pocket.
     * <pre>
     * getName() returns "Cold Pocket"
     * getPrice() returns 0.49
     * getCost() returns 0.02
     * getHandlingRating() returns 0.13
     * </pre>
     * @return your implementation of Cold Pocket
     */
    public static GroceryInterface getColdPocket() {
        return new Grocery("coldPocket");
    }

    /**
     * Returns your implementation of Chips.
     * <pre>
     * getName() returns "Chips"
     * getPrice() returns 3.19
     * getCost() returns 0.50
     * getHandlingRating() returns 0.4
     * </pre>
     * @return your implementation of Chips
     */
    public static GroceryInterface getChips() {
        return new Grocery("chips");
    }

    /**
     * Returns your implementation of Beef.
     * <pre>
     * getName() returns "Beef"
     * getPrice() returns 3.39
     * getCost() returns 1.14
     * getHandlingRating() returns 0.75
     * </pre>
     * @return your implementation of Beef
     */
    public static GroceryInterface getBeef() {
        return new Grocery("beef");
    }

    /**
     * Returns your implementation of Apple.
     * <pre>
     * getName() returns "Apple"
     * getPrice() returns 0.69
     * getCost() returns 0.17
     * getHandlingRating() returns 0.25
     * </pre>
     * @return your implementation of Apple
     */
    public static GroceryInterface getApple()  {
        return new Grocery("apple");
    }

    public static void main(String[] args) {
        GroceryInterface milk = Groceries.getMilk();
        milk.getName();

    }

    public static class Grocery implements GroceryInterface {
        private String itemName;

        public Grocery(String itemName){
            this.itemName = itemName;
        }
        @Override
        public String getName() {
            return this.itemName;
        }

        @Override
        public double getPrice() {
            if(itemName == "milk"){
                return 3.29;
            }
            else if(itemName == "eggs" ){
                return 2.29;
            }
            else if(itemName == "coldPocket"){
                return 0.49;
            }
            else if(itemName == "Chips" ){
                return 3.19;
            }
            else if(itemName == "beef"){
                return 3.39;
            }
            else if(itemName == "apple"){
                return 0.69;
            }
            else{
                return 0;
            }

        }

        @Override
        public double getCost() {
            if(itemName ==  "milk" ){
                return 1.25;
            }
            else if(itemName ==  "eggs" ){
                return .25;
            }
            else if(itemName == "coldPocket" ){
                return 0.02;
            }
            else if(itemName == "chips" ){
                return 0.50;
            }
            else if(itemName == "beef" ){
                return 1.14;
            }
            else if(itemName == "apple") {
                return 0.17;
            }
            else {
                return 0;
            }
        }

        @Override
        public double getHandlingRating() {
            if(itemName == "milk"){
                return 0.1;
            }
            else if(itemName == "eggs" ){
                return 0.8;
            }
            else if(itemName == "coldPocket" ){
                return 0.13;
            }
            else if(itemName == "chips" ){
                return 0.4;
            }
            else if(itemName == "beef"){
                return 0.75;
            }
            else if(itemName == "apple"){
                return 0.25;
            }
            else {
                return 0;
            }
        }
    }
}
