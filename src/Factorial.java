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
//Implement it by using loop
public class Factorial {
    public static void main(String[] args) {
        Scanner readmne=new Scanner(System.in);
        int n=readmne.nextInt();
        long f=1;
        for (int i = 1; i <= n; i++) {
            f=f*i;
        }
        System.out.println(f);
        int c=0;
        long r;
        while(f>0)
        {
            r=f%10;
            if(r==0)
            {
                c++;
            }
            else
            {
                break;
            }
            f=f/10;

        }
        System.out.println(c);
    }
}
