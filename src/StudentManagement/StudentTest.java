package StudentManagement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	static Scanner sc=new Scanner(System.in); //make this scanner as static so that can be utilised from any where
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
        List<Student> studentList=new ArrayList<Student>();
       //here we have created studentlist arraylist object for temprory storage
        //globally use in all case bascilly input data of each object
       
		while(true)
		{
			System.out.println("\tSTUDENT PROJECT MANAGEMENT SYSTEM");
			System.out.println("====================================");
		    System.out.println("1.Add student"
		    		+ "\n2.Update student"
		    		+ "\n3.Display all student"
		    		+ "\n4.Delete the student"
		    		+ "\n5.Exit");
		    System.out.println("please select the operation: ");
		    int option=sc.nextInt();
		    //switch case for particular operation
		    //all method are static so we are calling using class name
		    switch(option) 
		    {
		    case 1:
		    {
		    	//add left to right assignment so method call new data insert left student onject and passed to add method as parameter
		    	//storinf data in my student collection
		    	Student student = StudentUtility.addStudent();
		    	studentList.add(student); //adding in studentList arraylist object
		    	System.out.println("Student data added successfully");
		    	break;
		    }
		    case 2:
		    {
		    	//update student
		    	StudentUtility.updateStudent(studentList);
		        break;
		    }
		    case 3:
		    {
		      //display student
		    	StudentUtility.displayAllStudent(studentList);
		    	break; 
		    }
		    case 4:
		    {
		    	//delete student
		    	System.out.println("delete the student option is proceed?");
		    	System.out.println("enter the studentId: ");
		    	int id=sc.nextInt();
		    	//passes this id as parameter inside detlete method below
		    	StudentUtility.deleteStudent(studentList, id);
		    	System.out.println("the student details deleted successfully");
		    	break;
		    }
		    case 5:
		    {
		    	//stop the program execution
		    	System.exit(0);
		    	break;
		    }
		    default:
		    	System.err.println("please enter correct option");  //typically used for printing error messages System.err is io stream
		    
		   }
		}
	}

}
