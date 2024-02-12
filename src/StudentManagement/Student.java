package StudentManagement;
//purely encapsulated class
public class Student {
	private int sId;
	private String sname;
	private int age;
	//basic student details
	//getters -return thevalue
	//setters set the value
	
	
	public void setsId(int sId)
	{
		this.sId=sId;
	}
	public Student() {
		super();
		
	}
	public int getsId()
	{
		return sId;
	}
	
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public String getSname()
	{
		return sname;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sname=" + sname + ", age=" + age + "]";
	}
	public Student(int sId, String sname, int age) {
		super();
		this.sId = sId;
		this.sname = sname;
		this.age = age;
	}
  

}
