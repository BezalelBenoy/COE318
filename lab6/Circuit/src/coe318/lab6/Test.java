/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author bbenoy
 */
public class Test {
    public static void main(String[] args){
        Circuit c1= Circuit.getInstance();
        
        Node X = new Node();
        Node Y = new Node();
        Node Z = new Node();
        System.out.println(X.toString());
        System.out.println(Y.toString());
        System.out.println(Z.toString());
        
        Resistor r1 = new Resistor(100.0,X,Y);
        Resistor r2 = new Resistor(50.0,Y,Z);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        
        System.out.println("\nCircuit");
        
        c1.add(r1);
        c1.add(r2);
        System.out.println(c1.toString());
    }
    
}
