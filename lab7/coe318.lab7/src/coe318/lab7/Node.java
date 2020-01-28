package coe318.lab7;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bbenoy
 */
public class Node {
    public int id=0;
    public static int next = 0;
    
    public Node(){
        
        id= next;
        next++;
    }
    
    @Override
    public String toString(){
        return(""+this.id);
    }
}
