/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author bbenoy
 */
public class Voltage extends Circuit {
    
    private double voltage;
    private Node node1,node2;
    public int vid=1;
    public static int vnext=1;
    
    public Voltage(double voltage, Node no1, Node no2){
        if (no1==null||no2==null||no1==no2){
        throw new IllegalArgumentException("Incorrect Node Assignment");
    }else if (no1.id<0||no2.id<0){
        throw new IllegalArgumentException("Node ID cannot be negative");
    }else {
    this.voltage = voltage;
    node1=no1;
    node2=no2;
    vid=vnext;
    vnext++;
}
    
}
public Node[]getNodes(){
Node[]node = new Node[2];
node[0]= node1;
node[1]=node2;
return node;
}

public boolean negative(){
    Node[] nodes=getNodes();
    return(nodes[0].id> nodes[1].id);
}
@Override
public String toString(){
    Node[] nodearray = getNodes();
    if(negative()){
        return("V"+vid+""+nodearray[1]+""+nodearray[0]+"DC"+-(this.voltage));
    }else{
        return("V"+vid+""+nodearray[0]+""+nodearray[1]+"DC"+this.voltage);
    }
}
}
