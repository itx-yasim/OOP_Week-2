import java.util.Scanner;
public class UserLogin{

	static String userName="yasim@gmail.com";
	static String password="abc123!";

	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);

	System.out.print("ENTER EMAIL: ");	
	String un=sc.nextLine();

	System.out.print("ENTER PASSWORD: ");
	String pass=sc.nextLine();
	
	if(userName.equals(un) && password.equals(pass)){
	System.out.print(" Logined Successfully! \n -Welcome-");
	}

	else{
	System.out.print("Incorrect Info !!!");
	}

	}
}