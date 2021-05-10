/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customers;

/**
 *
 * @author djohanne
 */
public class Customer {
    
    private String name, time;
    
    public Customer()
    {
    }
    
    public Customer(String inName, String inTime)
    {
        name=inName;
        time=inTime;
    }
    
    public void setName(String inName)
    {
        name=inName;
    }
    
    public void setTime(String inTime)
    {
        time=inTime;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getTime()
    {
        return time;
    }
    
    @Override
    public String toString()
    {
        return "Customer name: " + name + ", Time: " + time;
    }
}
