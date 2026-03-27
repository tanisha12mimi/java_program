package NUMBERS_PROBLEM;
//WAJP For Swapping Of Two Numbers Using Temp Variable.
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=10;
        int b=20;
        System.out.println("Before swapping ");
        System.out.println("A  :" +a);
        System.out.println("B : "+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("After Swapping");
        System.out.println("A  :" +a);
        System.out.println("B : "+b);













    }
}
