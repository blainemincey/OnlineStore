package com.jboss.samples.onlinestore.entity;

/**
 * 
 * @author bmincey
 *
 */
public class Product implements java.io.Serializable
{

    private String productcode;
    private String productname;
    private String productline;
    private String productscale;
    private String productvendor;
    private String productdescription;
    private short quantityinstock;
    private double buyprice;
    private double msrp;

    public Product()
    {
    }

    public Product(String productcode, String productname, String productline,
            String productscale, String productvendor,
            String productdescription, short quantityinstock, double buyprice,
            double msrp)
    {
        this.productcode = productcode;
        this.productname = productname;
        this.productline = productline;
        this.productscale = productscale;
        this.productvendor = productvendor;
        this.productdescription = productdescription;
        this.quantityinstock = quantityinstock;
        this.buyprice = buyprice;
        this.msrp = msrp;
    }

    public String getProductcode()
    {
        return this.productcode;
    }

    public void setProductcode(String productcode)
    {
        this.productcode = productcode;
    }

    public String getProductname()
    {
        return this.productname;
    }

    public void setProductname(String productname)
    {
        this.productname = productname;
    }

    public String getProductline()
    {
        return this.productline;
    }

    public void setProductline(String productline)
    {
        this.productline = productline;
    }

    public String getProductscale()
    {
        return this.productscale;
    }

    public void setProductscale(String productscale)
    {
        this.productscale = productscale;
    }

    public String getProductvendor()
    {
        return this.productvendor;
    }

    public void setProductvendor(String productvendor)
    {
        this.productvendor = productvendor;
    }

    public String getProductdescription()
    {
        return this.productdescription;
    }

    public void setProductdescription(String productdescription)
    {
        this.productdescription = productdescription;
    }

    public short getQuantityinstock()
    {
        return this.quantityinstock;
    }

    public void setQuantityinstock(short quantityinstock)
    {
        this.quantityinstock = quantityinstock;
    }

    public double getBuyprice()
    {
        return this.buyprice;
    }

    public void setBuyprice(double buyprice)
    {
        this.buyprice = buyprice;
    }

    public double getMsrp()
    {
        return this.msrp;
    }

    public void setMsrp(double msrp)
    {
        this.msrp = msrp;
    }

}
