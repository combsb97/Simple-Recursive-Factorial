/* CS 254 Program 0
/  Author: Benjamin Combs
/  Date: 9/1/22
/
/  Compute N factorial for N=1 to 50
/
*/

public class RecursiveFactorial {
    /**
     * This static function accepts a positive integer argument @param n
     * and recursively calculates the factorial of n.
     * @param n a positive integer value
     * @return n!
     */
    public static int recFactorial(int n){
        if (n==0)                              // Check if n is equal to 0
            return 1;                          // return 1 because 0! = 1
        return n*(recFactorial(n-1));       // Otherwise return n * n-1 recursively
    }

    public static void main(String[] args){
        System.out.println("0! = "+recFactorial(0));
        System.out.println("1! = "+recFactorial(1));
        System.out.println("2! = "+recFactorial(2));
        System.out.println("3! = "+recFactorial(3));
        System.out.println("5! = "+recFactorial(5));   // Example of 5!
        System.out.println("50! = "+recFactorial(50)); // Example of 50!
    }
}
