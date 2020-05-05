/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author user
 */
public class MainInside {
    public static void main (String[] args){
        Latihan4 obj1 = new Latihan4();
        Latihan4 obj2 = new Latihan4();
        Latihan4 obj3 = new Latihan4();      
        obj1.addCounter();
        
        System.out.println("Counter milik obj1 =" +obj1.getCounter());
        System.out.println("Counter milik obj2 =" +obj2.getCounter());
        System.out.println("Counter milik obj3 =" +obj3.getCounter());
    }
}
