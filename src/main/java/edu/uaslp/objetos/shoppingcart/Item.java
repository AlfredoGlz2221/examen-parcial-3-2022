package edu.uaslp.objetos.shoppingcart;


import java.math.BigDecimal;

public class Item
{

    private String code;
    private String provideCode;
    private int quantity;
    private BigDecimal unitCost;

    public Item(String itemCode, String providerCode, BigDecimal unitCost, int quantity)
    {
        this.code = itemCode;
        this.provideCode = providerCode;
        this.unitCost = unitCost;
        this.quantity = quantity;
    }

    public Item() {

    }


    public String getCode()
    {
        return code;
    }

    public void setCode(String itemCode)
    {
        this.code = itemCode;
    }


    public void setProviderCode(String providerCode)
    {
        this.provideCode = providerCode;
    }

    public String getProviderCode()
    {
        return provideCode;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setUnitCost(BigDecimal unitCost)
    {
        this.unitCost = unitCost;
    }


    public BigDecimal getUnitCost() {
        return unitCost;
    }
}
