import java.util.Scanner;

//Q. Write a program to find whether the array of integers contains a duplicate number.
//if yes print the location where duplicate numbers are found.
public class DuplicateElement {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int []arr=new int[n];
        int f[]=new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            f[arr[i]]++;
            System.out.println(i);
        }
        for (int i = 0; i <f.length; i++) {
            if(f[i]>1&&f[i]!=0)
            {
                System.out.println(f[i]);
            }
        }

    }
}
