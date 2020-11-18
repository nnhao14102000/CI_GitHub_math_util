/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author giao-lang
 */
public class MathUtility {
    //ta sẽ làm class MathUtility giống y chang thiết kế của class Math
    //Math là class tiện ích 
    public static final double PI = 3.1415;
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        if (n == 0 || n == 1)
            return 1; //đặc biệt, return luôn
        
        //đứa nào viết else ở đây, trừ điểm
        //mặc nhiên CPU đến đc đây là hiểu rằng n = 2..20
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    
}
