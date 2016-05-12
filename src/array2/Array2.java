/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author endrio
 */
public class Array2 {
     public static void main(String[] args) {
        int[] a2 = new int[8];
        int[] b2 = new int[8];
        
        for (int i=0; i<a2.length; i++){
            a2[i]=1+(int)(Math.random()*100);
            b2[i]=a2[i]*2;
            System.out.println("a: "+a2[i]+" b: "+b2[i]);
        }
    }
    
}
