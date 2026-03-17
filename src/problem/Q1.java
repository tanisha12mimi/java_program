package problem;


 class Student{
     String Name ;
     int Roll;
     int marks;

 public void displaydetails(String Name,int Roll,int marks){
     this.Name=Name;
     this.Roll=Roll;
     this.marks=marks;

     System.out.println("Name :"+ Name);
     System.out.println("Roll : "+ Roll);
     System.out.println("Marks :"+ marks);
     System.out.println("________________");
 }


 }
public class Q1 {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.displaydetails("Tanisha",437,78);

            Student s2 = new Student();
            s2.displaydetails("sssss",567, 80);
    }
}
