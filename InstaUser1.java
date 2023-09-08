class InstaUser1{
	public static void main(String[] args)
	{
		//Static context
		/* object reference is the only way to access non-static variable from
		staic context*/

		Insta ab = new Insta("Naveenrah87","naveen6863855@gmail.com","28-07-2003","booby@143",7200604957L);
		Insta cd = new Insta("preethisri","prenaveen@gmail.com","27-06-2003","naveen143",9498082010L);

		System.out.println(" User_Name is ", ab.User_name);
		System.out.println("\t\t\t cd.getemail()");
	}
}