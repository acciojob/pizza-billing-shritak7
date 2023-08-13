package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int totalPrice;
    private boolean takeAway;
    private boolean addCheese;
    private boolean addToppings;
    private boolean isGenerated;
    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){price=300;}
        else{price=400;}

        totalPrice=price;
        addCheese=false;
        addToppings=false;
        takeAway=false;
        isGenerated=false;
        bill="";

    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addCheese)
        {
            totalPrice+=80;
            addCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addToppings && isVeg){
            totalPrice+=70;
            addToppings=true;
        }else if (!addToppings && !isVeg)
        {
            totalPrice+=120;
            addToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            totalPrice+=20;
            takeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isGenerated){
            bill+= "Base Price Of The Pizza: "+ price+"\n";
            if(addCheese){
                bill+="Extra Cheese Added: "+80+"\n";
            }
            if(addToppings){
                if(isVeg){
                    bill+="Extra Toppings Added: "+70+"\n";
                }
                else{
                    bill+="Extra Toppings Added: " +120+"\n";
                }
            }
            if(takeAway){
                bill+="Paperbag Added: "+20+"\n";
            }
            bill += "Total Price: " + totalPrice + "\n";
            isGenerated=true;
        }

        return this.bill;
    }


}