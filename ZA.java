import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;
public class ZA {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		int a[]= {8,6,4,8,3,2,1,4,6,7,8,4,3,2,4,5,7,8};
		System.out.println("\t\t\t" + Arrays.toString(a));
		int b[]=new int [a.length];
		//sort
		Arrays.sort(a);
		int count=0, m=0;
		for (int i = 0; i < a.length-1; i++) {
			// inserting only if the element are different 
			// when every inserting done successfully increase count
			if (a[i]!= a[i+1]) {
				b[m]=a[i];
				m++;
				count ++;
				}
			}
		// this location disadvantage is we will not get last element tyo manua;lly taken
		b[m]=a[a.length-1];
		count++; //inserting sone so increasing count
		int c[]=new int [count];
		//copy the element of b into c
		for (int i = 0; i < c.length; i++) {
			c[i]=b[i];
			
			
		}
		System.out.println("Select the input");
		System.out.println(" "
				+ "1.Remove Duplicates\n 2.Nth Largest\n 3.Nth Smallest");
		int user_input=sc.nextInt();
		
		if (user_input==1) {
			//Remove the Duplicates
			System.out.println("\t\t\t" +Arrays.toString(c));
			
		}
		
		else if (user_input==2) {
			//K th Largest
			
			System.out.println("Enter the n Value");
			System.out.println("\t\t\t Nth Largest is:" +c[c.length-sc.nextInt()]);
			
			
		}
		
		else if (user_input==3) {
			//Nth smallest
			System.out.println("Enter the n value");
			System.out.println("\t\t\t Nth smallest is " + c[sc.nextInt()-1]);
			
		}
		

	}

}
