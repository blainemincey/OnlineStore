package com.jboss.samples.onlinestore.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "customer")
public class Customer implements java.io.Serializable
{

    @XmlElement(required = true) 
    private int customernumber;
    
    @XmlElement(required = true) 
    private String customername;
    
    @XmlElement(required = true) 
    private String contactlastname;
    
    @XmlElement(required = true) 
    private String contactfirstname;
    
    @XmlElement(required = true) 
    private String phone;
    
    @XmlElement(required = true) 
    private String addressline1;
    
    @XmlElement(required = true) 
    private String addressline2;
    
    @XmlElement(required = true) 
    private String city;
    
    @XmlElement(required = true) 
    private String state;
    
    @XmlElement(required = true) 
    private String postalcode;
    
    @XmlElement(required = true) 
    private String country;
    
    @XmlElement(required = true) 
    private Integer salesrepemployeenumber;
    
    @XmlElement(required = true) 
    private Double creditlimit;

    public Customer()
    {
    }

    public Customer(int customernumber, String customername,
            String contactlastname, String contactfirstname, String phone,
            String addressline1, String city, String country)
    {
        this.customernumber = customernumber;
        this.customername = customername;
        this.contactlastname = contactlastname;
        this.contactfirstname = contactfirstname;
        this.phone = phone;
        this.addressline1 = addressline1;
        this.city = city;
        this.country = country;
    }

    public Customer(int customernumber, String customername,
            String contactlastname, String contactfirstname, String phone,
            String addressline1, String addressline2, String city,
            String state, String postalcode, String country,
            Integer salesrepemployeenumber, Double creditlimit)
    {
        this.customernumber = customernumber;
        this.customername = customername;
        this.contactlastname = contactlastname;
        this.contactfirstname = contactfirstname;
        this.phone = phone;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.city = city;
        this.state = state;
        this.postalcode = postalcode;
        this.country = country;
        this.salesrepemployeenumber = salesrepemployeenumber;
        this.creditlimit = creditlimit;
    }

    public int getCustomernumber()
    {
        return this.customernumber;
    }

    public void setCustomernumber(int customernumber)
    {
        this.customernumber = customernumber;
    }

    public String getCustomername()
    {
        return this.customername;
    }

    public void setCustomername(String customername)
    {
        this.customername = customername;
    }

    public String getContactlastname()
    {
        return this.contactlastname;
    }

    public void setContactlastname(String contactlastname)
    {
        this.contactlastname = contactlastname;
    }

    public String getContactfirstname()
    {
        return this.contactfirstname;
    }

    public void setContactfirstname(String contactfirstname)
    {
        this.contactfirstname = contactfirstname;
    }

    public String getPhone()
    {
        return this.phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getAddressline1()
    {
        return this.addressline1;
    }

    public void setAddressline1(String addressline1)
    {
        this.addressline1 = addressline1;
    }

    public String getAddressline2()
    {
        return this.addressline2;
    }

    public void setAddressline2(String addressline2)
    {
        this.addressline2 = addressline2;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return this.state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getPostalcode()
    {
        return this.postalcode;
    }

    public void setPostalcode(String postalcode)
    {
        this.postalcode = postalcode;
    }

    public String getCountry()
    {
        return this.country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public Integer getSalesrepemployeenumber()
    {
        return this.salesrepemployeenumber;
    }

    public void setSalesrepemployeenumber(Integer salesrepemployeenumber)
    {
        this.salesrepemployeenumber = salesrepemployeenumber;
    }

    public Double getCreditlimit()
    {
        return this.creditlimit;
    }

    public void setCreditlimit(Double creditlimit)
    {
        this.creditlimit = creditlimit;
    }

}
