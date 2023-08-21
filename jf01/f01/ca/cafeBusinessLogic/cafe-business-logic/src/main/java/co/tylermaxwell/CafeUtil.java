package co.tylermaxwell;

import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal(){
        int streakGoal = 0;
        for(int i = 0; i <= 10; i++) streakGoal += i;
        return streakGoal;
    }

    public int getStreakGoal(int weeks){
        int streakGoal = 0;
        for(int i = 0; i <= weeks; i++) streakGoal += i;
        return streakGoal;
    }

    public double getOrderTotal(double[] total){
        double orderTotal = 0;
        for(double item : total) orderTotal += item;
        return orderTotal;

    }

    public void displayMenu(ArrayList<String> menuItems){
        String message = "";
        for(int i = 0; i < menuItems.size(); i++){
            message += i;
            message += " ";
            message += menuItems.get(i);
            message += "\n";

        }

        System.out.printf(message);
    }

}
