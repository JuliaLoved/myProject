package model;

public abstract class Food implements Discountable {
    protected int amount; //количество продукта в килограммах (целое число);
    protected double price; //цена за единицу (вещественное число);
    protected boolean isVegetarian; // — флаг, который показывает, вегетарианский ли продукт.



    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getTotalPrice() {
        return amount*price;
    }
    public double getTotalPriceWithDiscount() {
        if (getDiscount() == 0) {
            return getTotalPrice();
        }
        return getDiscount()/100*getTotalPrice();
    }

    public double getTotalTotalPriceVegetarian() {
        if (isVegetarian) {
            return getTotalPrice();
        }
        return 0;
    }

}
