package com.jboss.samples.onlinestore.entity;



import java.util.Date;

/**
 * 
 * @author bmincey
 *
 */
public class Payment implements java.io.Serializable
{

    private int paymentnumber;
    private int customernumber;
    private String checknumber;
    private Date paymentdate;
    private double amount;

    public Payment()
    {
    }

    public Payment(int paymentnumber, int customernumber, String checknumber,
            Date paymentdate, double amount)
    {
        this.paymentnumber = paymentnumber;
        this.customernumber = customernumber;
        this.checknumber = checknumber;
        this.paymentdate = paymentdate;
        this.amount = amount;
    }

    public int getPaymentnumber()
    {
        return this.paymentnumber;
    }

    public void setPaymentnumber(int paymentnumber)
    {
        this.paymentnumber = paymentnumber;
    }

    public int getCustomernumber()
    {
        return this.customernumber;
    }

    public void setCustomernumber(int customernumber)
    {
        this.customernumber = customernumber;
    }

    public String getChecknumber()
    {
        return this.checknumber;
    }

    public void setChecknumber(String checknumber)
    {
        this.checknumber = checknumber;
    }

    public Date getPaymentdate()
    {
        return this.paymentdate;
    }

    public void setPaymentdate(Date paymentdate)
    {
        this.paymentdate = paymentdate;
    }

    public double getAmount()
    {
        return this.amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

}
