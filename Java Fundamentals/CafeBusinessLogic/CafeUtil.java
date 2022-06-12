import java.util.ArrayList;
import java.util.Arrays;


class CafeUtil {
    public int getStreakGoal() {

        int sum = 0;
        for ( int i = 1; i <=10; i = i++) {
            sum = sum + i;
        }
        return sum;
    }


    double getOrderTotal(double[] prices){
        
        double total = 0;

        for (int i = 1; i < prices.length; i = i++) {
            total = total + prices[i];
        }
        return total;
    }

    void displayMenu(ArrayList<String> menuItems){

        for (int i = 1; i < menuItems.size(); i++){
            System.out.printf("%s %s\n", i, menuItems.get(i));
        }
    }

    public void addCustomer (ArrayList<String> customers){
        System.out.println ("Please enter your name:")
        String userName = System.console().readLine();
        System.out.println("This is the userName:" + userName);
    }




}


