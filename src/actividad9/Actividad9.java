/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9;
import java.util.Scanner;
/**
 *
 * @author danii
 */
public class Actividad9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner key= new Scanner (System.in);
 
        
        int tamano=solicitaentero("el tamaño del arreglo: ");
        int [][] a= arreglo("A",tamano);
        int [][] b= arreglo("B",tamano);
        
        imprimirmatriz("Matriz A",a);
        imprimirmatriz("Matriz B",b);
        
        matrizsuma(a,b);
        
    }


       public static int solicitaentero(String b){
            Scanner key = new Scanner (System.in);
        boolean flag;
        int a=0;
        do{
            try{
        System.out.println("Escribe "+b);
        a=key.nextInt();
        flag=false;
        
            }
            catch(Exception e){
                System.out.println("Error");
                key.next();
                flag=true;
            }
        }
        while(flag);
        return a;       
    }
                
        public static int[][] arreglo(String a,int tamano){
           
      int [][]arreglo = new int [tamano][tamano];
            System.out.println("Arreglo "+a);
      
        for (int i=0; i<arreglo.length;i++){
        for (int j=0;j<arreglo[i].length;j++){
        arreglo[i][j]= solicitaentero("un número entero: ");
        }
        }
        return arreglo;
        }
        
        public static int[][] matrizsuma(int[][]a,int[][]b){
        int [][] r= new int [a.length][a.length];
         System.out.println("Suma:");
        for (int i=0; i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            r[i][j]=a[i][j]+b[i][j];
            System.out.print("["+r[i][j]+"]");
        }
            System.out.println();
        }
        return r;
        }
    
        public static void imprimirmatriz(String x,int a[][]){
        System.out.println(x);
        for (int i=0; i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            System.out.print("["+a[i][j]+"]");
        }
            System.out.println();
        }
            
        }
}
