package com.jboss.samples.onlinestore.rs;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;

import com.jboss.samples.onlinestore.entity.Customer;
import com.jboss.samples.onlinestore.entity.CustomersList;
import com.jboss.samples.onlinestore.entity.utils.HibernateUtils;



/**
 * 
 * @author bmincey
 *
 */
@Path("/REST")
public class OnlineStoreResource
{
    
   
    public OnlineStoreResource()
    {
        System.out.println("OnlineStoreResource initialized...");
    }
    
    
    /**
     * 
     * @return
     */
    @GET
    @Path("hello")
    @Produces({ MediaType.TEXT_PLAIN })
    public String hello()
    {
        return "Hello, the time is now: " + new java.util.Date();
    }

    /**
     * 
     * @param message
     * @return
     */
    @GET
    @Path("echo/{message}")
    @Produces({ MediaType.TEXT_PLAIN })
    public String echo(@PathParam("message") String message)
    {
        return "Echo message: " + message + " and the time is now: " + new java.util.Date();
    }
    
    @GET
    @Path("customer/{custId}")
    @Produces({ "application/xml" })
    public Customer getCustomer(@PathParam("custId") final int custId)
    {
        System.out.println("REST Service : getCustomer with custId " + custId);
        
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Customer customer = (Customer)session.get(Customer.class, custId);
        session.getTransaction().commit();
        
        
        return customer;
    }
    

    @SuppressWarnings("unchecked")
    @GET
    @Path("customers")
    @Produces({ "application/xml" })
    public CustomersList getCustomers()
    {
        System.out.println("REST Service : getCustomers");
        
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Customer> customers = session.createQuery("from Customer").list();
        session.getTransaction().commit();
        
        
        return new CustomersList(customers);
    }
    
}
