import java.util.Scanner;

//Q. Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects. Now write a program to
//(a) find the average marks obtained in each subject.
//(b) find the average marks obtained by every student.
// (c) find the number of students who have scored below 50 in their average.
// (d) display the scores obtained by every student.
public class Array2D {
//    int marks[][];
//    public Array2D(int[][] marks) {
//        this.marks = marks;
//    }
}
class Student {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        int marks[][] = new int[4][5];
        for (int k = 0; k < 4; k++) {
            System.out.println("Enter the marks of student" + (k + 1));
            for (int l = 0; l < 5; l++) {
                marks[k][l] = readme.nextInt();

            }
        }
        //Array2D obj = new Array2D(marks);
        int c=0;
            for (int i = 0; i < 4; i++) {
                int s = 0;
                System.out.println("average of marks of all subject student " + (i + 1));
                for (int j = 0; j < 5; j++) {
                    s = s + marks[i][j];
                }
                float f=(float)s/5;
                if(f<50)
                {
                    c++;

                }
                System.out.println(f);


            }
        System.out.println(c);

        }

    }



