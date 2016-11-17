
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
        
        System.out.println("Ingrese número 1");
        int n1 = sc.nextInt();
        
        System.out.println("Ingrese número 2");
        int n2 = sc.nextInt();
        
        int suma = n1+n2;
        
        System.out.println("La suma es: " + suma);
        
    }
}
