/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customers;

import com.sun.org.apache.xerces.internal.dom.CDATASectionImpl;

/**
 *
 * @author djohanne
 */
public class CustomerApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer c1 = new Customer("Dimitri Johannes", "07h45");
        Customer c2 = new Customer("John Wick", "08h00");
        Customer c3 = new Customer("Lionel Ritchi", "08h10");
        Customer c4 = new Customer("Keanu Reeves", "08h20");
        Customer c5 = new Customer("Adam Sandler", "08h25");
        Customer c6 = new Customer("Christiano Ronaldo", "08h30");
        Customer c7 = new Customer("Lionel Messi", "09h00");
        Customer c8 = new Customer("David Bekham", "09h05");
        Customer c9 = new Customer("Paul Scholes", "09h07");
        Customer c10 = new Customer("Tevin Campbell", "09h10");
        Customer c11 = new Customer("Sharon Stone", "09h20");
        Customer c12 = new Customer("Steve Harvey", "09h30");
        Customer c13 = new Customer("Matt Damon", "09h40");
        Customer c14 = new Customer("Steve Austin", "09h50");
        Customer c15 = new Customer("Dwayne Johnson", "09h55");
        Customer c16 = new Customer("Mohamed Ali", "10h00");
        Customer c17 = new Customer("Mike Tyson", "10h10");
        Customer c18 = new Customer("Michael Van Gerwen", "10h20");
        Customer c19 = new Customer("Gerwyn Price", "10h30");
        Customer c20 = new Customer("Ronnie O'Sullivan", "10h40");
        
        Customer[] custList = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20};
        CustomerImplementation cImp = new CustomerImplementation();
        
        System.out.println(cImp.isEmpty());
        System.out.println(cImp.isFull());
        
        for(int i=0; i<custList.length; i++)
        {
            cImp.enqueue(custList[i]);
        }
        
        System.out.println(cImp.isEmpty());
        System.out.println(cImp.isFull());
        
        System.out.println(cImp.dequeue());
        System.out.println(cImp.dequeue());

    }
    
}
