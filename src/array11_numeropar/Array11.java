/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array11_numeropar;

/**
 *
 * @author endrio
 */
public class Array11 {
    public static void main(String[] args) {
        int[] a = new int[10];
        
        
        for (int i=0; i<a.length; i++){
            a[i]=1+(int)(Math.random()*100);
            if (a[i]%2==0){
                System.out.println(a[i]);
                
            }
            
            //System.out.println("");
        }
    }
    
}
