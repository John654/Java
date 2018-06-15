import java.util.*;
import java.io.*;

public class bankAccount{
    private int accountNum=0;
    private double balance=0;
    private double fee = 4.00;

    public bankAccount(int Anumber, double Ubalance){
	accountNum = Anumber;
	balance = Ubalance;
    }

    public void makeDeposit(double amount){
	balance += amount;
    }

    public void makeWithdraw(double amount){
	balance -= amount; 
    }

    public void deductFee(){
	balance -= getFee();
    }

    public void accountPolicy(){
	System.out.println("Every month 4$ monthly fee will be deducted from your account \n");
    }

    public double getFee(){
	return fee; 
    }

    public int getAccount(){
	return accountNum;
    }
    
    public double getBalance(){
	return balance;
    }

    public void print(){
	System.out.println("-------------------User Account Info----------------------");
	System.out.println("User Account Number: " + getAccount());
	System.out.println("User Balance: " + getBalance());
	System.out.println("----------------------------------------------------------");
    }
}
