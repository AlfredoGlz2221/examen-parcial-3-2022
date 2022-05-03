package edu.uaslp.objetos.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class ShoppingCart
{
    List<ShoppingCart> shoppingCarts;

   public ShoppingCart()
   {
       shoppingCarts = new ArrayList<>();
   }


    public boolean isEmpty()
    {
        List<Item> items = new ArrayList<>();
        for(Item items : shoppingCarts) {
            if (getItems().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public OptionalDouble getTotalCost()
    {
        int costT=0;
        for(ShoppingCart shoppingCart : shoppingCarts)
        {
            shoppingCart
        }

    }

    public void addItem(Item item)
    {
        this.
    }

    public int getItemsCount()
    {
        return shoppingCarts.size();
    }

    public List<Item> getItems()
    {
        List<Item> items = new ArrayList<>();

        for(Item items : shoppingCarts)
        {
            items.getCode();
        }

        return items;
    }

    public void removeItem(String itemCode2) {
    }
}
