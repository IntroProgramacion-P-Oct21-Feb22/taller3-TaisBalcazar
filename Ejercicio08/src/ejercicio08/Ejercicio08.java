/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author TaisBalcazar
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int variable1 = 10;
        int variable2 = 9;
        int variable3 = 20;
        int variable4 = 500;
        int variable5 = 2;
        int variable6 = 3;
        int variable7 = 2;
        int variable8 = 200;
        int variable9 = 50;
        int variable10 = 50;
        int variable11 = 50;
        int variable12 = 51;
        
        boolean resultado = (variable1 * variable2) + variable3 - (variable4 / 
                variable5) + (Math.pow(variable6,variable7)) >= variable8 || 
                variable9 >= variable10 - variable11 + variable12 ;
        
        System.out.println(resultado);
    }
    
}
