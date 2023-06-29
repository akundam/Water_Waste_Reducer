//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.fisd.agua;

public class UserConsumption {
   private int toilet;
   private int washingMachine;



   private int shower;
   private int faucet;
   private int dishWasher;
   private int dishFaucet;

   public UserConsumption() {

    }
    public UserConsumption(int toilet, int washingMachine, int shower, int faucet, int dishWasher, int dishFaucet) {
        this.toilet = toilet;
        this.washingMachine = washingMachine;
        this.shower = shower;
        this.faucet = faucet;
        this.dishWasher = dishWasher;
        this.dishFaucet = dishFaucet;
    }

    public int getToilet() {
        return toilet;
    }

    public int getWashingMachine() {
        return washingMachine;
    }

    public int getShower() {
        return shower;
    }

    public int getFaucet() {
        return faucet;
    }

    public int getDishWasher() {
        return dishWasher;
    }

    public int getDishFaucet() {
        return dishFaucet;
    }

    public double getToiletPercentage() {
            double percentage = 0.0;
            percentage = (toilet * 1.6)/(1.6*5);
            return percentage*100;
    }

    public double getWashingMachinePercentage() {

        int total = 0;
        double percentage = 0.0;
        total = washingMachine * 19;
        percentage = total/(19*2);
        return percentage *100;
    }
    public double getShowerPercentage() {
        double percentage =0.0;
        double avguseofwater = 8.0;
        percentage = (shower*1.6)/8;
        return percentage*100;
    }
    public double getFaucetPercentage() {
        double percentage = 0.0;
        percentage = (faucet*2.2)/10.9;
        return percentage*100;
    }
    public double getDishWasherPercentage() {
        double percentage = 0;
        double total = (dishWasher*3);
        percentage = total/7;
        return percentage*100;
    }
    public double getDishFaucetPercentage() {
        double percentage =0.0;
        percentage = (dishFaucet*2.2)/12;
        return percentage*100;
    }

    public boolean toiletisabove() {

        if(getToiletPercentage() >= 1){
            return true;
        }
        else return false;
    }

    public boolean WashingMachineisabove() {
        if( getWashingMachinePercentage()>= 1){
            return true;
        }
        else return false;

    }
    public boolean Showerisabove() {
        if( getShowerPercentage()>= 1){
            return true;
        }
        else return false;
    }
    public boolean faucetisabove() {
        if(getFaucetPercentage() >= 1){
            return true;
        }
        else return false;
    }
    public boolean DishWasherisabove() {
        if(getDishWasherPercentage() >= 1){
            return true;
        }
        else return false;
    }
    public boolean DishFaucetisabove() {
        if(getDishFaucetPercentage() >= 1){
            return true;
        }
        else return false;
    }
}