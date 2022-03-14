package springexpressdemo;

public class Student
{
    

	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}

	private String StudentName;
     
    public void displayStudentInfo()
    {
    	System.out.println("student name is :"+StudentName);
    }
}
