package Students;


import java.util.ArrayList;

import java.awt.List;
import java.awt.*;
import java.util.*;


import Students.Student;

public class University 

{
	public String name;
	
	public  Integer year_of_foundation;

    private Student student;

	//private Object object;

	
	//ArrayList<Student> list = new ArrayList<Student>();

	

	//private String Lista_studenti =  null;
	
	
	//students = new ArrayList<>();
  
	public University(){}
	public University(String name, Integer year_of_foundation, Student student)
	{
		this.name = name;
		this.year_of_foundation = year_of_foundation;
this.student  =  student;


	}
	
		
				
	
	//public University(String name2, int year_of_foundation2, Student s1) {
		// TODO Auto-generated constructor stub
	//}
	public String getName()
	{
		return name;
	}
	public Integer getYear_Of_Foundation()
	{
		return year_of_foundation;
	}
	public void setName(String name)
	{
		
		this.name  = name;
		
	}
	public void setYear_Of_Foundation(Integer year_of_foundation)
	{
		this.year_of_foundation =  year_of_foundation;
	}
	
	
	public Student getStudent()
	{
		
		return getStudent();
		
	}
	public void setStudent(Student student)
	{
		
		this.student = student;
				
	}
	
	@Override
	public String toString() {
		return "University [name=" + name + ", year_of_foundation=" + year_of_foundation + ", student=" + student + "]";
	}
	
	
}