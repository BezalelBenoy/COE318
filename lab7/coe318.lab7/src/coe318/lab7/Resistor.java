/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author bbenoy
 */
public class Resistor extends Circuit {
    private double resistance;
    private Node node1,node2;
    public int idr = 1;
    public static int nextr=1;
    
    public Resistor(double resistance,Node one, Node two){
        if(resistance<=0){
            throw new IllegalArgumentException("Resistande cannot be 0 or negative");
        } else if (one==null||two==null||one==two){
            throw new IllegalArgumentException("Incorrect node assignment");
        } else if(one.id < 0|| two.id<0){
            throw new IllegalArgumentException("Node ID cannot be negative");
        }else{
            this.resistance= resistance;
            node1 = one;
            node2 = two;
            idr = nextr;
            nextr++;
        }
    }
    public Node[]getNodes(){
        Node[] node= new Node[2];
        node[0]= node1;
        node[1]=node2;
        return node;
    }
    @Override
    public String toString(){
        Node[] nodearray = getNodes();
        return("R"+idr+""+nodearray[0]+""+nodearray[1]+""+this.resistance);
    }
}
