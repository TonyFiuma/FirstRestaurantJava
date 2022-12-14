package it.restaurant.food;


import it.restaurant.customer.Customer;

import java.util.List;

public class Menu{
    private final List<MenuItem> itemList;


    public Menu(List<MenuItem> itemList){
        this.itemList = itemList;

    }

    public List<MenuItem> getItemList(){
        return itemList;
    }


    /**
     * This method appends a list of menuitems at the end of the menu itemlist
     *
     * @param list the list of menuitems we want to append
     */
    public void addListToMenu(List<MenuItem> list){
        this.itemList.addAll(list);
    }

    /**
     * Iterates the menu and the customer and in base of customer type print the menu
     *
     * @param customer that will be iterated
     */
    public void printMenuTypeByCustomerType(Customer customer){
        System.out.println("------------Dear "+customer.getName()+" we have for you "+customer.getType()+" menu-----");
        for (MenuItem menuItem : this.itemList){
            for (MenuTypeEnum menuTypeEnum : menuItem.getType()){
                if(customer.getType() == menuTypeEnum){
                    System.out.println(menuItem.getDetails());
                }
            }
        }
    }

    /**
     * iterates the menu and if the boolean isRecommended is true prints the dish
     */
    public void printRecommendedDishes(){
        for (MenuItem item : this.itemList){
            if(item.isRecommended()){
                System.out.println("Our recommended "+item.getType()+" dish is "+item.getName()+" "+item.getPrice()+" euros");
            }
        }
    }

}
