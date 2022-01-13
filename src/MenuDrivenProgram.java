import java.util.Scanner;
public class MenuDrivenProgram {
    //initialization of arr through constructor...
    int[] arr;
    int size;

    public MenuDrivenProgram(int size) {
        this.size = size;
        Scanner readme = new Scanner(System.in);
        arr = new int[this.size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readme.nextInt();
        }
    }

    // insertion of a element in an array.....for given position
    public void insert(int pos, int ele) {
        size = size + 1;
        System.out.println(size);
        for (int i = size; i >= pos; i--) {
//            try {4
//                if (arr[i] != ele) {
//                    arr[pos] = ele;
//                }
//            }
//            catch (ArrayIndexOutOfBoundsException e)
//            {
//                e.printStackTrace();
             arr[i]=arr[i-1];

        }
        arr[pos - 1] = ele;
        size = size + 1;

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}

class check
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the size iof the array");
        MenuDrivenProgram obj=new MenuDrivenProgram(readme.nextInt());
        obj.insert(3,9);
    }
}
