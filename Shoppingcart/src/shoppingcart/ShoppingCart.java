/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Anthony
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        try {
            double divResult = calc.divide(50, 10);
            System.out.println("Division Result: " + divResult);
        } catch (ArithmeticException ae) {
            System.out.println("An error was found: " + ae);
        }
        
        String[] days = {"monday", "saturday","tuesday", "sunday", "friday"};

        // Convert the days array into an ArrayList
        // Loop through the ArrayList, printing out "sunday" elements in
        // upper case (use toUpperCase() method of String class)
        // Print all other days in lower case
        // Print out the ArrayList
        ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
        for (String s: dayList) {
            if (s.equals("sunday")) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s);
            }
        }
        System.out.println(dayList);
    }
    
    public void fillCart() {
        items.add(new Shirt(40.95, 'M', 'R'));
        items.add(new Shirt(32.99, 'M', 'Y'));
        items.add(new Trousers(59.99, 34, 'B', 'Relaxed', 'M'));
        items.add(new Trousers(75.50, 8, 'G', 'Skinny', 'F'));
    }

    public void removeItemFromCart(String desc) {
        // remove all Trousers from the items list, then print out the list
        System.out.println("Cart before removing trousers: \n" + items);
        items.removeIf(i -> i.getDesc().equals(desc));
        System.out.println("Cart after removing trousers: \n" + items);
    }
    
}
