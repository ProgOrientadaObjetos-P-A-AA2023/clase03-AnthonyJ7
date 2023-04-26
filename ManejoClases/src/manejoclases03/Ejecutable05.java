/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejecutable05 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Hospital miHospital = new Hospital();
        Hospital h1 = new Hospital();


        
        // Dar valores a los atributos
        // los valores se ingrsan por teclado
        
        String nombre;
        int camas;
        double presupuesto;
        
        System.out.println("Ingrese el nombre del hospital: ");
        nombre= sc.nextLine();
        
        System.out.println("Ingrese el numero de camas: ");
        camas = sc.nextInt();
        
        System.out.println("Ingrese el presupuesto disponible: ");
        presupuesto = sc.nextDouble();
        
        h1.establecerNombre(nombre);
        h1.establecerNumeroCamas(camas);
        h1.establecerPresupuesto(presupuesto);
        
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(), 
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        
        
    }
    
}
