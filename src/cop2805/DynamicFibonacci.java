/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cop2805;

/**
 *
 * @author jguer
 */
public class DynamicFibonacci extends Thread
{
        public int n;
        
    public DynamicFibonacci(int num)
    {
        n = num;
    }
    
    @Override
    public void run()
    {
        long start = System.currentTimeMillis();
        int fibonacci = GetDynamicFibonacci(n);
        long end = System.currentTimeMillis();
        double time = end - start;
        
        System.out.println("Dynamic Thread found the answer: " + fibonacci + " in " + time +"ms");
        
    }
    
    
    private int GetDynamicFibonacci(int n)
    {
        int v1 = 0, v2 = 1, v3 = 0;
        for (int i = 2; i <= n; i++) {
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
        }
        return v2;
    }
}
