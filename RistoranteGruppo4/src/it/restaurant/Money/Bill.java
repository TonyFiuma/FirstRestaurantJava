package it.restaurant.Money;

import it.restaurant.RestaurantTableReservation.Reservation;


import it.restaurant.food.MenuItem;


import java.util.ArrayList;
import java.util.List;

/**
 * Class to make bills for customers
 * @author TonyF
 */
public class Bill{
    private final Reservation reservation;
    private List<MenuItem> dishesList;
    private double total;




    public Bill(Reservation reservation){
        this.reservation = reservation;
        this.total = 0;
        this.dishesList = new ArrayList<>(0);
    }

    public Reservation getReservation(){
        return reservation;
    }

    public List<MenuItem> getDishesList(){
        return dishesList;
    }

    public double getTotal(){
        return total;
    }

    public void addDishAToTheBill(MenuItem dish){
        this.dishesList.add(dish);
    }

    public void cancelTheDishInTheBill(MenuItem dish){
        this.dishesList.remove(dish);
    }

    /**
     * Iterates the dishesList to print the name and the price of dish and sums the prices to give the total
     */
    public void printTheBill(){
        System.out.println("The bill for the "+reservation.getReservationInfo()+":");
        for (MenuItem single : dishesList){
            System.out.println(single.getName()+" "+single.getPrice()+" €");
            total += single.getPrice();
        }
        System.out.println("The total is "+total+" €");
    }


}
