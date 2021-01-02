public class Account {
	  long acno;
	  String name;
	  float bal;
	  
	  /*constructors*/
	  public Account(){}

	  public Account(long acno, String name, float bal) {	
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	  }
	  
	  //deposit method
	  void deposit(float amt) {
		  this.bal = this.bal + amt;
		  System.out.println("Rs."+amt+" Credited | Balance: "+this.bal);
	  }
	  
	  //withdraw method
	  void withdraw(float amt) {
		  if(this.bal >= amt) {
			  this.bal = this.bal - amt;
			  System.out.println("Rs."+amt+" Debited | Balance: "+this.bal);
		  }
		  else {
			  System.out.println("ERROR: Insufficient Balance");
		  }
	  }
	  
	  //getting account details method
	  void getBalance() {
		  System.out.println("A/C No:"+this.acno+" | NAME:"+this.name+" | Balance:"+this.bal);
	  }
}
