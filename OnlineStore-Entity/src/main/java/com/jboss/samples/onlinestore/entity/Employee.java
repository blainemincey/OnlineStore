package com.jboss.samples.onlinestore.entity;

/**
 * 
 * @author bmincey
 *
 */
public class Employee implements java.io.Serializable
{

    private int employeenumber;
    private String lastname;
    private String firstname;
    private String extension;
    private String email;
    private String officecode;
    private Integer reportsto;
    private String jobtitle;

    public Employee()
    {
    }

    public Employee(int employeenumber, String lastname, String firstname,
            String extension, String email, String officecode, String jobtitle)
    {
        this.employeenumber = employeenumber;
        this.lastname = lastname;
        this.firstname = firstname;
        this.extension = extension;
        this.email = email;
        this.officecode = officecode;
        this.jobtitle = jobtitle;
    }

    public Employee(int employeenumber, String lastname, String firstname,
            String extension, String email, String officecode,
            Integer reportsto, String jobtitle)
    {
        this.employeenumber = employeenumber;
        this.lastname = lastname;
        this.firstname = firstname;
        this.extension = extension;
        this.email = email;
        this.officecode = officecode;
        this.reportsto = reportsto;
        this.jobtitle = jobtitle;
    }

    public int getEmployeenumber()
    {
        return this.employeenumber;
    }

    public void setEmployeenumber(int employeenumber)
    {
        this.employeenumber = employeenumber;
    }

    public String getLastname()
    {
        return this.lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getFirstname()
    {
        return this.firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getExtension()
    {
        return this.extension;
    }

    public void setExtension(String extension)
    {
        this.extension = extension;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getOfficecode()
    {
        return this.officecode;
    }

    public void setOfficecode(String officecode)
    {
        this.officecode = officecode;
    }

    public Integer getReportsto()
    {
        return this.reportsto;
    }

    public void setReportsto(Integer reportsto)
    {
        this.reportsto = reportsto;
    }

    public String getJobtitle()
    {
        return this.jobtitle;
    }

    public void setJobtitle(String jobtitle)
    {
        this.jobtitle = jobtitle;
    }

}
