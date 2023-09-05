package Transaction;

import java.util.Iterator;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		int nod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of days shop was open");
		nod = sc.nextInt();
		System.out.println("Enter the earnings for "+nod+ "days");
		int earnings[] = new int[nod];
		for (int i = 0; i < nod; i++) 
		{
			earnings[i] = sc.nextInt();
		}
		
		System.out.println("Enter Number of targets");
		int targets = sc.nextInt();
		
		for (int i = 0; i < targets; i++)
		{
			System.out.println("Please enter target "+ i );
			int target = sc.nextInt();
			
			int flag = 0;    
			int sum = 0;
			
			for (int j = 0; j < earnings.length; j++) 
			{
				sum = sum + earnings[j];
				if (sum >= target)
				{
					flag = 1;
					System.out.println("Targer Achieved on day "+ (j+1));
					break;
				}
			}
			
			if (flag == 0)
				System.out.println("Target Not Achieved");
			
		}
			
	}
				
		

}


