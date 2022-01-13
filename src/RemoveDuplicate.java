import java.util.Scanner;

//Q. Write a program to remove consecutive duplicate elements in an array.
//Input values
//10 10 30 30 40 50 50 50 9 45
//Output
//10 30 40 50 9 45
public class RemoveDuplicate
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readme.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                }
                else
                {
                    i=j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0)

                System.out.println(arr[i]);
            }
        }
    }

