package in.vinay.main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("============GHI BANKING APPLICATION===============");
			System.out.println();
			System.out.println("1. Withdrawl");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			
			System.out.println("ENETR YOUR OPTION");
			int choice=s.nextInt();
			if(choice==1)
			{
				Withdraw w=new Withdraw();
				Access ac =new Access();
				ac.permit(w);
			}
			else if(choice==2)
			{
				Deposit d =new Deposit();
				Access ac1 =new Access();
				ac1.permit(d);
			}
			else if(choice==3)
			{
				Balance b =new Balance();
				Access ac2 =new Access();
				ac2.permit(b);
			}
			else
			{
				flag=false;
				System.exit(0);
			}
				
		}
		
	}

}
