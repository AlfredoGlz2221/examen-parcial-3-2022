package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Item
{

    List<Item> item;

    private String Itemcode;
    private String provideCode;
    private BigDecimal cost;
    private int i;

    public Item(String itemCode1, String providerCode1, BigDecimal bigDecimal, int i) {
    }

    public Item()
    {
        item = new ArrayList<>();
    }

    public String getCode()
    {
        return Itemcode;
    }

    public void setProviderCode(String providerCode)
    {
        this.provideCode = providerCode;
    }

    public void setCode(String itemCode)
    {
        this.Itemcode = itemCode;
    }

    public void setQuantity(int i)
    {
        this.i = i;
    }

    public void setUnitCost(BigDecimal bigDecimal)
    {
        this.cost = bigDecimal;
    }


    public String getProviderCode()
    {
        return provideCode;
    }

    public int getQuantity() {
        return i;
    }

    public BigDecimal getUnitCost() {
        return cost;
    }
}
