package com.jboss.samples.onlinestore.entity;

import java.util.Date;

/**
 * 
 * @author bmincey
 *
 */
public class Order implements java.io.Serializable
{

    private int ordernumber;
    private Date orderdate;
    private Date requireddate;
    private Date shippeddate;
    private String status;
    private String comments;
    private int customernumber;

    public Order()
    {
    }

    public Order(int ordernumber, Date orderdate, Date requireddate,
            String status, int customernumber)
    {
        this.ordernumber = ordernumber;
        this.orderdate = orderdate;
        this.requireddate = requireddate;
        this.status = status;
        this.customernumber = customernumber;
    }

    public Order(int ordernumber, Date orderdate, Date requireddate,
            Date shippeddate, String status, String comments, int customernumber)
    {
        this.ordernumber = ordernumber;
        this.orderdate = orderdate;
        this.requireddate = requireddate;
        this.shippeddate = shippeddate;
        this.status = status;
        this.comments = comments;
        this.customernumber = customernumber;
    }

    public int getOrdernumber()
    {
        return this.ordernumber;
    }

    public void setOrdernumber(int ordernumber)
    {
        this.ordernumber = ordernumber;
    }

    public Date getOrderdate()
    {
        return this.orderdate;
    }

    public void setOrderdate(Date orderdate)
    {
        this.orderdate = orderdate;
    }

    public Date getRequireddate()
    {
        return this.requireddate;
    }

    public void setRequireddate(Date requireddate)
    {
        this.requireddate = requireddate;
    }

    public Date getShippeddate()
    {
        return this.shippeddate;
    }

    public void setShippeddate(Date shippeddate)
    {
        this.shippeddate = shippeddate;
    }

    public String getStatus()
    {
        return this.status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getComments()
    {
        return this.comments;
    }

    public void setComments(String comments)
    {
        this.comments = comments;
    }

    public int getCustomernumber()
    {
        return this.customernumber;
    }

    public void setCustomernumber(int customernumber)
    {
        this.customernumber = customernumber;
    }

}
