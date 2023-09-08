class Coffee
{//states
	String cname;
	String type;
	double price;

	//no-argument construcot
	Coffee(){
		//load instruction
	}

	 Coffee(String cname, String type, double price){
		 // oparameterized constructor
		 this.cname=cname;
		 this.type=type;
		 this.price=price;
	 }

	 //Behaviour

	 public void detailsofCoffee(){
		 //details of coffee
		 System.out.println("The coffee name is:" + cname);
		 System.out.println("The type of coffee is:" + type);
		 System.out.println("The price of coffee is:" +price);

	 }



}


