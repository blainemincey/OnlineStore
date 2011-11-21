package com.jboss.samples.onlinestore.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "customers")
public class CustomersList
{
    private List<Customer> customers;

    public CustomersList()
    {
    }

    public CustomersList(List<Customer> customers)
    {
        this.customers = customers;
    }

    @XmlElement(name = "customer")
    public List<Customer> getCustomers()
    {
        return customers;
    }
}
