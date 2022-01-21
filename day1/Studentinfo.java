package week3.day1;

public class Studentinfo {

		public void getStudentInfo(int id)
		{
			System.out.println("Student ID is: "+id);
		}
		public void getStudentInfo(int id,String name)
		{
			System.out.println("Student ID is: "+id);
			System.out.println("Student name is: "+name);
		}
		public void getStudentInfo(String email, long phone)
		{
			System.out.println("Student email is: "+email);
			System.out.println("Student Phone Number is: "+phone);
		}
		
		public static void main(String[] args) 
		{
			Studentinfo stu = new Studentinfo();
			stu.getStudentInfo(82523);
			stu.getStudentInfo(82523, "vigneshsekar");
			stu.getStudentInfo("vigneshsz119@gmail.com", 9101891902L);
		}


}
