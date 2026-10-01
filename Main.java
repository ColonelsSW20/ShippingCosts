class ShippingCosts
{
    void main()
    {
        double itemPrice;
        double shippingCost;
        double totalPrice;

        itemPrice = 150.00;

        if (itemPrice >= 100)
        {
            shippingCost = 0;
        }
        else
        {
            shippingCost = itemPrice * 0.02;
        }

        totalPrice = itemPrice + shippingCost;

        System.out.println("Item price: $" + itemPrice);
        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price: $" + totalPrice);
    }
}