package problem;
// COnstructor

class car{
    String Brand;
    String moddel;
    int  price ;

    public car(String Brand, String moddel,int price){
        this.Brand=Brand;
        this.moddel=moddel;
        this.price= price;
    }

    public void cardetails(){
        System.out.println("Brand :"+ Brand);
        System.out.println("Model :"+ moddel);
        System.out.println("Price :"+ price);
        System.out.println("_______________");

    }




}
public class QA2 {
    public static void main(String[] args) {
        car c1= new car("BMW","b1",1200000);
        car c2= new car("thsler","b1",1200000);
        car c3= new car("thar","b1",1200000);

        c1.cardetails();
        c2.cardetails();
        c3.cardetails();



    }
}
