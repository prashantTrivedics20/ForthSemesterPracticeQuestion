import java.util.Scanner;

public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailZFact(n));
    }

    private static int trailZFact(int n) {
        int fPow = 0;
        int tPow = 0;
        int i = 0;
        while(true){
            if(n/Math.pow(5,i+1) < 1){
                break;
            }
            fPow += n/Math.pow(5,i+1);
            i++;
        }
        i = 0;
        while(true){
            if(n/Math.pow(2,i+1) < 1){
                break;
            }
            tPow += n/Math.pow(2,i+1);
            i++;
        }
        return Math.min(fPow,tPow);
    }
}