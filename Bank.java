class Bank
{
	//states
	String bname, ifsc,branch;
	 
	 //no argument constructor
	 Bank(){
		 //load instruction
	 }

	 //parameterized constructor
	 Bank(String bname,String ifsc, String branch){
		 //load instruction
		 this.bname=bname;
		 this.ifsc=ifsc;
		 this.branch=branch;
	 }
}
 class Icici extends Bank
 {
	// states
	double bal=0.0;
	String acc_holder_name;
	long contact;

	//constructor
	Icici(){
		//super();
		//load instruction
	}
	Icici(String bname, String ifsc, String branch, String ahn, long con)
	 {
		super(bname,ifsc,branch);
		//load instruction
		acc_holder_name=ahn;
		contact=con;
	 }
	 public void deposite(double d){
		 // d is holding the amount which has top be deposited
		 bal=bal+d;
		 System.out.println("\t\t\t Deposited done successfully");

		 System.out.println("Available bal: "+ bal);
	 }
	 public void withdraw(double w)
	 {
		 //w is holding amount that need to be withdraw
		 if(bal>=w)
		 {
			 // i am eligibkle to withdraw
			 bal=bal+w;
			System.out.println("\t\t\t Withdraw successfully");
			System.out.println("Available balance:" +bal);
		}
		else{
			//if bal is lesser than withdrawable amount
			System.out.println("Insufficient balance");
		}
	}
	public void detailsofAccount(){
		System.out.println("Bamk name is:" +bname);
		System.out.println("Bank ifsc is :" +ifsc);
		System.out.println("Branch  is :" +branch);
		System.out.println("acc_holder_name is :" +acc_holder_name);
		System.out.println("acc_holder_contact is:" +contact);
		System.out.println("**************************************************");
	}
 }
 class Sbi extends Bank
 {
	// states
	double bal=0.0;
	String acc_holder_name;
	long contact;

	//constructor
	Sbi(){
		//super();
		//load instruction
	}
	Sbi(String bname, String ifsc, String branch, String ahn, long con)
	 {
		super(bname,ifsc,branch);
		//load instruction
		acc_holder_name=ahn;
		contact=con;
	 }
	 public void deposite(double d){
		 // d is holding the amount which has top be deposited
		 bal=bal+d;
		 System.out.println("\t\t\t Deposited done successfully");

		 System.out.println("Available bal: "+ bal);
	 }
	 public void withdraw(double w)
	 {
		 //w is holding amount that need to be withdraw
		 if(bal>=w)
		 {
			 // i am eligibkle to withdraw
			 bal=bal+w;
			System.out.println("\t\t\t Withdraw successfully");
			System.out.println("Available balance:" +bal);
		}
		else{
			//if bal is lesser than withdrawable amount
			System.out.println("Insufficient balance");
		}
	}
	public void detailsofAccount(){
		System.out.println("Bamk name is:" +bname);
		System.out.println("Bank ifsc is :" +ifsc);
		System.out.println("Branch  is :" +branch);
		System.out.println("acc_holder_name is :" +acc_holder_name);
		System.out.println("acc_holder_contact is:" +contact);
		System.out.println("**************************************************");
	}
 }