//Q. There is a company that manufactures three types of products.
// In this company, there are 5 salesmen. Each salesman is supposed to sell three products. Write a program to print
//
//(i) The total no of sales by each salesman and
//
//(ii) total sales of each item.
//
//The structure of the class Company is as follows:-
//
//class Company
//{
//	int products[];
//}
//
//HInt:-
//Company salesman[]= new Company[5];
//
//Output :-
// Enter the sales of 3 items sold by salesman 1: 23 23 45
//Enter the sales of 3 items sold by salesman 2: 34 45 63
//Enter the sales of 3 items sold by salesman 3: 36 33 43
//Enter the sales of 3 items sold by salesman 4: 33 52 35
//Enter the sales of 3 items sold by salesman 5: 32 45 64
//Total Sales By Salesman 1 = 91 Total Sales By Salesman 2 = 142 Total Sales By Salesman 3 = 112
//Total Sales By Salesman 4 = 120
//Total Sales By Salesman 5 = 141
//Total sales of item 1 = 158
//Total sales of item 2 = 198
//Total sales of item 3 = 250
import java.util.Scanner;
public class Company {
    int products[];
    public Company(int[] products) {
        this.products = products;
    }
}
class CompanyTest {
    public static void main(String[] args) {
        Company salesman[] = new Company[5];
        Scanner readme = new Scanner(System.in);
        for (int i = 0; i < salesman.length; i++) {
            int item[] = new int[3];
            System.out.println("Enter the sales of 3 items sold by salesman" + (i + 1));
            for (int j = 0; j < item.length; j++) {
                item[j] = readme.nextInt();
            }
            salesman[i] = new Company(item);
        }
        for (int i = 0; i <salesman.length ; i++) {
            int arr[] = salesman[i].products;
            System.out.println("Total Sales By Salesman " + (i + 1));
            int s = 0;
            for (int j = 0; j < arr.length; j++) {
                s = s + arr[j];
            }
            System.out.println(s);
        }
        int i=0;
        for ( i = 0; i <salesman[i].products.length; i++) {
            int item1 = 0;
            for ( int j = 0; j < salesman.length; j++) {
                int arr[] = salesman[j].products;
                item1 = item1 + arr[i];
            }
            System.out.println("Total sales of item "+(i+1));
            System.out.println(item1);
        }
    }
}
