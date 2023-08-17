package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extraCheeseAdded;
    private Boolean extraToppingsAdded;
    private Boolean takeawayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.takeawayAdded = false;
        this.bill = "Base Price Of The Pizza: " + (isVeg ? 300 : 400) + "\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!extraCheeseAdded) {
            this.price += 80;
            this.extraCheeseAdded = true;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!extraToppingsAdded) {
            this.price += (isVeg ? 70 : 120);
            this.extraToppingsAdded = true;
            this.bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!takeawayAdded) {
            this.price += 20;
            this.takeawayAdded = true;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: "+this.price+"\n";
        return this.bill;
    }
}
