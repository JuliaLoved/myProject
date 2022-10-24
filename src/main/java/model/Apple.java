package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String appleColour;

    public Apple(int amount, double price, String appleColour) {
        super(amount, price, true);
        this.appleColour=appleColour;
    }

    @Override
    public double getDiscount() {
        if (appleColour== Colour.RED){
            return Discount.SIXTY;
        }

        return Discount.ZERO;
    }
}
