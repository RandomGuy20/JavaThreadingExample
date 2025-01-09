/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cop2805;

/**
 *
 * @author jguer
 */
public class JavaWeek9Threading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int n = 30;
       
       RecursiveFibonacci recursive = new RecursiveFibonacci(n);
       DynamicFibonacci dynamic = new DynamicFibonacci(n);
       
       dynamic.run();
       recursive.run();
            
    }
    
}
