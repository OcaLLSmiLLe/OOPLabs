package main;
//import java.awt.List;
import java.util.Scanner;




import java.util.List;

import Students.Student;
import Students.University;
import java.util.ArrayList;
public class Main
{
public static void main(String[] args)
{
     
     Student s1 = new Student();
s1.setName( "Danut");
s1.setAge(13);
s1.setMark(10);
Student s2 =  new Student();
s2.setName("Vasea");
s2.setAge(20);
s2.setMark(3);
Student s3 = new Student();
s3.setName("DUmitru");
s3.setAge(23);
s3.setMark(5);
     System.out.println("Numele studentului: "+ s1.getName()+ "\n");
     System.out.println("Virsta studentului: "+ s1.getAge()+ "\n");
     System.out.println("Nota studentului: " + s1.getMark()+ " \n" );
     University u1 = new University();
     u1.setName("Universitatea Tehnica a Moldovei");
     u1.setYear_Of_Foundation(1945);
     
     System.out.println("\n");
System.out.println("Numele universitatii :" + u1.getName() + "\n");
System.out.println("Anul fondarii: "+ u1.getYear_Of_Foundation() + "\n");
University u2 = new University("USM", 1945, s1);
System.out.println("Univeristatea 2: " + u2);

}


}
