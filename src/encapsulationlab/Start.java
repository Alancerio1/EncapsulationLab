/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationlab;

/**
 *
 * @author alancerio18
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Order o = new Order();
        o.setfName("John");
        o.setlName("Doe");
        o.setOrderNumber(22);
        o.setOrder("Burger");
        
        System.out.println(o.getfName() + " " + o.getlName() + " ordered the:" + o.getOrder() + " order number:" + o.getOrderNumber());
       
        
    }
    
}
