/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array5;

/**
 *
 * @author endrio
 */
public class Array5 {
    public static void main(String[] args) {
        int[] a = new int[15];
        int[] b = new int[15];
        
        for (int i=0; i<a.length; i++){
            a[i]=1+(int)(Math.random()*100);
            b[i]=a[i]*i;
            System.out.println((i+1)+"º elemento de a: "+a[i]+" e "+(i+1)+"º elemento de b: "+b[i]);
        }
    }
}
