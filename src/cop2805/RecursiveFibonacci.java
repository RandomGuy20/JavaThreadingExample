/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cop2805;

/**
 *
 * @author jguer
 */
public class RecursiveFibonacci extends Thread
{
    public int n;
    
    public RecursiveFibonacci(int num)
    {
        n = num;
    }
    
    @Override
    public void run()
    {
        long start = System.currentTimeMillis();
        int fibonacci = GetRecursiveFibonacci(n);
        long end = System.currentTimeMillis();
        double time = end - start;
        
        System.out.println("Recursion Thread found the answer: " + fibonacci + " in " + time +"ms");
        
    }
    
    
    private int GetRecursiveFibonacci(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return GetRecursiveFibonacci(n - 1) + GetRecursiveFibonacci(n - 2);
    }
}
