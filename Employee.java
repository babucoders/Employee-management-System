import java.util.Scanner;
interface data
{
	int[] salary= {20000,30000,40000};
	String[] des= {"Clerk work","Software developer","Project manager"};
}
class Clerk implements data
{
	int age;
	String name;
	Scanner a=new Scanner(System.in);
	void addclerk()
	{
		System.out.println("Enter the name");
		name=a.nextLine();
		a.nextLine();
		System.out.print("Enter the age");
		age=a.nextInt();
	}
	void displayclerk()
	{
		System.out.println("Clerk Name is :" +name);
		System.out.println("Clerk Age is :" +age);
		System.out.println("Clerk Salary is :"+salary[0]);
		System.out.println("Clerk Designation is :" +des[0]);
	}
}
class Developer implements data
{
	int age;
	String name;
	Scanner b=new Scanner(System.in);
	void adddeveloper()
	{
		System.out.println("Enter the name");
		name=b.nextLine();
		b.nextLine();
		System.out.print("Enter the age");
		age=b.nextInt();
		//b.close();
	}
	void displaydeveloper()
	{
		System.out.println("Developer Name is :" +name);
		System.out.println("Developer Age is :" +age);
		System.out.println("Developer Salary is :"+salary[1]);
		System.out.println("Developer Designation is :" +des[1]);
	}
}
class Manager implements data
{
	int age;
	String name;
	Scanner c=new Scanner(System.in);
	void addmanager()
	{
		System.out.println("Enter the name");
		name=c.nextLine();
		c.nextLine();
		System.out.print("Enter the age");
		age=c.nextInt();
		//c.close();
	}
	void displaymanager()
	{
		System.out.println("Manager Name is :" +name);
		System.out.println("Manager Age is :" +age);
		System.out.println("Manager Salary is :"+salary[2]);
		System.out.println("Manager Designation is :" +des[2]);
	}
}
public class Employee {

	public static void main(String[] args) {
		Clerk cl=new Clerk();
		Developer dl=new Developer();
		Manager ml=new Manager();
		Scanner scan=new Scanner(System.in);
		int choice,ch1,ch2;
		boolean exit=false;
		while(!exit)
		{
		// TODO Auto-generated method stub
		System.out.println("Information system");
		System.out.println("1.Create\n2.Display\n3.Exit");
		System.out.println("Enter your choice");
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:System.out.println("1.Clerk\n2.Developer\n3.Manager\n4.Exit");
			   System.out.println("Enter your choice");
			   ch1=scan.nextInt();
			   switch(ch1)
			   {
			   case 1:cl.addclerk();
			           break;
			   case 2: dl.adddeveloper();
			          break;
			   case 3: ml.addmanager();
			   	      break;
			   case 4: System.exit(0);
			           break;
			   default:System.out.println("Invalid choice");
			           break;
			   }
			   break;
		case 2:System.out.println("1.Clerk\n2.Developer\n3.Manager\n4.Exit");
		        System.out.println("Enter your choice");
		        ch2=scan.nextInt();
		        switch(ch2)
		        {
		        case 1:cl.displayclerk();
		                break;
		        case 2: dl.displaydeveloper();
		                break;
		        case 3: ml.displaymanager();
		   	            break;
		        case 4: System.exit(0);
		                break;
		        default:System.out.println("Invalid choice");
		           break;
		        }
		        break;
		case 3:System.exit(0);
		       break;
		default:System.out.println("Invalid choice");
		break;
		}
		}scan.close();
	}
}
