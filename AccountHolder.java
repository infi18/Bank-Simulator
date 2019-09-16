package OOAD_Lab1_BankIIT;
/**
 * @author siddhi
 *@version 1.0
 *@lab Lab-1 
 *
 */

/* Bank of IIT
 * This is the code for the half of total Bank operations
 * In a way AccountHolder acts as a back-end code.
 * The  AccountHolder program contains all the basic functions 
 * that a user requires for banking. 
 */
 import java.util.Scanner;

public class AccountHolder {
	/*Here the Account holder class is defined  
	 *required variables have been defined
	 * along with the scanner class
	 */
	
	static double AnnualIntrestRate= 0.04;
	double balance=0;
	
	Scanner sc = new Scanner(System.in);
    
		
	/*a function conversion has been defined below
     * the function converts the balance to required currency format
     * also rounds it up to 2 decimal places.
     */
    public String conversion() {
		return String.format("$%.2f", balance);
	}

/*The function below initializes & displays the balance
 * if the balance is negative it will set it to zero 
 * and then display the balance
 * */   
AccountHolder(double balance){
	
	this.balance = balance >=0 ? balance:0 ;
	System.out.println("Your Balance is " +conversion());	

	}


/*
 * The deposit function merely adds the deposit entered by user to the balance 
 * */
void deposit(double depo){
	balance = balance + depo;
	System.out.println("Your new Balance is: " +balance);
	
}

/*The withdraw function will subtract the amount user wants to withdraw from total balance
 * If the amount entered by user for withdrawal is more than what user has in account,
 * An overdraft fee of 50$ will be reduced from user's account and the remaining balance will be displayed
 * there won't be any withdrawal*/
void withdraw(double wid) {
	if(wid<balance) {
	balance = balance - wid;
	System.out.println("Your new Balance is: " +conversion());
	}
	else
	{
		System.out.println("Insufficient Balance therefore you have been charged $50 overdraft fee");
		balance = balance - 50;
		System.out.println("Your new Blance is " +conversion());
	}
	
}

/*The monthlyInterest function displays the interest rate per annum
 * also, The balance right now the user has
 * and The monthly balance sheet after adding the interest
 * */
void monthlyInterest(){
	System.out.println("Your Annual Intrest Rate is: " +AnnualIntrestRate);
	System.out.println("Your Initial Balance is: " +conversion());
	System.out.println("Your Annual Balance is as below:");
	for(int i=1; i<13; i++) {
		balance += balance * (AnnualIntrestRate/12);
		System.out.println("Month " +i +": Balance: " +conversion());
		
	}
	
	
}
}
