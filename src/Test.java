import java.util.Scanner;
public class Test {
    int arr[];

    public Test(int size) {
        Scanner readme = new Scanner(System.in);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readme.nextInt();
        }
    }

//    public void delete(int index) {
//        for (int i = 0; i < arr.length; i++) {
//            try {
//                arr[index] = 0;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                //e.printStackTrace();
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                System.out.println(arr[i]);
//            }
//        }
//
//    }

    // delete the element if element exist in the given array
    public void delete1(int ele) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] == ele) {
                    arr[i] = 0;
                }
            } catch (Exception e) {

            }
        }

    }

}
class TestCheck
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        Test obj=new Test(readme.nextInt());
        obj.delete1(7);

        for (int i = 0; i < obj.arr.length; i++) {
            if(obj.arr[i]!=0) {
                System.out.println(obj.arr[i]);
            }
        }

    }
}
