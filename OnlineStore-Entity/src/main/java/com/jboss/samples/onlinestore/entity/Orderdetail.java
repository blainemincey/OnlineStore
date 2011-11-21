package com.jboss.samples.onlinestore.entity;

/**
 * 
 * @author bmincey
 *
 */
public class Orderdetail implements java.io.Serializable
{

    private int orderdetailnumber;
    private int ordernumber;
    private String productcode;
    private int quantityordered;
    private double priceeach;
    private short orderlinenumber;

    public Orderdetail()
    {
    }

    public Orderdetail(int orderdetailnumber, int ordernumber,
            String productcode, int quantityordered, double priceeach,
            short orderlinenumber)
    {
        this.orderdetailnumber = orderdetailnumber;
        this.ordernumber = ordernumber;
        this.productcode = productcode;
        this.quantityordered = quantityordered;
        this.priceeach = priceeach;
        this.orderlinenumber = orderlinenumber;
    }

    public int getOrderdetailnumber()
    {
        return this.orderdetailnumber;
    }

    public void setOrderdetailnumber(int orderdetailnumber)
    {
        this.orderdetailnumber = orderdetailnumber;
    }

    public int getOrdernumber()
    {
        return this.ordernumber;
    }

    public void setOrdernumber(int ordernumber)
    {
        this.ordernumber = ordernumber;
    }

    public String getProductcode()
    {
        return this.productcode;
    }

    public void setProductcode(String productcode)
    {
        this.productcode = productcode;
    }

    public int getQuantityordered()
    {
        return this.quantityordered;
    }

    public void setQuantityordered(int quantityordered)
    {
        this.quantityordered = quantityordered;
    }

    public double getPriceeach()
    {
        return this.priceeach;
    }

    public void setPriceeach(double priceeach)
    {
        this.priceeach = priceeach;
    }

    public short getOrderlinenumber()
    {
        return this.orderlinenumber;
    }

    public void setOrderlinenumber(short orderlinenumber)
    {
        this.orderlinenumber = orderlinenumber;
    }

}
