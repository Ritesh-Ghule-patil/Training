package ritesh;
import java.util.Scanner;
public class Aaditya {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt(); // for input from user
		
		if(age>0 && age<15) {
			System.out.println("you Are Children");
		}
		else if(age>14 && age<25) {
			System.out.println("Your are Young");
		}
		else if(age>24 && age<61) {
			System.out.println("you are Adult");
		}
		else {
			System.out.println("you Are Senior aged person");
		}
	}
}
