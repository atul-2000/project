import java.util.Scanner;
import java.util.*;

public class Bank {
	   
	public static Scanner sc = new Scanner(System.in);
	public static Account acc = null;

       public static void create_account(){
		         //Account acc = null;
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
	   }
	   
	   public static void deposite(){
		if(acc != null) {
			System.out.print("enter amount to deposit: ");
			float amt = sc.nextFloat();
			acc.deposit(amt);
		}
		else {
			System.out.println("FYI : Create Account First!");
		}

	   }

	   public static void withdraw(){
		if(acc != null) {
			System.out.print("enter amount to withdraw: ");
			float amt = sc.nextFloat();
			acc.withdraw(amt);
		}
		else {
			System.out.println("FYI : Create Account First!");
		}	
	   }

	   public static void details(){
		if(acc != null) {				  
			acc.getBalance();
		}
		else {
			System.out.println("FYI : Create Account First!");
		}	
	   }

	   public static void terminate(){
		System.out.println("--- BYE BYE ---");
		System.exit(0);
	   }
       
	public static void main(String[] args) {
				
		Map<Integer, Runnable> commands = new HashMap<>();
		commands.put(1, () -> create_account());
		commands.put(2, () -> deposite());
		commands.put(3, () -> withdraw());
		commands.put(4, () -> details());
		commands.put(5, () -> terminate());
		
		while(true)
		{
		  System.out.println("a. Create Account");
		  System.out.println("2. Deposit");
		  System.out.println("3. Withdraw");
		  System.out.println("4. Details");
		  System.out.println("5. Exit");
		  
		  System.out.print("enter an option: ");
		 
            int key = sc.nextInt();

            // Run selected command
            if (commands.containsKey(key))
                commands.get(key).run();
		  
		    if(key==5){
				break;
			}
		}//while
	}

}
