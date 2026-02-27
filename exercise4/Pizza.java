public class Pizza {
    PizzaSize pizzaSize;
    PizzaType pizzaType;
    int quantity;
    double price;

    public Pizza (PizzaSize ps, PizzaType pt, int quantity){
        this.pizzaSize = ps;
        this.pizzaType = pt;
        this.quantity = quantity;
    }

    private void calculatePrice(PizzaSize ps, PizzaType pt, int quantity) {
        double sizeValue = 0;
        switch (ps) {
            case SMALL:
                sizeValue = 8;
                break;

            case MEDIUM:
                sizeValue = 10;
                break;

            case LARGE:
                sizeValue = 12;
                break;
        };

        double typeValue = 0;
        switch (pt) {
            case VEGGIE:
                typeValue = 1;
                break;
            case PEPPERONI:
                typeValue = 2;
                break;
            case CHEEZE:
                typeValue = 1.5;
                break;
            case BBQ_CHICKEN:
                typeValue = 2;
                break;
        }

        double prePrice = (sizeValue + typeValue) * quantity;
        double tax = (prePrice * 20)/100;
        this.price = prePrice + tax;

    }

    public String printOrderSummary(){

        calculatePrice(pizzaSize,pizzaType,quantity);
        String output ="Size = " + pizzaSize + ", Type = " + pizzaType + " Quantity = " + quantity + " Total Price = " + price;
        return output;

    }

}
