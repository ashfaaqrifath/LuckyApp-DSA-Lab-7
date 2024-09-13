/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */
public class Node {
    
    private int number;
    public Node leftChild;
    public Node rightChild;

//    public Node(int number, Node leftChild, Node rightChild) {
//        this.number = number;
//        this.leftChild = leftChild;
//        this.rightChild = rightChild;
//    }
    
    public Node (int num){
        number = num;
    }
    
    
    public int getNumber(){
        return number;
    }
    // returns the number
    
}
