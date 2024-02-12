package StudentManagement;
import java.util.Iterator;
import java.util.List; //importinf list
import java.util.Scanner;//look to understand the entire thing do not import whole

public class StudentUtility {
    static Scanner sc=new Scanner(System.in); //it should static because all our methods are static and it is rule  that static methods cannot access the non  static things
  //1.add student
	public static Student addStudent()
	{
		
		Student s=new Student();
		System.out.print("please enter the student id");
		s.setsId(sc.nextInt()); //integer input sc.nextInt()
		System.out.print("enter student name");
		//String name=sc.nextLine();
		s.setSname(sc.next());
		System.out.print("please enter student age");
		s.setAge(sc.nextInt());
		return s;
	}
	//2.update student details
	//here we have passed parameter as list because have created arraylist for storage
	public static void updateStudent(List <Student> students )
	{
		System.out.println("please enter the NEW SID");
		int id=sc.nextInt();
		System.out.println("enter new name");
		String name=sc.next();
		System.out.println("please enter new Age");
		int age=sc.nextInt();
		
		//done the changes in actual details
		//use for each loop  //iterate students list
		int count=0;
		for(Student s: students)
		{
			//int count=0;
			if(id==s.getsId())
			{
 				//update the information
				break;
			}
			count++;
		}
		//here there is no error when we use setSname and setAge in static update method???
		//reason is update method is working on student class list obj in parameter thats why it is allowed to use
		students.get(count).setSname(name); //get(index) is list method returns the object at that object we need to set the new object
		students.get(count).setAge(age);
		
	}
	//3.display a student
	//inorder to display the student object we simply need to send list of student object
    //sending list named students in the list format having student objects s
	//hasNext() is boolean method returns true if there exist element in collection
	public static void displayAllStudent(List<Student> students)
	{ //normal iterator on list object students
		//METHOD 1
		//for(Iterator iterator=students.iterator();iterator.hasNext();)
		//{ 
			//Student student=(Student)iterator.next();  //next() method returns the next object prsent in collection
			 
		//}
		//METHOD 2 by creating simple iterator object
		//here students is list
		//here Student is object
		//here studentIterator is our iterator which will iterate list students
		Iterator <Student> studentIterator=students.iterator();
		while(studentIterator.hasNext())
		{
			System.out.println(studentIterator.next().toString());
		}
		
	}
	//4.Delete student
	public static void deleteStudent(List<Student> students,int sid)
	{
		//sId object will be deleted
		Iterator<Student> studentIterator=students.iterator();
		while(studentIterator.hasNext())
		{
			Student s= studentIterator.next();
			if(s.getsId()==sid)
			{
				studentIterator.remove();
			}
		}
	}
}
