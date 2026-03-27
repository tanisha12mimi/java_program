package NUMBERS_PROBLEM;
//WAJP For Swapping Of Two Numbers Without Using Temp Variable.
public class q6 {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        System.out.println("Before swapping ");
        System.out.println("A  :" +a);
        System.out.println("B : "+b);


        a= a+b;// a=30, b=20
        b= a-b;//a =30, b=10
        a=a-b;//a=20, b=10

        System.out.println("After Swapping");
        System.out.println("A  :" +a);
        System.out.println("B : "+b);
    }
}
