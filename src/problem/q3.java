package problem;

//Encapsulation:
//Create a class BankAccount with private balance and methods deposit() and withdraw().

class BankAccount{
    private double balance;

    public void deposit(double ammount){
        balance= balance+ammount;
        System.out.println("deposite"+ ammount);

    }
    public void withdraw(double ammount){
        if(ammount<=balance){
            balance= balance- ammount;
            System.out.println("Withdraw"+ammount);
        }
        else{
            System.out.println("Insufficient balance");
        }

    }

    public double getBalance() {
        return balance;
    }
}




public class q3 {
    public static void main(String[] args) {
         BankAccount acc = new BankAccount();
         acc.deposit(1000);
         acc.withdraw(500);

        System.out.println("Available Balance" + acc.getBalance());
    }

}
