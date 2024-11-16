package BankQues;
public class Bank {
    private double amount;
 
    public Bank(double amount){
     this.amount = amount;
    }
 
    public void Withdraw(double withdrawalAmount){
      String  wid = (withdrawalAmount <= amount)? "Withdraw successful " + (amount = amount-withdrawalAmount) :"Insuffient Amount.";
      System.out.println(wid);
    
    }
    public void deposit(double depositAmount) {
     amount = amount+depositAmount;
     System.out.println("Deposit successful");
 }
 public void displayBalance() {
     System.out.println("Total balance: " + amount);
 }
 
 public static void main(String args[]){
     Bank account = new Bank(1000);
     account.Withdraw(500);
     account.deposit(5000);
 
     account.displayBalance();
 }
 }