/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array6;

/**
 *
 * @author endrio
 */
public class Array6 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int [] c = new int [10];
        
        for (int i=0; i<a.length; i++){
            a[i]=1+(int)(Math.random()*100);
            b[i]=1+(int)(Math.random()*100);
            c[i]=a[i]+b[i];
            System.out.println("a: "+a[i]+", b: "+b[i]+" e c: "+c[i]);
        }
    }
}
