package h;
import java.util.Scanner;
public class printname {
	public static void main(String args[]) {
		Scanner mean =new Scanner(System.in);
		System.out.println("enter your name");
		
		String username = mean.nextLine();
		
		System.out.println("your name,"+username);

		System.out.println("printname.main()");
	}

}
