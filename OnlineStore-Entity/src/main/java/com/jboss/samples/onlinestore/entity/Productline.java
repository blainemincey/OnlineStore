package com.jboss.samples.onlinestore.entity;

/**
 * 
 * @author bmincey
 *
 */
public class Productline implements java.io.Serializable
{

    private String productline;
    private String textdescription;
    private String htmldescription;

    public Productline()
    {
    }

    public Productline(String productline)
    {
        this.productline = productline;
    }

    public Productline(String productline, String textdescription,
            String htmldescription)
    {
        this.productline = productline;
        this.textdescription = textdescription;
        this.htmldescription = htmldescription;
    }

    public String getProductline()
    {
        return this.productline;
    }

    public void setProductline(String productline)
    {
        this.productline = productline;
    }

    public String getTextdescription()
    {
        return this.textdescription;
    }

    public void setTextdescription(String textdescription)
    {
        this.textdescription = textdescription;
    }

    public String getHtmldescription()
    {
        return this.htmldescription;
    }

    public void setHtmldescription(String htmldescription)
    {
        this.htmldescription = htmldescription;
    }

}
