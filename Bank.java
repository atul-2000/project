import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Account acc = null;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		  System.out.println("1. Create Account");
		  System.out.println("2. Deposit");
		  System.out.println("3. Withdraw");
		  System.out.println("4. Details");
		  System.out.println("5. Exit");
		  
		  System.out.print("enter an option: ");
		  int opt = sc.nextInt();
		  
		  switch(opt)
		  {
		  case 1: //create Account
			  if(acc == null) {
				  System.out.print("enter account number: ");
				  long acno = sc.nextLong();
				  sc.nextLine();
				  
				  System.out.print("enter account holder's name: ");
				  String name = sc.nextLine();
				  
				  System.out.print("enter initial deposit: ");
				  float amt = sc.nextFloat();
				  
				  //create account object
				  acc = new Account(acno, name, amt);
				  System.out.println("ACCOUNT CREATED!");
			  }
			  else {
				  System.out.println("FYI: Account is already Created!");
			  }
			  break;
		  case 2: //deposit
			  if(acc != null) {
				  System.out.print("enter amount to deposit: ");
				  float amt = sc.nextFloat();
				  acc.deposit(amt);
			  }
			  else {
				  System.out.println("FYI : Create Account First!");
			  }
			  break;		
		  case 3: //withdraw
			  if(acc != null) {
				  System.out.print("enter amount to withdraw: ");
				  float amt = sc.nextFloat();
				  acc.withdraw(amt);
			  }
			  else {
				  System.out.println("FYI : Create Account First!");
			  }			  
			  break;		
		  case 4: //details
			  if(acc != null) {				  
				  acc.getBalance();
			  }
			  else {
				  System.out.println("FYI : Create Account First!");
			  }			  
			  break;		
		  case 5: //terminate application
			  System.out.println("--- BYE BYE ---");
			  System.exit(0);
			  break;			  
		  default:
			  System.out.println("Invalid Option.. Try Again..");
		  }//switch
		  System.out.println("--------------------------------");
		}//while
	}

}
