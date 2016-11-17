
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heltonsmith
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1 = 0, n2 = 0, suma = 0;
        
        try{
            System.out.println("Ingrese número 1: ");
            n1 = sc.nextInt();
        }
        catch(Exception ee){
            System.out.println("Ingrese solo números!");
        }
        
        try{
            System.out.println("Ingrese número 2: ");
            n2 = sc.nextInt();
        }
        catch(Exception ee){
            System.out.println("Ingrese solo números!");
        }
        
        suma = n1+n2;
        
        System.out.println("La suma es: " + suma);
        
    }
}
