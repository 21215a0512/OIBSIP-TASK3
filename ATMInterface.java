import java.util.*;
public class ATMInterface {
public static void displayBalance(int balance)
{
System.out.println("Current Balance :" + balance);
System.out.println();
}
public static int amountWithdrawdrawing(int balance,int withdrawAmount)
{
System.out.println("Withdrawn Operation :");
System.out.println("Withdrawing Amount : "+ withdrawAmount);
if(balance >= withdrawAmount) {
balance = balance - withdrawAmount;
System.out.println("piease collect your money and collect card");
displayBalance(balance);
}
else {
System.out.println("Sorry ! Insufficient Funds");
System.out.println();
}
return balance;
}
public static int amountDepositing(int balance,int depositAmount)
{
System.out.println("Deposit Operation:");
System.out.println("Depositing Amount :"+ depositAmount);
balance = balance + depositAmount;
System.out.println("Your Money has been successfully deposited");
displayBalance(balance);
return balance;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter withdraw amount :");
int balance=sc.nextInt();
System.out.println("Enter withdraw amount :");
int WithdrawAmount=sc.nextInt();
System.out.println("Enter deposit amount :");
int depositAmount=sc.nextInt();
displayBalance(balance);
balance=amountWithdrawdrawing(balance,WithdrawAmount);
balance=amountWithdrawdrawing(balance,depositAmount);
}
}