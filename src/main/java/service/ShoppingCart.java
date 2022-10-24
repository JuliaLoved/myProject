package service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
     this.foods = foods;
    }

    public double getTotalPrice() { // общая сумма товаров без скидки
        System.out.println("Общая сумма товаров без скидки:");
        double totalPrice = 0;
        for (int i = 0; i < foods.length; i++) {
            totalPrice=totalPrice+ foods[i].getTotalPrice();
        }
        return totalPrice;
    }
    public double getTotalPriceDiscount() { //сумму скидки для всей корзины,
        System.out.println("Сумма скидки для всей корзины:");
        double totalPrice = 0;
        double totalDiscount=0;
       for (int i = 0; i < foods.length; i++) {
           if(foods[i].getDiscount()!=0) {
               totalDiscount += foods[i].getTotalPriceWithDiscount();
           }
       }
        return totalDiscount;
    }

    public double getTotalTotalPriceVegetarian() {
        System.out.println("Сумма всех вегетарианских продуктов без скидки:");
        double totalPrice = 0;
        for (int i = 0; i < foods.length; i++) {
            totalPrice=totalPrice+ foods[i].getTotalTotalPriceVegetarian();
        }
        return totalPrice;


    }



}
