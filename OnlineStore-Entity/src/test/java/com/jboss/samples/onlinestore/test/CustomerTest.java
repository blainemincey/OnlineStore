/**
 * 
 */
package com.jboss.samples.onlinestore.test;

import org.hibernate.Session;

import com.jboss.samples.onlinestore.entity.Customer;
import com.jboss.samples.onlinestore.entity.utils.HibernateUtils;

import junit.framework.TestCase;

/**
 * @author bmincey
 *
 */
public class CustomerTest extends TestCase
{

    /**
     * @param name
     */
    public CustomerTest(String name)
    {
        super(name);
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception
    {
        super.setUp();
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }

    /**
     * Test method for {@link com.jboss.samples.onlinestore.entity.Customer}.
     */
    public final void testGetCustomer()
    {
        System.out.println("Testing Get Customer for customer number 496");
        
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Customer customer = (Customer)session.get(Customer.class, 496);
        session.getTransaction().commit();
        
        assertNotNull(customer);
    }

}
