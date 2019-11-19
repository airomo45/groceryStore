package config;

import simulator.grocery.GroceryInterface;

public class Grocery implements GroceryInterface {
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