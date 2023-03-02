package in.vinay.main;
import java.util.Scanner;
public abstract class Server {
	public int uid=799353;
	public int upw=00000;
	public int id;
	public int pw;
	public double amount;
	static double bankBalance=35000;
	Scanner s=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the UserID");
		id=s.nextInt();
		System.out.println("Enter the PassWord");
		pw=s.nextInt();
	}
	abstract void verify() throws Exception;
}
