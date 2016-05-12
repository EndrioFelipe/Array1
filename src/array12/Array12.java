/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array12;

/**
 *
 * @author endrio
 */
public class Array12 {
    public static void main(String[] args) {
        int[] a = new int[4];
        
        
        for (int i=0; i<a.length; i++){
            //a[0]=0;
            
            a[0]=1;
            
            a[1]=2;
            a[2]=3;
            a[3]=4;
            if(a[i]==a[0]){
                a[i]=1;
                System.out.println(a[i]);
            }/*else if (a[i]==a[1]){
                System.out.print(a[i]+"+"+(a[i-1])+"=\n");
                
                soma=a[i]+a[i-1];
                
                System.out.println("["+soma+"]");
            } */else {
                int soma;
                int aux;
                soma=a[i]+a[i-1];//a[1]+a[0]=2+1=3
                aux=soma;
                //System.out.println("a de i - 1: "+a[i-1]);
                System.out.print(a[i]+"+"+aux+"=\n");
                
                       
                System.out.println(soma);
            
            }
        }
    }
    
}
