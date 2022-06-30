import java.util.Scanner;

import com.student.management.Student;
import com.student.management.StudentDao;

public class Start {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Welcome To Student Management App");
			
			while(true)
			{
				System.out.println("");
				System.out.println("Press 1 for ADD student");
				System.out.println("Press 2 for DELETE student");
				System.out.println("Press 3 for DISPLAY student");
				System.out.println("Press 4 for Exit student");
				System.out.println("");
				
				int c =  sc.nextInt();
				
				switch(c)
				{
				case 1:
					System.out.println("Enter user name: ");
					String name = sc.next();
					
					System.out.println("Enter user date of birth: ");
					String dob = sc.next();
					
					System.out.println("Enter user date of joining: ");
					String doj = sc.next();
					
					Student st = new Student(name , dob , doj) ;
					
					boolean ans = StudentDao.insert(st);
							
					if(ans)
					{
						System.out.println("Student inserted successfully");
					}
					else{
						System.out.println("Somethong wents wrong try again"); 
					}
					System.out.println(st);
					
					break;
					
				case 2:
					System.out.println("Enter Student no/id for delete data: ");
					int id = sc.nextInt();
					boolean del= StudentDao.delete(id);
					if(del)
					{
						System.out.println("Student deleted.......");
					}
					else {
						System.out.println("Something went Wrong...");
					}
					break;
				case 3:
						StudentDao.display();
					break;
				case 4: System.out.println("Thank you for using my application");
					break;
				default: System.out.println("Invlid choice !!!");
					break;
				}
				
				if(c==4) {
					break;
				}
				
			}
		}
		
	System.out.println("Thank you for using my application");
	System.out.println("See you soon...");	
	}
	
}
