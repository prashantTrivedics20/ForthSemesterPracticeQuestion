// to find the number of trailing zero for given number
// you have to first divide the number by 5 if number becomes less than 5 then we stop the divison
import java.util.Scanner;
public class TrailingZero {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        long n=readme.nextInt();
        long  c=0;
        long  res=0;
        for (int i = 0; i <n ; i++) {
            res=n/5;
            c=c+res;
            if(res>=5)
            {
                n=res;
            }
            else
            {
                break;
            }
        }
        System.out.println(c);
    }
}
