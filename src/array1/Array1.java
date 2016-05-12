/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author endrio
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
             
        
        for (int i=0; i<a.length; i++){
            a[i]=1+(int)(Math.random()*100);
            b[i]=a[i];
            System.out.println("a: "+a[i]+" b: "+b[i]);
        }
        
        for (int a1 : a){
            System.out.println(a1);
        }
        
    }
    
}
