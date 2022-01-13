import java.math.BigInteger;
import java.util.Scanner;
//Me Bean is very good in mathematics.
// He was given a number n and was told to find out number of trailing zeroes in n! (Factorial) .
// Can you help him?
//Sample Input
//5
//Sample Output
//1
//Explanation
//5! (Factorial) is 120, so there is one trailing zero.
//Implement it by using loop...
public class FactorialOfBigNumber {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        BigInteger factorial=BigInteger.ONE;
        if(n<0)
        {
            System.out.println("can't found the factorial");
        }
        else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(factorial);
        }
        BigInteger c;
       int k=0;
        while(factorial.bitLength()>0)
        {
            c=factorial.remainder(BigInteger.TEN);
            if(c==BigInteger.ZERO)
            {
                k++;
            }
            else
            {
                break;
            }
            factorial=factorial.divide(BigInteger.TEN);
        }
        System.out.println(k);
    }
}
