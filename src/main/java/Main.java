import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food[] foods = {
               new Meat(5,100),
               new Apple(10,50,Colour.RED),
               new Apple(8,60, Colour.GREEN)
        };
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getTotalPriceDiscount());
        System.out.println(shoppingCart.getTotalTotalPriceVegetarian());

    }
}
