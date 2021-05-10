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
public class CustomerImplementation {
    private int front, rear, counter;
    Customer[] cust;
    
    public CustomerImplementation()
    {
        front=0;
        rear=0;
        counter=-1;
        cust=new Customer[20];
    }
    
    public void enqueue(Customer inCust)
    {
        cust[rear]=inCust;
        rear=(rear+1)%cust.length;
        counter++;
    }
    
    public Customer dequeue()
    {
        Customer custRemoved = cust[front];
        front=(front+1)%cust.length;
        counter--;
        return custRemoved;
    }
    
    public boolean isEmpty()
    {
        if(counter<0)
        {
            return true;
        }
        else
            return false;
    }
    
    public boolean isFull()
    {
        if(counter==cust.length-1)
        {
            return true;
        }
        else
            return false;
    }
}
