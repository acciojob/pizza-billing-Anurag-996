package com.driver;
//
//public class Pizza {
//
//    private int price;
//    private Boolean isVeg;
//    private String bill;
//    private Boolean extraCheeseAdded;
//    private Boolean extraToppingsAdded;
//    private Boolean takeawayAdded;
//
//    private boolean billgenerated;
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        this.price = isVeg ? 300 : 400;
//        this.extraCheeseAdded = false;
//        this.extraToppingsAdded = false;
//        this.takeawayAdded = false;
//        this.bill = "Base Price Of The Pizza: " + (isVeg ? 300 : 400) + "\n";
//        // your code goes here
//    }
//
//    public int getPrice(){
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        // your code goes here
//        if (!extraCheeseAdded) {
//            this.price += 80;
//            this.extraCheeseAdded = true;
//            this.bill += "Extra Cheese Added: 80\n";
//        }
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//        if (!extraToppingsAdded) {
//            this.price += (isVeg ? 70 : 120);
//            this.extraToppingsAdded = true;
//            this.bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
//        }
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//        if (!takeawayAdded) {
//            this.price += 20;
//            this.takeawayAdded = true;
//            this.bill += "Paperbag Added: 20\n";
//        }
//    }
//
//    public String getBill(){
//        // your code goes here
////        this.bill += "Total Price: "+this.price+"\n";
////        return this.bill;
//
//
//        if(!billgenerated) {
//
//        }
//        return this.bill;
//    }
//}





public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected boolean topping;
    private boolean cheese;
    private boolean away;
    private boolean billgenrated;


    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        billgenrated = false;
        topping = false;
        away = false;
        cheese = false;
        if (isVeg) {
            this.price = 300;
        } else this.price = 400;
        this.bill = "";

    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!cheese && !billgenrated) {
            cheese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!topping && !billgenrated) {
            if (isVeg) {
                this.price += 70;
            } else this.price += 120;
            topping = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (!away && !billgenrated) {
            away = true;
            this.price += 20;
        }

    }

    public String getBill() {
        // your code goes here
        if (!billgenrated) {
            if (isVeg) {
//                this.price += 300;
                this.bill += "Base Price Of The Pizza: 300";
                this.bill += "\n";
            } else {
                bill += "Base Price Of The Pizza: 400";
                bill += "\n";
//                this.price += 400;
            }
            if (cheese) {
                bill += "Extra Cheese Added: 80";
                bill += "\n";
            }
            if (topping) {
                if (isVeg) {
                    bill += "Extra Toppings Added: 70";
                    bill += "\n";
                } else {
//                    this.price += 120;
                    bill += "Extra Toppings Added: 120";
                    bill += "\n";
                }
            }
            if (away) {
//                this.price += 20;
                bill += "Paperbag Added: 20";
                bill += "\n";
            }
            billgenrated = true;
            bill += ("Total Price: " + this.price);
            bill += "\n";
        }
        return this.bill;
    }
}